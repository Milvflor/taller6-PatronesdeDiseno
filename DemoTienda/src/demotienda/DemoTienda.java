/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package demotienda;
import Enum.TipodeEstado;
import patrones.factorymethod.CreadorAereo;
import patrones.factorymethod.Vehiculo;
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
        CreadorAereo ca = new CreadorAereo();
        
        Vehiculo avion = ca.crearVehiculo();
        
        avion.distribuir();		// no imprime nada porque arraylist de productos está vacío
    }
    // String productoID, String marca, String modelo, double precio, boolean garantia, String fallo, String estado
}
