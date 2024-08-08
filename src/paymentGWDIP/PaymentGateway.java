package paymentGWDIP;

public interface PaymentGateway {
    String doPaymentFromGateway(String cardNo,
                                String expiry,
                                double amount,
                                int cvv,
                                int otp);
}
