package co.edu.uniquindio.prog.factory;

import co.edu.uniquindio.prog.reporte.Reporte;
import co.edu.uniquindio.prog.reporte.ReporteHTML;

public class HTMLFactory extends ReporteFactory{
    @Override
    public Reporte crearReporte() {
        return new ReporteHTML();
    }
}
