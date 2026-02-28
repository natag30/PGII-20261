package co.edu.uniquindio.prog.factory;

import co.edu.uniquindio.prog.reporte.Reporte;
import co.edu.uniquindio.prog.reporte.ReportePDF;

public class PDFFactory extends ReporteFactory{


    @Override
    public Reporte crearReporte() {
        return new ReportePDF();
    }
}
