/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package demotienda;

import clasesP.Mantenimiento;
import clasesP.Proveedor;
import clasesP.Vendedor;
import java.util.ArrayList;
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
    ArrayList<Proveedor> proveedores;
    ArrayList<Mantenimiento> asistenteMantenimiento;
 
    
    public void actualizarInventario(){}
    public void realizarEnvio(ProductoTecnologico p, Logistica l){}
}
