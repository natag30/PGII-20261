package co.uniquindio.edu;

public class PaypalAdapter implements ProcesadorPago{

    private PaypalAPI paypalAPI;

    public PaypalAdapter(PaypalAPI paypalAPI){
        this.paypalAPI = paypalAPI;
    }


    @Override
    public void procesarPago(double monto) {
        String amount = String.valueOf(monto);
        paypalAPI.sentPayment(amount, "COP");
    }
}