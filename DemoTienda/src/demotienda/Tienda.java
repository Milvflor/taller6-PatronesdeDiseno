/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package demotienda;

import clasesP.Vendedor;
import logistica.Logistica;
import productos.ProductoTecnologico;

/**
 *
 * @author gabrielaramos
 */
public class Tienda {
    String nombre;
    Logistica logistica;
    Vendedor vendedor;
    
//proveedores:Proveedor[1..*]
//asistenteMantenimineto: Mantenimiento[1..*] 
 
    
    public void actualizarInventario(){}
    public void realizarEnvio(ProductoTecnologico p, Logistica l){}
}
