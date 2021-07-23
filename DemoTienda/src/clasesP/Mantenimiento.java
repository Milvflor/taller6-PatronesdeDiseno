/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package clasesP;

import demotienda.Inventario;
import java.util.ArrayList;
import productos.ProductoTecnologico;

/**
 *
 * @author gabrielaramos
 */
public class Mantenimiento extends Persona {

    public Mantenimiento(String nombre) {
        super(nombre);
    }
    
    public void verProductos(Inventario inv){
        ArrayList<ProductoTecnologico> prods = inv.getAllReparando();
        for (ProductoTecnologico p : prods){
            System.out.println(p);
        }
    }
    
    public boolean constatarTipoFallo(ProductoTecnologico prod){
        boolean retorna = false;
        if(prod.getFallo().equals("Cubierto por la garantia")){
            retorna = true;
        }else if (prod.getFallo().equals("No cubierto por la garantia")){
            retorna = false;
        }
        return retorna;
    }
}
