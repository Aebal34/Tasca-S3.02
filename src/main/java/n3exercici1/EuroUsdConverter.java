package n3exercici1;

public class EuroUsdConverter implements Converter{

	@Override
	public double convert(double price) {
		//---get currency price from database
		
		double actualUsdPrice = 1.09;
		
		return price * actualUsdPrice;
	}

}
