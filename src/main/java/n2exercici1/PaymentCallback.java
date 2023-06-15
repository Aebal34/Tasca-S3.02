package n2exercici1;

@FunctionalInterface
public interface PaymentCallback {

	abstract void onTrigger(boolean success);
}
