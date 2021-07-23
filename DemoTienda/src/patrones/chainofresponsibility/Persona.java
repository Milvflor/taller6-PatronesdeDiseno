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
public abstract class Persona {
    String nombre;

    public Persona(String nombre) {
        this.nombre = nombre;
    }
    
    abstract void verProductos(Inventario inv);
}
