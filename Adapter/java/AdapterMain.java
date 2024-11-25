package Adapter.java;

public class AdapterMain {
    public static void main(String[] args) {
        DefaultPayment payment = new DefaultPayment(1000);
        PaypalAdapter paypalAdapter = new PaypalAdapter();

        paypalAdapter.processPayment(payment);
    }
}
