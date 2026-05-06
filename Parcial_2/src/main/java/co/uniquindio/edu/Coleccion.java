package co.uniquindio.edu;

import java.util.ArrayList;
import java.util.List;

public class Coleccion implements Recurso{

    private List<Recurso> coleccion = new ArrayList<>();

    public void agregarRecurso(Recurso recurso){
        coleccion.add(recurso);
    }

    @Override
    public double calcularTamaño() {
        double totalTamaño = 0;
        for (Recurso recurso : coleccion) {
            totalTamaño += recurso.calcularTamaño();
        }
        return totalTamaño;
    }

}
