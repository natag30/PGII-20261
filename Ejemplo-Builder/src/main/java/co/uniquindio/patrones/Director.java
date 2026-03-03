package co.uniquindio.patrones;

public class Director {
    public static Computadora.Builder gaming() {
        return new Computadora.Builder()
                .conCPU("i9").conRAM(64)
                .conGPU("RTX 4090").conDisco(2000);
    }
    public static Computadora.Builder oficina() {
        return new Computadora.Builder()
                .conCPU("i5").conRAM(16).conDisco(512);
    }
}
