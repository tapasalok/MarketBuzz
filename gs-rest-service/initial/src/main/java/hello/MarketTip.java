package hello;

public class MarketTip {

	private final int id;
	private final String stockName;
	private final String callType;
	private final String stockTerm;
	private final float executablePrice;
	private final float stopLossPrice;
	private final float targetPrice;
	private final String duration;
	private final String callDate;

	public MarketTip(int id, String stockName, String callType, String stockTerm, float executablePrice,
			float stopLossPrice, float targetPrice, String duration, String callDate) {
		this.id = id;
		this.stockName = stockName;
		this.callType = callType;
		this.stockTerm = stockTerm;
		this.executablePrice = executablePrice;
		this.stopLossPrice = stopLossPrice;
		this.targetPrice = targetPrice;
		this.duration = duration;
		this.callDate = callDate;
	}

	public String getCallDate() {
		return callDate;
	}

	public String getStockTerm() {
		return stockTerm;
	}

	public float getExecutablePrice() {
		return executablePrice;
	}

	public float getStopLossPrice() {
		return stopLossPrice;
	}

	public float getTargetPrice() {
		return targetPrice;
	}

	public String getDuration() {
		return duration;
	}

	public int getId() {
		return id;
	}

	public String getStockName() {
		return stockName;
	}

	public String getCallType() {
		return callType;
	}
}