package Adapter.java;

public class MercadoLivreAdapter implements PaymentGateway {

    public final MercadoLivre mercadoLivre;

    public MercadoLivreAdapter() {
        this.mercadoLivre = new MercadoLivre();
    }

    @Override
    public void processPayment(DefaultPayment payment) {
        String amount = String.valueOf(payment.amountInCents);
        this.mercadoLivre.makePayment(amount);
    }
}
