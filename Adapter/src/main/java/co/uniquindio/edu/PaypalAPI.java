package co.uniquindio.edu;

public class PaypalAPI {

    public void sentPayment(String amount, String currency){
        System.out.println("PayPal: $" + amount + " " + currency);
    }
}
