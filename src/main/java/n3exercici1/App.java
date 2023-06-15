package n3exercici1;

public class App {

	public static void main(String[] args) {

		//We instantiate some varibles to play with
		double tvPrice = 499.99;
		double sofaPrice = 1389.79;
		ConverterInjector injector = null;
		Display display = null;
		
		//Convert tv and sofa to usd
		injector = new EuroUsdInjector();
		display = injector.getDisplay();
		display.showConvertedPrice(tvPrice);
		display.showConvertedPrice(sofaPrice);
		
		//Convert tv and sofa to euro
		injector = new UsdEuroInjector();
		display = injector.getDisplay();
		display.showConvertedPrice(tvPrice);
		display.showConvertedPrice(sofaPrice);
	}
}
