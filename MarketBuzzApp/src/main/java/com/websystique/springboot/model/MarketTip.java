package com.websystique.springboot.model;

import java.io.Serializable;
import java.text.DecimalFormat;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import org.hibernate.validator.constraints.NotEmpty;

@Entity
@Table(name = "MARKET_TIP")
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

	@Column(name = "DURATION", nullable = false)
	private String duration;

	@Column(name = "CALLDATE", nullable = false)
	private String callDate;

	@Column(name = "STATUS", nullable = false)
	private String status;

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
		return currentPrice;
	}

	public void setCurrentPrice(Double currentPrice) {
		this.currentPrice = currentPrice;
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
		if (getCurrentPrice() >= getTargetPrice()) {
			tempStatus = "Target Met";
		}
		return tempStatus;
	}

	public void setStatus(String status) {
		String tempStatus = status;
		if (getCurrentPrice() >= getTargetPrice()) {
			tempStatus = "Target Met";
		}
		this.status = tempStatus;
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
		if (stopLoss != null ? !stopLoss.equals(marketTip.stopLoss) : marketTip.stopLoss != null)
			return false;
		if (duration != null ? !duration.equals(marketTip.duration) : marketTip.duration != null)
			return false;
		if (callDate != null ? !callDate.equals(marketTip.callDate) : marketTip.callDate != null)
			return false;
		if (status != null ? !status.equals(marketTip.status) : marketTip.status != null)
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
		result = 31 * result + (duration != null ? duration.hashCode() : 0);
		result = 31 * result + (callDate != null ? callDate.hashCode() : 0);
		result = 31 * result + (status != null ? status.hashCode() : 0);
		temp = Double.doubleToLongBits(targetPrice);
		result = 31 * result + (int) (temp ^ (temp >>> 32));
		return result;
	}

	@Override
	public String toString() {
		return "MarketTip [id=" + id + ", name=" + name + ", callType=" + callType + ", triggerPrice=" + triggerPrice
				+ ", currentPrice=" + currentPrice + ", profit=" + profit + ", targetPrice=" + targetPrice
				+ ", stopLoss=" + stopLoss + ", duration=" + duration + ", callDate=" + callDate + "]";
	}

}
