package co.uniquindio.edu.Decorator;

import co.uniquindio.edu.Recurso;

public abstract class RecursoDecorator implements Recurso {

    protected Recurso recurso;

    public RecursoDecorator(Recurso recurso){
        this.recurso=recurso;
    }

    @Override
    public double calcularTamaño() {
        return recurso.calcularTamaño();
    }

}
