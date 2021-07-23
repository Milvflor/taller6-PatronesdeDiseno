package patrones.factorymethod;

import java.util.ArrayList;
import productos.ProductoTecnologico;

public class Bicicleta extends Vehiculo {
	@Override
	public ArrayList<ProductoTecnologico> distribuir() {
		return this.pts;
	}
}
