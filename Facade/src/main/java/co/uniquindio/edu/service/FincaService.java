package co.uniquindio.edu.service;

public class FincaService {

    public boolean hayDisponibilidad(String fincaId){
        System.out.println("Verificando: " + fincaId);
        return true;
    }

    public double getPrecioTour(String tipo){
        System.out.println("Precio " + tipo);
        return 85000;
    }
}
