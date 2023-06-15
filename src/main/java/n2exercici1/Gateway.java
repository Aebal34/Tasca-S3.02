package n2exercici1;

public class Gateway {

	public boolean makePayment(Payment paymentMethod) {
		
		//Implement payment procedures depending on paymentMethod
		
		//Simulate payment "waiting time"
		//try {
			System.out.println("Processing payment...");
			//Thread.sleep(3000);
		//}catch(InterruptedException e) {
			//e.getMessage();
		//}
		
		//Payment success is random
		int paymentSuccess = (int)(Math.random()*9+1);
		return paymentSuccess > 2;
	}
	
	public void processPayment(Payment paymentMethod, PaymentCallback paymentCallback) {
		
		//We build a thread to be able to run the operation while we do others
		Thread paymentThread = new Thread(() -> {
			
			//Any payment processing to be made
			
			//We invoke the callback to notify the result of the operation
			paymentCallback.onTrigger(makePayment(paymentMethod));
		});	
		paymentThread.start();
	}
}
