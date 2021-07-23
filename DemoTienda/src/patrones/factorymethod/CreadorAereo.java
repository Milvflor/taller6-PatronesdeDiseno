/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package patrones.factorymethod;

/**
 *
 * @author gabrielaramos
 */
public class CreadorAereo extends CreadorVehiculo {
	@Override
	public Vehiculo crearVehiculo() {
		return new Avion();
	}
}
