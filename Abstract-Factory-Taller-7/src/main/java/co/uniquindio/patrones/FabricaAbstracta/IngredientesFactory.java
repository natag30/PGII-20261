package co.uniquindio.patrones.FabricaAbstracta;

import co.uniquindio.patrones.ProductosAbstractos.Masa;
import co.uniquindio.patrones.ProductosAbstractos.Queso;
import co.uniquindio.patrones.ProductosAbstractos.Salsa;

public interface IngredientesFactory {
    Salsa crearSalsa();
    Queso crearQueso();
    Masa crearMasa();
}
