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
public class Computadora extends ProductoTecnologico {

    public Computadora(String productoID, String marca, String modelo, double precio, boolean garantia, String fallo, TipodeEstado estado) {
        super(productoID, marca, modelo, precio, garantia, fallo, estado);
    }

        
    @Override
    public void encender(){
        System.out.println("Encendiendo Computadora");
    }
    @Override
    public void apagar(){
        System.out.println("Apagando Computadora");
    }
    
    public void computanr(){
        System.out.println("Computando...");
    }
    
    
    @Override
    public String toString() {
        return "Computadoras de la marca " + marca + " modelo: " + modelo ;
    }
    
}
