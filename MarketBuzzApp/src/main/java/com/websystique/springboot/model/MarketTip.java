package com.websystique.springboot.model;

import org.hibernate.validator.constraints.NotEmpty;

import javax.persistence.*;
import java.io.Serializable;

@Entity
@Table(name="MARKET_TIP")
public class MarketTip implements Serializable{

	@Id
	@GeneratedValue(strategy= GenerationType.IDENTITY)
	private Long id;

	@NotEmpty
	@Column(name="NAME", nullable=false)
	private String name;

	@NotEmpty
	@Column(name="CALLTYPE", nullable=false)
	private String callType;
	
	@Column(name="TRIGGERPRICE", nullable=false)
	private Double triggerPrice;

	@Column(name="TARGETPRICE", nullable=false)
	private Double targetPrice;

	@Column(name="STOPLOSS", nullable=false)
	private Double stopLoss;
	
	@Column(name="DURATION", nullable=false)
	private String duration;
	
	@Column(name="CALLDATE", nullable=false)
	private String callDate;
	
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

	@Override
	public boolean equals(Object o) {
		if (this == o) return true;
		if (o == null || getClass() != o.getClass()) return false;

		MarketTip marketTip = (MarketTip) o;

		if (Double.compare(marketTip.targetPrice, targetPrice) != 0) return false;
		if (id != null ? !id.equals(marketTip.id) : marketTip.id != null) return false;
		if (name != null ? !name.equals(marketTip.name) : marketTip.name != null) return false;
		if (callType != null ? !callType.equals(marketTip.callType) : marketTip.callType != null) return false;
		if (triggerPrice != null ? !triggerPrice.equals(marketTip.triggerPrice) : marketTip.triggerPrice != null) return false;
		if (stopLoss != null ? !stopLoss.equals(marketTip.stopLoss) : marketTip.stopLoss != null) return false;
		if (duration != null ? !duration.equals(marketTip.duration) : marketTip.duration != null) return false;
		if (callDate != null ? !callDate.equals(marketTip.callDate) : marketTip.callDate != null) return false;
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
		result = 31 * result + (duration != null ? duration.hashCode() : 0);
		result = 31 * result + (callDate != null ? callDate.hashCode() : 0);
		temp = Double.doubleToLongBits(targetPrice);
		result = 31 * result + (int) (temp ^ (temp >>> 32));
		return result;
	}

	@Override
	public String toString() {
		return "MarketTip [id=" + id + ", name=" + name+ ", callType=" + callType + ", triggerPrice=" + triggerPrice
				+ ", targetPrice=" + targetPrice + ", stopLoss=" + stopLoss +", duration=" + duration +", callDate=" + callDate +"]";
	}


}
