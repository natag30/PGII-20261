package co.uniquindio.patrones;

public class Computadora {

    private String cpu;
    private int ram;
    private int disco;
    private String gpu;
    private boolean wifi;

    private Computadora(Builder builder) {  // constructor PRIVADO
        this.cpu = builder.cpu;
        this.ram = builder.ram;
        this.disco = builder.disco;
        this.gpu = builder.gpu;
        this.wifi = builder.wifi;
    }

    //Builder clase interna estática

    public static class Builder {
        //Mismos campos que computadora
        private String cpu;
        private int ram = 8;
        private int disco = 256;
        private String gpu;
        private boolean wifi;

        public Builder conCPU(String v) {
            cpu = v;
            return this;
        }

        public Builder conRAM(int v) {
            ram = v;
            return this;
        }

        public Builder conDisco(int v) {
            disco = v;
            return this;
        }

        public Builder conGPU(String v) {
            gpu = v;
            return this;
        }

        public Builder conWifi(boolean v) {
            wifi = v;
            return this;
        }

        public Computadora build() {
            if (cpu == null) throw new IllegalStateException("CPU requerido");
            if (ram < 4) throw new IllegalStateException("RAM mínimo 4 GB");
            return new Computadora(this);
        }


    }
}
