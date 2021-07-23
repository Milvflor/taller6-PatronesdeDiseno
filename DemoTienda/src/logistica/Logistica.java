/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package logistica;

import productos.ProductoTecnologico;

/**
 *
 * @author gabrielaramos
 */
public class Logistica {
    ProductoTecnologico producto;
    String destino;
    int cantidad;

    public Logistica(ProductoTecnologico producto, String destino, int cantidad) {
        this.producto = producto;
        this.destino = destino;
        this.cantidad = cantidad;
    }
    
    public void entregarProducto(){
        System.out.println("Se debe entregar " + cantidad +" " + this.producto +" en " + destino);
    
    }

  
    
}