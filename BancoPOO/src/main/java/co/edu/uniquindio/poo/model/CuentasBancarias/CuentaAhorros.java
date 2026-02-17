package co.edu.uniquindio.poo.model.CuentasBancarias;

import co.edu.uniquindio.poo.model.Usuario;

public class CuentaAhorros extends Cuenta{
    private static final double TASA_ANUAL = 3.6;
    private static final double SALDO_MINIMO = 100000;

    public CuentaAhorros(String numeroCuenta, Usuario titular, double saldo, String fechaApertura, Estado estado) {
        super(numeroCuenta, titular, saldo, fechaApertura, estado);
    }

    @Override
    public void depositar(double cantidad) {

    }


    @Override
    public void retirar(double cantidad) {
        if(estado==Estado.ACTIVA && saldo - cantidad >= SALDO_MINIMO) {
            saldo -= cantidad;
            System.out.println("Retiro exitoso. Nuevo saldo: " + saldo);
        } else {
            System.out.println("el saldo no puede quedar por debajo de 100,000");
        }

    }

    public void aplicarInteresesMensual() {
        if (estado == Estado.ACTIVA) {
            double intereses = saldo * (TASA_ANUAL / 12 / 100);
            saldo+= intereses;
            System.out.println("Intereses aplicados"+ intereses+ "Nuevo saldo: " + saldo);
        }
        else {
            System.out.println("No se pueden aplicar intereses: cuenta no activa");
        }
    }
}
