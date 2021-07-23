package patrones.factorymethod;

import java.util.ArrayList;
import productos.ProductoTecnologico;

public class Ferrocarril extends Vehiculo {
	@Override
	public ArrayList<ProductoTecnologico> distribuir() {
		return this.pts;
	}
}
