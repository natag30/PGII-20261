package co.edu.uniquindio.prog.reporte;

public class ReporteHTML implements Reporte{
    @Override
    public void generar() {
        System.out.println("Generando reporte en HTML");
    }

    @Override
    public String getTipo() {
        return "Reporte en HTML";
    }
}
