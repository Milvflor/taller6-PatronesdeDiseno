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
public class ProductoTecnologico {
    String marca;
    String modelo;
    double precio;
    boolean garantia;
    String fallo;
    String estado;

    public ProductoTecnologico(String marca, String modelo, double precio, boolean garantia, String fallo, String estado) {
        this.marca = marca;
        this.modelo = modelo;
        this.precio = precio;
        this.garantia = garantia;
        this.fallo = fallo;
        this.estado = estado;
    }
    
    
    
}
