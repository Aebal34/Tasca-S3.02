package n3exercici1;

public class UsdEuroInjector implements ConverterInjector{

	@Override
	public Display getDisplay() {
		return new Display(new UsdEuroConverter());
	}

}
