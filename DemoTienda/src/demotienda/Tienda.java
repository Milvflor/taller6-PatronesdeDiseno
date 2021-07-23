/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package demotienda;

import clasesP.Persona;
import java.util.HashMap;
import logistica.Logistica;
import productos.ProductoTecnologico;

/**
 *
 * @author milvflor
 */
public class Tienda {
    public String nombre;
    public Logistica logistica;
    public Inventario inventario;
    public HashMap<String, Persona> personal;
    public ProductoTecnologico changeStateP;
    
 
    
    public void addProducto(Producto p){
    	
    	this.inventario.get
    }
    public void realizarEnvio(ProductoTecnologico p, Logistica l){}
    public void changeState(String estado, ProductoTecnologico producto) {}
    public void notify_(){};
}
