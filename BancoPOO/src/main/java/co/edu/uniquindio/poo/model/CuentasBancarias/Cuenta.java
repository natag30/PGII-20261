package co.edu.uniquindio.poo.model.CuentasBancarias;

import co.edu.uniquindio.poo.model.Usuario;

public abstract class Cuenta {
    private String numeroCuenta;
    protected Usuario titular;
    protected double saldo;
    private String fechaApertura;
    protected Estado estado;

    public Cuenta(String numeroCuenta, Usuario titular, double saldo, String fechaApertura, Estado estado) {
        this.numeroCuenta = numeroCuenta;
        this.titular = titular;
        this.saldo = saldo;
        this.fechaApertura = fechaApertura;
        this.estado = estado;
    }



}
