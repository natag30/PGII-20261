package co.edu.uniquindio.singleton;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {

        CarritoCompras c1 = CarritoCompras.getInstancia();
        CarritoCompras c2 = CarritoCompras.getInstancia();

        c1.agregarProducto("Libro");
        c2.agregarProducto("Cuaderno");

        System.out.println("¿c1 == c2? " + (c1 == c2));

        System.out.println("Productos: " + c1.listar());

        System.out.println("Total: " + c1.getTotal());
    }
}