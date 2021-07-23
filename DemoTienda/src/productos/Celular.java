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
public class Celular extends ProductoTecnologico{

    public Celular(String productoID, String marca, String modelo, double precio, boolean garantia, String fallo, String estado) {
        super(productoID, marca, modelo, precio, garantia, fallo, estado);
    }

    
    @Override
    public void encender(){
        System.out.println("Encendiendo Celular");
    }
    @Override
    public void apagar(){
        System.out.println("Apagando Celular");
    }
    public void realizarLlamadas(){
        System.out.println("Llamando...");
    }
    
    @Override
    public String toString() {
        return "Celulares de la marca " + marca + " modelo: " + modelo ;
    }
    
    
    
}
