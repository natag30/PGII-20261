package co.edu.uniquindio.poo.model.CuentasBancarias;

import co.edu.uniquindio.poo.model.Usuario;
import org.junit.jupiter.api.Test;

import java.time.LocalDate;

import static org.junit.jupiter.api.Assertions.*;

class CuentaAhorrosTest {




    @Test
     void testRetiroMayorQueSaldoMinimoDebeSerRechazado() {
        Usuario maria = new Usuario("María", 987654321, 123456, "Calle 15 #30", "30-07-1999");
        CuentaAhorros cuenta = new CuentaAhorros("0000000004", maria, 500000, LocalDate.now(), Estado.ACTIVA);

        cuenta.retirar(450000);

        assertEquals(500000, cuenta.getSaldo(),
                "El retiro debe ser rechazado porque dejaría el saldo por debajo del mínimo permitido.");
    }

    @Test
    void testRetiroInvalidoPorSaldoMinimo() {
        Usuario titular = new Usuario("Benito Martinez", 1004789452, 31226587, "barrio mercedario casa 25", "");
        CuentaAhorros cuentaAhorros = new CuentaAhorros("RG-123", titular, 120000.0, LocalDate.now(), Estado.ACTIVA);

        cuentaAhorros.retirar(30000.0);

        assertEquals(Estado.BLOQUEADA, cuentaAhorros.getEstado());
    }

}