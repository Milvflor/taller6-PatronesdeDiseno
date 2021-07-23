/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package demotienda;

import clasesP.Persona;
import clasesP.Proveedor;
import clasesP.Vendedor;

import java.util.ArrayList;
import clasesP.Comprador;
import clasesP.I_Observable;
import clasesP.Mantenimiento;
import clasesP.Notificador;
import Enum.TipodeEstado;
import logistica.Logistica;
import productos.ProductoTecnologico;

/**
 *
 * @author milvflor
 */
public class Tienda implements I_Observable {
    public String nombre;
    public Logistica logistica;
    public Inventario inventario;
    public ArrayList<Persona> personal;
    public ProductoTecnologico changeStateP;
    
 
    
    public void addProducto(ProductoTecnologico p){
  
    	if (!this.inventario.productoDisponible(p)){
    		this.inventario.getInventario().get(p.getModelo()).get(p.getEstado()).add(p);
    	}
    		
    }
    
    public void removeProducto(ProductoTecnologico p) {
    	if (this.inventario.productoDisponible(p)){
    		this.inventario.getInventario().get(p.getModelo()).get(p.getEstado()).remove(p);
    	}
    }
    
    public void realizarEnvio(ProductoTecnologico p, Logistica l){}
    
    public void changeState(TipodeEstado estado, ProductoTecnologico producto) {
    	producto.setEstado(estado);
    	this.removeProducto(producto);
    	this.addProducto(producto);
    	this.changeStateP = producto;
    	notify();
    	
    	
    }
    
    @Override
    public void notify_(){
    	Notificador n = new Notificador(this);
    	
    	if (changeStateP.getEstado().equals(TipodeEstado.disponible)) {
    		for (Persona p: personal ) {
        		if (p instanceof Comprador || p instanceof Vendedor) {
        			n.update();
        		}
        	}
		}else if (changeStateP.getEstado().equals(TipodeEstado.danado)) {
    		for (Persona p: personal ) {
        		if (p instanceof Proveedor) {
        			n.update();
        		}
        	}
		}else if (changeStateP.getEstado().equals(TipodeEstado.disponible)) {
    		for (Persona p: personal ) {
        		if (p instanceof Mantenimiento) {
        			n.update();
        		}
        	}
		}
    	
    };

	@Override
	public void attach(Persona persona) {
		this.personal.add(persona);
		
	};

	@Override
	public void detach(Persona persona) {
		this.personal.remove(persona);
		
	}

	public ProductoTecnologico getChangeStateP() {
		return changeStateP;
	}

	
	
}
