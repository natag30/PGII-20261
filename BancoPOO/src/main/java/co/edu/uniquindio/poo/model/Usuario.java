package co.edu.uniquindio.poo.model;

import co.edu.uniquindio.poo.model.CuentasBancarias.Cuenta;

import java.util.ArrayList;
import java.util.List;

public class Usuario {
    private String nombre;
    private int id;
    private int telefono;
    private String direccion;
    private String fechaNacimiento;

    private List<Cuenta> listCuentasUsuario;

    public Usuario(String nombre, int id, int telefono, String direccion, String fechaNacimiento) {
        this.nombre = nombre;
        this.id = id;
        this.telefono = telefono;
        this.direccion = direccion;
        this.fechaNacimiento = fechaNacimiento;

        this.listCuentasUsuario = new ArrayList<Cuenta>();
    }
}
