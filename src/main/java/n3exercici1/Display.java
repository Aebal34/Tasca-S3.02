package n3exercici1;

public class Display {

	Converter converter;
	
	public Display(Converter cnv) {
		
		this.converter = cnv;
	}
	
	public void showConvertedPrice(double price) {
		
		System.out.println(converter.convert(price));
	}
}
