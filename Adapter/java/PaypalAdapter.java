package Adapter.java;

public class PaypalAdapter implements PaymentGateway {

    private final Paypal paypal;

    public PaypalAdapter() {
        this.paypal = new Paypal();
    }

    @Override
    public void processPayment(DefaultPayment payment) {
        double parsedAmount = payment.amountInCents * 1.0 / 100.0;
        paypal.sendPayment(parsedAmount);
    }
}
