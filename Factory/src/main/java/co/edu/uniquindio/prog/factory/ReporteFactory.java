package co.edu.uniquindio.prog.factory;

import co.edu.uniquindio.prog.reporte.Reporte;

public abstract class ReporteFactory {

    public abstract Reporte crearReporte();

    // Método que usa el factory method:
    public void generarReporte() {
        crearReporte().generar();

    }
}
