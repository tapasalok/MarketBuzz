package com.websystique.springboot.model;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.Serializable;
import java.net.MalformedURLException;
import java.net.URL;
import java.net.URLConnection;
import java.text.DecimalFormat;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import org.apache.commons.lang3.StringUtils;
import org.hibernate.validator.constraints.NotEmpty;
import org.json.JSONArray;
import org.json.JSONObject;

import com.websystique.springboot.util.Constants;

@Entity
@Table(name = "MARKET_TIP_06_03_2018")
public class MarketTip implements Serializable {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;

	@NotEmpty
	@Column(name = "NAME", nullable = false)
	private String name;

	@NotEmpty
	@Column(name = "CALLTYPE", nullable = false)
	private String callType;

	@Column(name = "TRIGGERPRICE", nullable = false)
	private Double triggerPrice;

	@Column(name = "CURRENTPRICE", nullable = false)
	private Double currentPrice;

	@Column(name = "TARGETPRICE", nullable = false)
	private Double targetPrice;

	@Column(name = "STOPLOSS", nullable = false)
	private Double stopLoss;

	@Column(name = "PROFIT", nullable = true)
	private Double profit;

	@Column(name = "DAYHIGH", nullable = true)
	private Double dayHigh;

	@Column(name = "DURATION", nullable = false)
	private String duration;

	@Column(name = "CALLDATE", nullable = false)
	private String callDate;

	@Column(name = "STATUS", nullable = false)
	private String status;

	@Column(name = "REALTIME", nullable = false)
	private String realTime;

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getCallType() {
		return callType;
	}

	public void setCallType(String callType) {
		this.callType = callType;
	}

	public void setTriggerPrice(Double triggerPrice) {
		this.triggerPrice = triggerPrice;
	}

	public Double getStopLoss() {
		return stopLoss;
	}

	public void setStopLoss(Double stopLoss) {
		this.stopLoss = stopLoss;
	}

	public String getDuration() {
		return duration;
	}

	public void setDuration(String duration) {
		this.duration = duration;
	}

	public String getCallDate() {
		return callDate;
	}

	public void setCallDate(String callDate) {
		this.callDate = callDate;
	}

	public void setTargetPrice(Double targetPrice) {
		this.targetPrice = targetPrice;
	}

	public Double getTriggerPrice() {
		return triggerPrice;
	}

	public Double getTargetPrice() {
		return targetPrice;
	}

	public Double getCurrentPrice() {
		Double currentPriceBackUp = currentPrice;
		try {
			if ("Active".equalsIgnoreCase(this.status) && "Y".equalsIgnoreCase(this.realTime)) {
				getStockPriceFromNSEAndSQual(getName());
			}
		} catch (Exception e) {
			// TODO: handle exception
			currentPrice = currentPriceBackUp;
		}
		return currentPrice;
	}

	public void setCurrentPrice(Double currentPrice) {
		this.currentPrice = currentPrice;
	}

