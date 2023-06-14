package n1exercici1;

public class App {

	public static void main(String[] args) {
		//We instantiate an Observable and 3 Observers that observe him
		Broker jordanBelfort = new Broker();
		BrokerAgency wallStreet = new BrokerAgency(jordanBelfort);
		BrokerAgency strattonOakmont = new BrokerAgency(jordanBelfort);
		BrokerAgency aerotyne = new BrokerAgency(jordanBelfort);
		
		//Now we need to add those Observers to the Observable list
		jordanBelfort.add(wallStreet);
		jordanBelfort.add(strattonOakmont);
		jordanBelfort.add(aerotyne);

	}

}
