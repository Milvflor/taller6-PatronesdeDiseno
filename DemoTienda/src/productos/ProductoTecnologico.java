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
    String productoID;
    String marca;
    String modelo;
    double precio;
    boolean garantia;
    String fallo;
    String estado;

    public ProductoTecnologico(String productoID, String marca, String modelo, double precio, boolean garantia, String fallo, String estado) {
        this.productoID = productoID;
        this.marca = marca;
        this.modelo = modelo;
        this.precio = precio;
        this.garantia = garantia;
        this.fallo = fallo;
        this.estado = estado;
    }


    public void encender(){
        System.out.println("Encendiendo");
    }
    public void apagar(){
        System.out.println("Encendiendo");
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public double getPrecio() {
        return precio;
    }

    public void setPrecio(double precio) {
        this.precio = precio;
    }

    public boolean isGarantia() {
        return garantia;
    }

    public void setGarantia(boolean garantia) {
        this.garantia = garantia;
    }

    public String getFallo() {
        return fallo;
    }

    public void setFallo(String fallo) {
        this.fallo = fallo;
    }

    public String getEstado() {
        return estado;
    }

    public void setEstado(String estado) {
        this.estado = estado;
        
    }
    
    @Override
    public String toString() {
        return "Producto de la marca " + marca + " modelo: "+ modelo ;
    }
    

    
    
}
