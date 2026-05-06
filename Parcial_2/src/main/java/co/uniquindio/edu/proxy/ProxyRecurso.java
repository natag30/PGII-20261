package co.uniquindio.edu.proxy;

import co.uniquindio.edu.Recurso;

import java.util.ArrayList;
import java.util.List;

public class ProxyRecurso implements Recurso {

    private Recurso recurso;
    private TipoUsuario tipoUsuario;
    private boolean disponible;
    private String licencia;

    public ProxyRecurso(Recurso recurso, TipoUsuario tipoUsuario,
                        boolean disponible, String licencia) {
        this.recurso = recurso;
        this.tipoUsuario = tipoUsuario;
        this.disponible = disponible;
        this.licencia = licencia;
    }

    //Solamente los profesores y administradores pueden descargar por acceso restringido para estudiantes
    public boolean puedeDescargar() {
        if (!disponible) return false;
        if (licencia == null || licencia.isEmpty()) return false;
        return tipoUsuario == TipoUsuario.PROFESOR
                || tipoUsuario == TipoUsuario.ADMINISTRADOR;
    }

    @Override
    public double calcularTamaño() {
        if (!puedeDescargar()) {
            throw new IllegalStateException("Acceso denegado al recurso");
        }
        return recurso.calcularTamaño();
    }
}
