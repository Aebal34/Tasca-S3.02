package n1exercici1;

public class StockExchange {

	private static double value;
	private static StockExchange stockExchange = null;
	
	private StockExchange() {
		value = 0;
	}
	
	public static StockExchange getInstance() {
		if(stockExchange == null) {
			stockExchange = new StockExchange(); 
		}
		return stockExchange;
	}
	
	public static double getValue() {
		return value;
	}
	
	public static void increaseValue() {
		value += Math.random()*5;
	}
	public static void decreaseValue() {
		value -= Math.random()*5;
	}
}
