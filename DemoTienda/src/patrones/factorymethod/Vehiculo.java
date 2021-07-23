/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package patrones.factorymethod;

import java.util.ArrayList;
import productos.ProductoTecnologico;

/**
 *
 * @author gabrielaramos
 */
public abstract class Vehiculo {
    protected ArrayList<ProductoTecnologico> pts;
    
	abstract public ArrayList<ProductoTecnologico> distribuir();
}