	private void getStockPriceFromNSEAndSQual(String quoteName) {
		// Make a URL to the web page
		String currentPriceFromNSE = null;
		URLConnection con = null;
		InputStream is = null;

		BufferedReader br = null;
		try {
			URL url;
			String line = null;

			url = new URL("https://www.nseindia.com/live_market/dynaContent/live_watch/get_quote/GetQuote.jsp?symbol="
					+ quoteName);

			// Get the input stream through URL Connection
			con = url.openConnection();
			is = con.getInputStream();

			br = new BufferedReader(new InputStreamReader(is));

			// read each line and write to System.out
			while ((line = br.readLine()) != null) {
				// System.out.println(line);
				currentPriceFromNSE = currentPriceFromNSE + "\n" + line;
			}

			int firstIndexDayHigh = currentPriceFromNSE.indexOf("\",\"dayHigh\":\"");
			int endIndexDayHigh = currentPriceFromNSE.indexOf("\",\"exDate\":\"");
			String dayHighString = currentPriceFromNSE.substring(firstIndexDayHigh + 13, endIndexDayHigh);

			if (!StringUtils.isEmpty(dayHighString)) {
				dayHighString = dayHighString.replaceAll(",", "");
				setDayHigh(Double.parseDouble(dayHighString));
			}

			int firstIndex = currentPriceFromNSE.indexOf(",\"lastPrice\":\"");
			int endIndex = currentPriceFromNSE.indexOf("\",\"pChange\":\"");
			currentPriceFromNSE = currentPriceFromNSE.substring(firstIndex + 14, endIndex);

			if (!StringUtils.isEmpty(currentPriceFromNSE)) {
				currentPriceFromNSE = currentPriceFromNSE.replaceAll(",", "");
				setCurrentPrice(Double.parseDouble(currentPriceFromNSE));
			}
		} catch (MalformedURLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			getCurrentFromQual(quoteName);
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			getCurrentFromQual(quoteName);
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			getCurrentFromQual(quoteName);
		}finally{
			try {
				br.close();
				is.close();
				con = null;
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	}

	public void getCurrentFromQual(String quoteName) {
		// Make a URL to the web page
		String returnLine = "";
		String line = null;
		URLConnection con = null;
		InputStream is = null;
		BufferedReader br = null;
		try {
			URL url;
			url = new URL("https://www.quandl.com/api/v3/datasets/NSE/" + quoteName
					+ ".json?api_key="+Constants.SQUAL_API_KEY+"&limit=1");

			// Get the input stream through URL Connection
			con = url.openConnection();
			is = con.getInputStream();

			br = new BufferedReader(new InputStreamReader(is));

			// read each line and write to System.out
			while ((line = br.readLine()) != null) {
				// System.out.println(line);
				returnLine = returnLine + "\n" + line;
			}

			JSONObject obj = new JSONObject(returnLine);
			JSONObject jsonObject = obj.getJSONObject("dataset");

			JSONArray arr = jsonObject.getJSONArray("data");

			JSONArray array = arr.getJSONArray(0);

			setDayHigh(array.getDouble(2));

			setCurrentPrice(array.getDouble(4));

		} catch (MalformedURLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();

		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();

		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}finally{
			try {
				br.close();
				is.close();
				con = null;
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			
		}
	}

	public Double getProfit() {
		Double profitValue = 0.0;
		if (getCallType().toLowerCase().contains("sell")) {
			profitValue = ((triggerPrice - currentPrice) / (triggerPrice)) * 100;
		} else {
			profitValue = ((currentPrice - triggerPrice) / (triggerPrice)) * 100;
		}
		DecimalFormat df = new DecimalFormat("#.##");
		profitValue = Double.valueOf(df.format(profitValue));
		return profitValue;
	}

	public void setProfit(Double profit) {
		if (getCallType().toLowerCase().contains("sell")) {
			profit = ((triggerPrice - currentPrice) / (triggerPrice)) * 100;
		} else {
			profit = ((currentPrice - triggerPrice) / (triggerPrice)) * 100;
		}
		DecimalFormat df = new DecimalFormat("#.##");
		profit = Double.valueOf(df.format(profit));
		this.profit = profit;
	}

	public String getStatus() {
		String tempStatus = status;
		if (getCallType().toLowerCase().contains("sell")) {
			if (getCurrentPrice() <= getTargetPrice()) {
				tempStatus = "Target Met";
			}
		} else {
			if (getCurrentPrice() >= getTargetPrice()) {
				tempStatus = "Target Met";
			}
		}
		return tempStatus;
	}

	public void setStatus(String status) {
		String tempStatus = status;
		if (getCallType().toLowerCase().contains("sell")) {
			if (getCurrentPrice() <= getTargetPrice()) {
				tempStatus = "Target Met";
			}
		} else {
			if (getCurrentPrice() >= getTargetPrice()) {
				tempStatus = "Target Met";
			}
		}
		this.status = tempStatus;
	}

	public String getRealTime() {
		return realTime;
	}

	public void setRealTime(String realTime) {
		this.realTime = realTime;
	}

	public Double getDayHigh() {
		// Double dayHighBackUp = dayHigh;
		// try {
		// if ("Active".equalsIgnoreCase(this.status) &&
		// "Y".equalsIgnoreCase(this.realTime)) {
		// String currentPriceFromNSE = getStockDayHigh(getName());
		// currentPrice = Double.parseDouble(currentPriceFromNSE);
		// }
		// } catch (Exception e) {
		// // TODO: handle exception
		// dayHigh = dayHighBackUp;
		// }
		return dayHigh;
	}

	public void setDayHigh(Double dayHigh) {
		this.dayHigh = dayHigh;
	}

	public static String getStockDayHigh(String quoteName) {
		// Make a URL to the web page
		String returnLine = null;
		try {
			URL url;
			String line = null;

			url = new URL("https://www.nseindia.com/live_market/dynaContent/live_watch/get_quote/GetQuote.jsp?symbol="
					+ quoteName + "&illiquid=0&smeFlag=0&itpFlag=0");

			// Get the input stream through URL Connection
			URLConnection con = url.openConnection();
			InputStream is = con.getInputStream();

			BufferedReader br = new BufferedReader(new InputStreamReader(is));

			// read each line and write to System.out
			while ((line = br.readLine()) != null) {
				// System.out.println(line);
				returnLine = returnLine + "\n" + line;
			}

			// System.out.println(returnLine);

			int firstIndex = returnLine.indexOf("\",\"dayHigh\":\"");
			int endIndex = returnLine.indexOf("\",\"exDate\":\"");
			returnLine = returnLine.substring(firstIndex + 13, endIndex);
			returnLine = returnLine.replaceAll(",", "");
		} catch (MalformedURLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();

		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();

		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();

		}

		return returnLine;
	}

	@Override
	public boolean equals(Object o) {
		if (this == o)
			return true;
		if (o == null || getClass() != o.getClass())
			return false;

		MarketTip marketTip = (MarketTip) o;

		if (Double.compare(marketTip.targetPrice, targetPrice) != 0)
			return false;
		if (id != null ? !id.equals(marketTip.id) : marketTip.id != null)
			return false;
		if (name != null ? !name.equals(marketTip.name) : marketTip.name != null)
			return false;
		if (callType != null ? !callType.equals(marketTip.callType) : marketTip.callType != null)
			return false;
		if (triggerPrice != null ? !triggerPrice.equals(marketTip.triggerPrice) : marketTip.triggerPrice != null)
			return false;
		if (currentPrice != null ? !currentPrice.equals(marketTip.currentPrice) : marketTip.currentPrice != null)
			return false;
		if (profit != null ? !profit.equals(marketTip.profit) : marketTip.profit != null)
			return false;
		if (dayHigh != null ? !dayHigh.equals(marketTip.dayHigh) : marketTip.dayHigh != null)
			return false;
		if (stopLoss != null ? !stopLoss.equals(marketTip.stopLoss) : marketTip.stopLoss != null)
			return false;
		if (duration != null ? !duration.equals(marketTip.duration) : marketTip.duration != null)
			return false;
		if (callDate != null ? !callDate.equals(marketTip.callDate) : marketTip.callDate != null)
			return false;
		if (status != null ? !status.equals(marketTip.status) : marketTip.status != null)
			return false;
		if (realTime != null ? !realTime.equals(marketTip.realTime) : marketTip.realTime != null)
			return false;
		return true;
	}

	@Override
	public int hashCode() {
		int result;
		long temp;
		result = id != null ? id.hashCode() : 0;
		result = 31 * result + (name != null ? name.hashCode() : 0);
		result = 31 * result + (callType != null ? callType.hashCode() : 0);
		result = 31 * result + (triggerPrice != null ? triggerPrice.hashCode() : 0);
		result = 31 * result + (stopLoss != null ? stopLoss.hashCode() : 0);
		result = 31 * result + (currentPrice != null ? currentPrice.hashCode() : 0);
		result = 31 * result + (profit != null ? profit.hashCode() : 0);
		result = 31 * result + (dayHigh != null ? dayHigh.hashCode() : 0);
		result = 31 * result + (duration != null ? duration.hashCode() : 0);
		result = 31 * result + (callDate != null ? callDate.hashCode() : 0);
		result = 31 * result + (status != null ? status.hashCode() : 0);
		result = 31 * result + (realTime != null ? realTime.hashCode() : 0);
		temp = Double.doubleToLongBits(targetPrice);
		result = 31 * result + (int) (temp ^ (temp >>> 32));
		return result;
	}

	@Override
	public String toString() {
		return "MarketTip [id=" + id + ", name=" + name + ", callType=" + callType + ", triggerPrice=" + triggerPrice
				+ ", currentPrice=" + currentPrice + ", profit=" + profit + ", targetPrice=" + targetPrice
				+ ", stopLoss=" + stopLoss + ", duration=" + duration + ", callDate=" + callDate + ", status=" + status
				+ ", realTime=" + realTime + ", dayHigh=" + dayHigh + "]";
	}

}
