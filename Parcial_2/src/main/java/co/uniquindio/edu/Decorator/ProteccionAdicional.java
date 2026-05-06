package co.uniquindio.edu.Decorator;

import co.uniquindio.edu.Recurso;

public class ProteccionAdicional extends RecursoDecorator{

    private String nivelProteccion;

    public ProteccionAdicional(Recurso recurso, String nivelProteccion) {
        super(recurso);
        this.nivelProteccion = nivelProteccion;
    }

    @Override
    public double calcularTamaño() {
        return recurso.calcularTamaño() + 0.2;
    }

    public String getNivelProteccion() {
        return nivelProteccion;
    }

}
