package co.edu.uniquindio.poo.model.CuentasBancarias;

import co.edu.uniquindio.poo.model.Usuario;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.time.LocalDate;

import static org.junit.jupiter.api.Assertions.*;

class CuentaNominaTest {
    @BeforeEach
    void setUp() {

    }

    @Test
    public void testConversionANominaDespuesDeTresMesesSinSalario() {
        Usuario pedro = new Usuario("Pedro", 987654321, 12345678,"Calle 30 #50","");
        CuentaNomina cuentaNomina = new CuentaNomina("0000000006", pedro, 200000, LocalDate.now(), Estado.ACTIVA);

        cuentaNomina.recibirSalario(100000);

        cuentaNomina.aplicarComisionMensual();
        cuentaNomina.aplicarComisionMensual();
        cuentaNomina.aplicarComisionMensual();

        assertEquals(Estado.CERRADA, cuentaNomina.getEstado(),
                "La cuenta nómina debe cerrarse tras 3 meses sin salario.");
    }

    @Test
    void testRetiroTotalDelSaldo() {
        Usuario titular = new Usuario("Natalia Garcia", 1085456127, 310524563, "Carrera 19 numero 40 -20", "");
        CuentaNomina cuentaNomina = new CuentaNomina("NOM-003", titular, 250000.0, LocalDate.now(), Estado.ACTIVA);

        cuentaNomina.retirar(250000.0);

        assertEquals(0.0, cuentaNomina.getSaldo(), "El nuevo saldo es 0, al hacer el retiro total.");
    }
}