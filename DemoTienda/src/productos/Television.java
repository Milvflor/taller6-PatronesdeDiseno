/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package productos;

import Enum.TipodeEstado;

/**
 *
 * @author gabrielaramos
 */
public class Television extends ProductoTecnologico {

    public Television(String productoID, String marca, String modelo, double precio, boolean garantia, String fallo, TipodeEstado estado) {
        super(productoID, marca, modelo, precio, garantia, fallo, estado);
    }
        
    @Override
    public void encender(){
        System.out.println("Encendiendo Television");
    }
    @Override
    public void apagar(){
        System.out.println("Apagando Television");
    }
    
    public void cambiarCanal(){
        System.out.println("Cambiando de Canal...");
    }
    
    
    @Override
    public String toString() {
        return "Televisiones de la marca " + marca + " modelo: " + modelo ;
    }
        
    
}
