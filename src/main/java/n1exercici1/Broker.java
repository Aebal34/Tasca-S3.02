package n1exercici1;
import java.util.*;

public class Broker implements IObservable{

	private List<IObserver> agencies;
	private double stockExchangeValue;
	
	public Broker() {
		this.agencies = new ArrayList<IObserver>();
		stockExchangeValue = StockExchange.getValue();
	}
	
	@Override
	public void add(IObserver observer) {
		agencies.add(observer);		
	}

	@Override
	public void remove(IObserver observer) {
		agencies.remove(observer);
	}

	@Override
	public void notifyObservers() {
		for(IObserver agency : agencies) {
			agency.update();
		}
	}
	
	public double getStockExchangeValue() {
		return stockExchangeValue;
	}
}
