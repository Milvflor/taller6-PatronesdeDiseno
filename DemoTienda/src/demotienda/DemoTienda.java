/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package demotienda;
import Enum.TipodeEstado;
import logistica.*;
import productos.*;

/**
 *
 * @author gabrielaramos
 */
public class DemoTienda {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        //Codigo prueba 
        Celular producto= new Celular("AI8","Apple","Iphone 8",850,true,"Ninguno",TipodeEstado.disponible);
        Aerea log = new Aerea(producto,"Tienda T&T",4);
        
        log.entregarProducto();
    }
    // String productoID, String marca, String modelo, double precio, boolean garantia, String fallo, String estado
}
