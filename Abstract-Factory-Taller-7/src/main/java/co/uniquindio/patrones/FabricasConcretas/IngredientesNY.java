package co.uniquindio.patrones.FabricasConcretas;

import co.uniquindio.patrones.FabricaAbstracta.IngredientesFactory;
import co.uniquindio.patrones.ProductosAbstractos.Masa;
import co.uniquindio.patrones.ProductosAbstractos.Queso;
import co.uniquindio.patrones.ProductosAbstractos.Salsa;

public class IngredientesNY implements IngredientesFactory {
    @Override
    public Salsa crearSalsa() {
        return null;
    }

    @Override
    public Queso crearQueso() {
        return null;
    }

    @Override
    public Masa crearMasa() {
        return null;
    }
}
