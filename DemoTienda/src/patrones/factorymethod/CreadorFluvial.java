/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package patrones.factorymethod;

import productos.ProductoTecnologico;

/**
 *
 * @author gabrielaramos
 */
public class CreadorFluvial extends CreadorVehiculo {
	@Override
	public Vehiculo crearVehiculo() {
		return new Barco();
	}
}