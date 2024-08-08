package paymentGWDIP;

public class Payment {

    public void makeTransaction(){
        String cardNo = "1234567899990000";
        String expiry = "12/12";
        int cvv = 123;
        int otp = 7890;
        double amount = 100.45;
        PaymentGateway paymentGateway = null;

        double makeDecision = Math.random() * 10;
        if(makeDecision <= 5){
            // razorpay
            paymentGateway = new Razorpay();
        } else {
            paymentGateway = new Juspay();
        }

        String result = paymentGateway.doPaymentFromGateway(cardNo, expiry, amount, cvv, otp);
        System.out.println(result);
    }

}
