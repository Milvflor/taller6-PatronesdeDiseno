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
public class Fluvial extends Logistica{

    public Fluvial(ProductoTecnologico producto, String destino, int cantidad) {
        super(producto, destino, cantidad);
    }
    
}