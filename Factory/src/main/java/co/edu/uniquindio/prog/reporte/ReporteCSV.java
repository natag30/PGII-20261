package co.edu.uniquindio.prog.reporte;

public class ReporteCSV implements Reporte{
    @Override
    public void generar() {
        System.out.println("Generando reporte en csv");
    }

    @Override
    public String getTipo() {
        return "Reporte en csv";
    }
}
