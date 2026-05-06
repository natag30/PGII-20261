package co.uniquindio.edu;

import co.uniquindio.edu.service.FincaService;
import co.uniquindio.edu.service.GuiaService;
import co.uniquindio.edu.service.PagoService;
import co.uniquindio.edu.service.TransporteService;

public class TourFacade {
    private FincaService finca;
    private TransporteService transporte;
    private PagoService pago;
    private GuiaService guia;

    public TourFacade(){
        this.finca = new FincaService();
        this.transporte = new TransporteService();
        this.pago = new PagoService();
        this.guia = new GuiaService();
    }

    public boolean reservarTourCompleto(String fincaId, String zona, int personas, String metodoPago, boolean bilingue){
        if(!finca.hayDisponibilidad(fincaId)){
            return false;
        }

        double precio = finca.getPrecioTour("completo");
        if(!pago.procesarPago(precio,metodoPago)){
            return false;
        }

        String willy = transporte.asignarWilly(zona, personas);
        String guiaNombre = guia.asignarGuia(bilingue);

        System.out.println("Tour listo: " + willy + ", " + guiaNombre);
        return true;

    }
}
