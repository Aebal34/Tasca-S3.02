package n2exercici1;

public class App {

	public static void main(String[] args) {
		
		var querol = new ShoesShop();
		
		querol.purchaseShoes(new CreditCardPayment());
		System.out.println("Doing other things...");
		querol.purchaseShoes(new PaypalPayment());
		System.out.println("Doing other things...");
	}
}
