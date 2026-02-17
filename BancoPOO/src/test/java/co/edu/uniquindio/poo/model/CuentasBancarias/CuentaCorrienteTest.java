package co.edu.uniquindio.poo.model.CuentasBancarias;

import co.edu.uniquindio.poo.model.Usuario;
import org.junit.jupiter.api.Test;

import java.time.LocalDate;

import static org.junit.jupiter.api.Assertions.*;

class CuentaCorrienteTest {

    @Test
    public void testRetiroConSobregiroPermitido() {
        Usuario juan = new Usuario("Juan", 123456789, 311330119, "Calle 20 #40", "");
        CuentaCorriente cuenta = new CuentaCorriente("0000000005", juan, 50000, LocalDate.now(), Estado.ACTIVA);

        cuenta.retirar(400000);

        assertEquals(0, cuenta.getSaldo(), "El saldo debe quedar en 0 después del retiro.");

        assertEquals(350000, cuenta.getSobregiroActual(), "El sobregiro debe ser de 350,000.");
    }

    @Test
    void testCobrarComisionConSaldoInsuficiente() {
        Usuario titular = new Usuario("Diana Gabona", 1005138975, 312840416, "carrera 50 numero 2545",
                "");
        CuentaCorriente cuentaCorriente = new CuentaCorriente("HG-485", titular, 10000.0, LocalDate.now(), Estado.ACTIVA);

        cuentaCorriente.cobrarComisionMensual();
        assertEquals(0.0, cuentaCorriente.getSaldo(), "El saldo es 0 porque se retira más de lo disponible");
        assertEquals(5000.0, cuentaCorriente.getSobregiroActual(), "El sobregiro es de 5000");
    }
}