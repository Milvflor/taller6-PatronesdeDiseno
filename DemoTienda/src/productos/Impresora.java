/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package productos;

/**
 *
 * @author gabrielaramos
 */
public class Impresora extends ProductoTecnologico{

    public Impresora(String productoID, String marca, String modelo, double precio, boolean garantia, String fallo, String estado) {
        super(productoID, marca, modelo, precio, garantia, fallo, estado);
    }

    @Override
    public void encender(){
        System.out.println("Encendiendo Impresora");
    }
    @Override
    public void apagar(){
        System.out.println("Apagando Impresora");
    }
    public void imprimir(){
        System.out.println("Imprimiendo...");
    }
    
    @Override
    public String toString() {
        return "Impresoras de la marca " + marca + " modelo " + modelo ;
    }
        
    
}
