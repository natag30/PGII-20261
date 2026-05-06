package co.uniquindio.edu.adapter;

import co.uniquindio.edu.Recurso;

public class RecursoAdapter implements Recurso {

    private RecursoExterno recursoExterno;

    public RecursoAdapter(RecursoExterno recursoExterno){
        this.recursoExterno=recursoExterno;
    }

    @Override
    public double calcularTamaño() {
        return Double.parseDouble(recursoExterno.getTamaño());
    }

}
