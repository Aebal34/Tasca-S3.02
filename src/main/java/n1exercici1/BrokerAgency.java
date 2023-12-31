package n1exercici1;

public class BrokerAgency implements IObserver{

	private Broker broker;
	private double stockExchangeValue;
	
	public BrokerAgency(Broker broker) {
		this.broker = broker;
		stockExchangeValue = 0;
	}

	@Override
	public void update() {
		stockExchangeValue = broker.getStockExchangeValue(); 		
	}
	
	public double getStockExchangeValue() {
		return stockExchangeValue;
	}
}
