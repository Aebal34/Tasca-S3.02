package n3exercici1;

public class UsdEuroConverter implements Converter{
	
	@Override
	public double convert(double price) {
		//---get currency price from database
		
		double actualUsdPrice = 0.91;
		
		return price * actualUsdPrice;
	}
}
