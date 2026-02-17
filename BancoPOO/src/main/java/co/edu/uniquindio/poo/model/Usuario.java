package co.edu.uniquindio.poo.model;

import co.edu.uniquindio.poo.model.CuentasBancarias.Cuenta;

import java.util.ArrayList;
import java.util.List;

public class Usuario {
    private String nombre;
    private long id;
    private long telefono;
    private String direccion;
    private String fechaNacimiento;

    private List<Cuenta> listCuentasUsuario;

    public Usuario(String nombre, long id, long telefono, String direccion, String fechaNacimiento) {
        this.nombre = nombre;
        this.id = id;
        this.telefono = telefono;
        this.direccion = direccion;
        this.fechaNacimiento = fechaNacimiento;
        this.listCuentasUsuario = new ArrayList<>();
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public long getTelefono() {
        return telefono;
    }

    public void setTelefono(long telefono) {
        this.telefono = telefono;
    }

    public String getDireccion() {
        return direccion;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    public String getFechaNacimiento() {
        return fechaNacimiento;
    }

    public void setFechaNacimiento(String fechaNacimiento) {
        this.fechaNacimiento = fechaNacimiento;
    }

    public List<Cuenta> getListCuentasUsuario() {
        return listCuentasUsuario;
    }

    public void setListCuentasUsuario(List<Cuenta> listCuentasUsuario) {
        this.listCuentasUsuario = listCuentasUsuario;
    }

    public void agregarCuenta(Cuenta cuenta) {
        listCuentasUsuario.add(cuenta);
        System.out.println("Se agregó la cuenta " + cuenta.getNumeroCuenta() + " al usuario " + nombre);
    }

    public void mostrarCuentas() {
        System.out.println("Cuentas bancarias de " + nombre + ":");
        for (Cuenta cuenta : listCuentasUsuario) {
            cuenta.mostrarInformacion();
        }
    }

}
