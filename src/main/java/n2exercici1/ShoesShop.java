package n2exercici1;

public class ShoesShop {
		
	public void purchaseShoes(Payment paymentMethod) {
		
		Gateway paymentGateway = new Gateway();
		
		PaymentCallback paymentCallback = (success) -> {
				if(success) {
					System.out.println("Payment successful");
				}else {
					System.out.println("An error has ocurred. Please try again.");
				}	
			};
			
		//Process payment through the gateway
		paymentGateway.processPayment(paymentMethod, paymentCallback);
	}
}
