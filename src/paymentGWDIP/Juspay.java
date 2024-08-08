package paymentGWDIP;

public class Juspay implements PaymentGateway{

    public String makePayment(int amount,
                              String expiry,
                              String cardNo,
                              int cvv,
                              int otp){
        return "SUCCESS";
    }

    @Override
    public String doPaymentFromGateway(String cardNo, String expiry, double amount, int cvv, int otp) {
        String result = makePayment((int)amount, expiry, cardNo, cvv, otp);
        return result;
    }
}
