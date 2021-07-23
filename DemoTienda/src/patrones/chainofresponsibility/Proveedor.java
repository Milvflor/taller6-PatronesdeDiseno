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
public class Proveedor extends Persona {

    public Proveedor(String nombre) {
        super(nombre);
    }
    
    public void verProductos(Inventario inv){
        ArrayList<ProductoTecnologico> prods = inv.getAllDanados();
        for (ProductoTecnologico p : prods){
            System.out.println(p);
        }
    }
    

}
