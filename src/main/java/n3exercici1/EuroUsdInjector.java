package n3exercici1;

public class EuroUsdInjector implements ConverterInjector{

	@Override
	public Display getDisplay() {
		
		return new Display(new EuroUsdConverter());
	}

	
}
