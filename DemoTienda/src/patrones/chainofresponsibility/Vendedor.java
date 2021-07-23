/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package patrones.chainofresponsibility;

import demotienda.Inventario;
import java.util.ArrayList;
import productos.ProductoTecnologico;

/**
 *
 * @author gabrielaramos
 */
public class Vendedor extends Persona {
    
    private Vendedor gerente;

    public Vendedor(String nombre) {
        super(nombre);
    }
    
    public void verProductos(Inventario inv){
        ArrayList<ProductoTecnologico> prods = inv.getAllDisponible();
        for (ProductoTecnologico p : prods){
            System.out.println(p);
        }
    }
    
    public boolean verificarGarantia(ProductoTecnologico producto){
        boolean garantia =false;
        if(producto.isGarantia()== true){
            return garantia;
        }
        return garantia;
    }

    public boolean aprobarReposicion(ProductoTecnologico producto){
        return true;
    }
}
