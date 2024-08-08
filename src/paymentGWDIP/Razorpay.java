package paymentGWDIP;

public class Razorpay implements PaymentGateway {
    // original
    public int doPayment(
            String cardNo,
            String expiry,
            int cvv,
            int otp,
            int amount){
        return 0;
        // 0 - failure
        // 1 - success
        // 2 - in progress
    }

    @Override
    public String doPaymentFromGateway(String cardNo, String expiry, double amount, int cvv, int otp) {
        int result = doPayment(cardNo, expiry, cvv, otp, (int)amount);
        if(result == 0){
            return "Failure";
        } else if(result == 1){
            return "Success";
        } else {
            return  "IN progress";
        }
    }
}
