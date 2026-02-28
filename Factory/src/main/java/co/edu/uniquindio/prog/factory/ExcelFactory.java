package co.edu.uniquindio.prog.factory;

import co.edu.uniquindio.prog.reporte.Reporte;
import co.edu.uniquindio.prog.reporte.ReporteExcel;

public class ExcelFactory extends ReporteFactory {

    @Override
    public Reporte crearReporte() {
        return new ReporteExcel();
    }
}
