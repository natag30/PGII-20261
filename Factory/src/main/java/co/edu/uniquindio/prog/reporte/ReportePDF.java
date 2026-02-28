package co.edu.uniquindio.prog.reporte;

public class ReportePDF implements Reporte{

    @Override
    public void generar() {
        System.out.println("Generando reporte en PDF");
    }

    @Override
    public String getTipo() {
        return "Reporte en PDF";
    }
}
