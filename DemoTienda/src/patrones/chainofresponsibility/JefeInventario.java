/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package patrones.chainofresponsibility;

import demotienda.Inventario;

/**
 *
 * @author gabrielaramos
 */
public class JefeInventario extends Persona {

    public JefeInventario(String nombre) {
        super(nombre);
    }
    
    public boolean certificarExistencia(){
        return false;
    }

	@Override
	void verProductos(Inventario inv) {
		// TODO Auto-generated method stub
		
	}

}
