package co.edu.uniquindio.singleton;

import java.util.ArrayList;
import java.util.List;

public class CarritoCompras {

    private static CarritoCompras instance;
    private ArrayList<String> listaProductos;

    private CarritoCompras() {
        this.listaProductos = new ArrayList<String>();

    }

    public static CarritoCompras getInstancia() {
        if (instance == null) {
            instance = new CarritoCompras();
            System.out.println("Instanciando CarritoCompras");
        }
        return instance;
    }

    public void agregarProducto(String producto) {
        listaProductos.add(producto);
    }

    public ArrayList<String> listar() {
        return listaProductos;
    }

    public int getTotal() {
        return listaProductos.size();
    }
}
