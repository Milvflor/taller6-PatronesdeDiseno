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
public class Automotriz extends Logistica{

    public Automotriz(ProductoTecnologico producto, String destino, int cantidad) {
        super(producto, destino, cantidad);
    }
 
    public void entregarProducto(){
        System.out.println("Se debe entregar " + cantidad +" " + this.producto +" en " + destino + " vía Automotriz.");
    }    
        
    
}