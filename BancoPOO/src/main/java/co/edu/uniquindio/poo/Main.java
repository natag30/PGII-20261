package co.edu.uniquindio.poo;

import co.edu.uniquindio.poo.model.Banco;
import co.edu.uniquindio.poo.model.CuentasBancarias.CuentaAhorros;
import co.edu.uniquindio.poo.model.CuentasBancarias.CuentaCorriente;
import co.edu.uniquindio.poo.model.CuentasBancarias.CuentaNomina;
import co.edu.uniquindio.poo.model.CuentasBancarias.Estado;
import co.edu.uniquindio.poo.model.Usuario;

import java.time.LocalDate;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        Banco banco = new Banco("BANCOUNI", 125478, "Carrera 19 numero 40 - 25 Centro",
                318789456);

        Usuario titular = new Usuario("DIEGO RINCON", 1094789450, 318862555,
                "calle 50 Puerto Espejo","1992/11/12");

        CuentaAhorros cuentaAhorros = new CuentaAhorros("1235896478", titular, 150000.0,
                LocalDate.of(2026, 1, 21), Estado.ACTIVA);

        CuentaCorriente cuentaCorriente = new CuentaCorriente("1478956213", titular, 1000000.0,
                LocalDate.of(2026, 2, 10), Estado.ACTIVA);

        CuentaNomina cuentaNomina = new CuentaNomina("NOM-003", titular, 250000.0,
                LocalDate.of(2026, 2, 10), Estado.ACTIVA);

        System.out.println("\n Cuenta de Ahorros \n");

        cuentaAhorros.mostrarInformacion();
        cuentaAhorros.retirar(50000.0);
        cuentaAhorros.mostrarInformacion();
        cuentaAhorros.aplicarInteresMensual();
        cuentaAhorros.mostrarInformacion();

        System.out.println("\n Cuenta Corriente \n");

        cuentaCorriente.mostrarInformacion();
        cuentaCorriente.retirar(50000.0);
        cuentaCorriente.mostrarInformacion();
        cuentaCorriente.cobrarComisionMensual();
        cuentaCorriente.mostrarInformacion();
        cuentaCorriente.aplicarInteresSobregiro();
        cuentaCorriente.mostrarInformacion();

        titular.mostrarCuentas();

        System.out.println("\n Cuenta de Nómina \n");

        cuentaNomina.mostrarInformacion();
        cuentaNomina.recibirSalario(100000.0);
        cuentaNomina.mostrarInformacion();
        cuentaNomina.aplicarComisionMensual();
        cuentaNomina.mostrarInformacion();
        cuentaNomina.aplicarComisionMensual();
        cuentaNomina.mostrarInformacion();
        cuentaNomina.aplicarComisionMensual();
        cuentaNomina.mostrarInformacion();

        titular.mostrarCuentas();
    }
}