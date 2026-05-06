package co.uniquindio.edu.service;

public class GuiaService {

    public String asignarGuia(boolean bilingue){
        String tipo = bilingue ? "bilingue" : "español";
        System.out.println("Guía " + tipo);
        return "María López";
    }

}
