package co.edu.uniquindio.prog.reporte;

public class ReporteExcel implements Reporte{
    @Override
    public void generar() {
        System.out.println("Generando reporte en Excel");
    }

    @Override
    public String getTipo() {
        return "Reporte en Excel";
    }
}
