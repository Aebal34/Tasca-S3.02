package n1exercici1;

import java.util.*;

public class StockExchange implements IObservable{

	private double value;
	private static StockExchange stockExchange = null;
	private List<IObserver> brokers = new ArrayList<IObserver>();
	
	private StockExchange() {
		value = 0;
	}
	
	public static StockExchange getInstance() {
		if(stockExchange == null) {
			stockExchange = new StockExchange(); 
		}
		return stockExchange;
	}
	
	public double getValue() {
		return value;
	}
	
	public void increaseValue() {
		value += Math.random()*5;
	}
	public void decreaseValue() {
		value -= Math.random()*5;
	}

	@Override
	public void add(IObserver observer) {
		brokers.add(observer);
	}

	@Override
	public void remove(IObserver observer) {
		brokers.remove(observer);
	}

	@Override
	public void notifyObservers() {
		for(IObserver broker : brokers) {
			broker.update();
		}
	}
}
