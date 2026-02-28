package co.edu.uniquindio.prog.factory;

import co.edu.uniquindio.prog.reporte.Reporte;
import co.edu.uniquindio.prog.reporte.ReporteCSV;

public class CSVFactory extends ReporteFactory{
    @Override
    public Reporte crearReporte() {
        return new ReporteCSV();
    }
}
