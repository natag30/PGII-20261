package co.uniquindio.edu;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    static void main(String[] args) {

        PaypalAPI paypalAPI = new PaypalAPI();

        ProcesadorPago procesadorPago = new PaypalAdapter(paypalAPI);

        procesadorPago.procesarPago(1000);


    }
}
