package Adapter.java;

public interface PaymentGateway {
    void processPayment(DefaultPayment payment);
}
