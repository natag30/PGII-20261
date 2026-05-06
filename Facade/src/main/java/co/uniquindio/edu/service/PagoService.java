package co.uniquindio.edu.service;

public class PagoService {

    public boolean procesarPago(double monto, String metodoPago){
        System.out.println("Procesando $" + monto + " con " + metodoPago);
        return true;
    }
}
