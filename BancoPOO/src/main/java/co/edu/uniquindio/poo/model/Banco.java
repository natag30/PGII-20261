package co.edu.uniquindio.poo.model;

import co.edu.uniquindio.poo.model.CuentasBancarias.Cuenta;

import java.util.ArrayList;
import java.util.List;

public class Banco {
    private String nombre;
    private int id;
    private String direccion;
    private int telefono;

    private List<Usuario> listUsuarios;
    private List<Cuenta> listCuentas;

    public  Banco(String nombre, int id, String direccion, int telefono) {
        this.nombre = nombre;
        this.id = id;
        this.direccion = direccion;
        this.telefono = telefono;
        listUsuarios = new ArrayList<Usuario>();
        listCuentas = new ArrayList<Cuenta>();
    }
}
