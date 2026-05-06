package co.uniquindio.edu;

import co.uniquindio.edu.Decorator.Compresion;
import co.uniquindio.edu.Decorator.MarcaAgua;
import co.uniquindio.edu.Decorator.ProteccionAdicional;
import co.uniquindio.edu.adapter.RecursoAdapter;
import co.uniquindio.edu.adapter.RecursoExterno;
import co.uniquindio.edu.proxy.ProxyRecurso;
import co.uniquindio.edu.proxy.TipoUsuario;

public class Main {
    public static void main(String[] args) {

        //Implementación Builder
        System.out.println("╔══════════════════════════════╗");
        System.out.println("║        PATRÓN BUILDER        ║");
        System.out.println("╚══════════════════════════════╝");

        RecursoAcademico recurso = new RecursoAcademico.Builder()
                .codigo("IN0256")
                .titulo("Programacion II")
                .autor("Robert C Martin")
                .editorial("Anaya Multimedia")
                .formato("PDF")
                .año(2012)
                .tamaño(15)
                .build();

        System.out.println("Titulo: " + recurso.getTitulo());
        System.out.println("Autor:  " + recurso.getAutor());
        System.out.printf("Tamaño: %.2f MB%n", recurso.calcularTamaño());

        RecursoAcademico recurso2 = new RecursoAcademico.Builder()
                .codigo("IN0257")
                .titulo("Clean Code")
                .autor("Robert C Martin")
                .editorial("Prentice Hall")
                .formato("PDF")
                .año(2008)
                .tamaño(10.0)
                .build();

        //Implementación Decorator
        System.out.println("\n╔══════════════════════════════╗");
        System.out.println("║     PATRÓN DECORATOR         ║");
        System.out.println("╚══════════════════════════════╝");
        //Marca de Agua
        Recurso conMarca = new MarcaAgua(recurso, "UniQuindío");

        //Compresión
        Recurso conCompresion = new Compresion(recurso, 0.7);

        //Protección Adicional
        Recurso conProteccion = new ProteccionAdicional(recurso, "ALTA");

        //Aplicando cada funcionalidad independiente
        System.out.printf("Tamaño original:        %.2f MB%n", recurso.calcularTamaño());
        System.out.printf("Con marca de agua:      %.2f MB%n", conMarca.calcularTamaño());
        System.out.printf("Con compresión (70%%):  %.2f MB%n", conCompresion.calcularTamaño());
        System.out.printf("Con protección:         %.2f MB%n", conProteccion.calcularTamaño());

        //Aplicando todas las funcionalidades juntas
        Recurso protegido = new ProteccionAdicional(
                new Compresion(
                        new MarcaAgua(recurso, "UniQuindío"), 0.7), "ALTA");

        System.out.printf("Con todo encadenado:    %.2f MB%n", protegido.calcularTamaño());

        //Implementación Composite
        System.out.println("\n╔══════════════════════════════╗");
        System.out.println("║     PATRÓN COMPOSITE         ║");
        System.out.println("╚══════════════════════════════╝");
        //creo una subcolección con los 2 recursos iniciales
        Coleccion subColeccion = new Coleccion();
        subColeccion.agregarRecurso(recurso);
        subColeccion.agregarRecurso(recurso2);
        //Creo una colección con la subcolección y con el recurso decorado anteriormente
        Coleccion coleccionPrincipal = new Coleccion();
        coleccionPrincipal.agregarRecurso(protegido);
        coleccionPrincipal.agregarRecurso(subColeccion);
        //calculo el tamaño de cada uno, la subcolección y la colección
        System.out.printf("Tamaño subcolección:        %.2f MB%n", subColeccion.calcularTamaño());
        System.out.printf("Tamaño colección principal: %.2f MB%n", coleccionPrincipal.calcularTamaño());

        //Implementación Adapter
        System.out.println("\n╔══════════════════════════════╗");
        System.out.println("║     PATRÓN ADAPTER           ║");
        System.out.println("╚══════════════════════════════╝");
        RecursoExterno recursoExterno = new RecursoExterno("8.5");
        Recurso recursoAdaptado = new RecursoAdapter(recursoExterno);

        coleccionPrincipal.agregarRecurso(recursoAdaptado);

        System.out.printf("Recurso externo adaptado: %.2f MB%n", recursoAdaptado.calcularTamaño());

        //Implementación Proxy
        System.out.println("\n╔══════════════════════════════╗");
        System.out.println("║     PATRÓN PROXY             ║");
        System.out.println("╚══════════════════════════════╝");
        //si un estudiante accede no puede descargar
        ProxyRecurso proxyEstudiante = new ProxyRecurso(
                recurso,
                TipoUsuario.ESTUDIANTE,
                true,
                "Creative Commons");

        System.out.printf("¿Estudiante puede descargar? %s%n", proxyEstudiante.puedeDescargar() ? "SÍ" : "NO");

        //Si un profesor accede puede descargar
        ProxyRecurso proxyDocente = new ProxyRecurso(
                recurso,
                TipoUsuario.PROFESOR,
                true,
                "Creative Commons");

        System.out.printf("¿Docente puede descargar?    %s%n", proxyDocente.puedeDescargar() ? "SÍ" : "NO");


    }
}
