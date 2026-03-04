package co.uniquindio.patrones;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    static void main() {
        Computadora gaming = new Computadora.Builder()
                .conCPU("Intel i9")
                .conRAM(64)
                .conDisco(2000)
                .conGPU("RTX 4090")
                .conWifi(true)
                .build();

        System.out.println(gaming);
    }
}
