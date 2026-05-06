package co.uniquindio.edu.Decorator;

import co.uniquindio.edu.Recurso;

public class Compresion extends RecursoDecorator{

    private double factorCompresion;

    public Compresion(Recurso recurso, double factorCompresion) {
        super(recurso);
        this.factorCompresion = factorCompresion;
    }

    @Override
    public double calcularTamaño() {
        return recurso.calcularTamaño() * factorCompresion;
    }

    public double getFactorCompresion() {
        return factorCompresion;
    }

}
