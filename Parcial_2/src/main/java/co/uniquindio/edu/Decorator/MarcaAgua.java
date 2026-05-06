package co.uniquindio.edu.Decorator;

import co.uniquindio.edu.Recurso;

public class MarcaAgua extends RecursoDecorator{

    private String institucion;

    public MarcaAgua(Recurso recurso, String institucion){
        super(recurso);
        this.institucion=institucion;
    }

    @Override
    public double calcularTamaño() {
        return recurso.calcularTamaño() + 0.1;
    }

    public String getInstitucion(){
        return institucion;
    }

}
