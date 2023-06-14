package n1exercici1;

public class App {

	public static void main(String[] args) {
		//We instantiate an Observable and 3 Observers that observe him
		Broker jordanBelfort = new Broker();
		BrokerAgency wallStreet = new BrokerAgency(jordanBelfort);
		BrokerAgency strattonOakmont = new BrokerAgency(jordanBelfort);
		BrokerAgency aerotyne = new BrokerAgency(jordanBelfort);
		
		//We also add the Observable to be an Observer of StockExchange
		StockExchange stockExchange = StockExchange.getInstance();
		stockExchange.add(jordanBelfort);
		//Now we need to add those Observers to the Observable list
		jordanBelfort.add(wallStreet);
		jordanBelfort.add(strattonOakmont);
		jordanBelfort.add(aerotyne);
		
		//Now, everytime StockExchange changes value, Jordan will notify all agencies
		do {
			System.out.println("The stock exchange is at "+stockExchange.getValue());

			if(stockExchange.getValue() == jordanBelfort.getStockExchangeValue()) {
				switch((int)Math.round(Math.random())) {
					case 0:
						stockExchange.increaseValue();
						stockExchange.notifyObservers();
						jordanBelfort.notifyObservers();
						if(jordanBelfort.getStockExchangeValue() == wallStreet.getStockExchangeValue()
								&& jordanBelfort.getStockExchangeValue()==aerotyne.getStockExchangeValue()
								&& jordanBelfort.getStockExchangeValue()==strattonOakmont.getStockExchangeValue()) {
							System.out.println("Agencies have been notified of the increase on the value.");
						}
						break;
					case 1:
						stockExchange.decreaseValue();
						stockExchange.notifyObservers();
						jordanBelfort.notifyObservers();
						if(jordanBelfort.getStockExchangeValue() == wallStreet.getStockExchangeValue()
								&& jordanBelfort.getStockExchangeValue()==aerotyne.getStockExchangeValue()
								&& jordanBelfort.getStockExchangeValue()==strattonOakmont.getStockExchangeValue()) {
							System.out.println("Agencies have been notified of the decrease on the value.");
						}
						break;
					default:
						System.out.println("Something went wrong");
				}
			}
		}while(stockExchange.getValue() >= 0);
		
		System.out.println("The stock exchange is at "+stockExchange.getValue());
		
		System.out.println("Stock exchange has gone under 0");
	}

}
