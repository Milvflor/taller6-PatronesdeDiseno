/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package patrones.chainofresponsibility;

import java.util.ArrayList;

import demotienda.Inventario;
import productos.ProductoTecnologico;

/**
 *
 * @author gabrielaramos
 */
public class Comprador extends Persona {

	private ArrayList<ProductoTecnologico> pts;
    public Comprador(String nombre) {
        super(nombre);
    }
    
    public void verProductos(){}
    
    public void solicitarCambio(){}

	@Override
	void verProductos(Inventario inv) {
		// TODO Auto-generated method stub
		
	}
}
