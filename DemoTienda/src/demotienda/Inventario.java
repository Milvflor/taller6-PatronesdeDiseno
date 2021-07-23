/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package demotienda;

import clasesP.Persona;
import java.util.ArrayList;
import java.util.HashMap;

import Enum.TipodeEstado;
import productos.ProductoTecnologico;

/**
 *
 * @author gabrielaramos
 */
public class Inventario {
    private HashMap<String, HashMap<TipodeEstado, ArrayList<ProductoTecnologico>>> elements;
    
    
    public ArrayList<ProductoTecnologico> getDisponible(String modelo){
  
    	return elements.get(modelo).get(TipodeEstado.disponible);
    }
    
    public ArrayList<ProductoTecnologico> getDanados(String modelo){

    	return elements.get(modelo).get(TipodeEstado.disponible);
    }
    
    public ArrayList<ProductoTecnologico> getReparando(String modelo){
        
    return elements.get(modelo).get(TipodeEstado.reparacion);
    
    }
    
    public ArrayList<ProductoTecnologico> getAllDisponible(){
    ArrayList<ProductoTecnologico> l = new ArrayList<>();
        for(String key: elements.keySet()){
            for(int i=0; i<elements.get(key).get(TipodeEstado.disponible).size();i++){
            l.add(elements.get(key).get(TipodeEstado.disponible).get(i));
            }
        }
    return l;
    }
    
    public ArrayList<ProductoTecnologico> getAllDanados(){
    ArrayList<ProductoTecnologico> l = new ArrayList<>();
        for(String key: elements.keySet()){
            for(int i=0; i<elements.get(key).get(TipodeEstado.danado).size();i++){
            l.add(elements.get(key).get(TipodeEstado.danado).get(i));
            }
        }
    return l;
    }
    
    
    
    public ArrayList<ProductoTecnologico> getAllReparando(){
        ArrayList<ProductoTecnologico> l = new ArrayList<>();
        for(String key: elements.keySet()){
            for(int i=0; i<elements.get(key).get(TipodeEstado.reparacion).size();i++){
            l.add(elements.get(key).get(TipodeEstado.reparacion).get(i));
            }
        }
    return l;
    }
    
   public void remove(String key){
       elements.get(key).get(TipodeEstado.disponible).remove(0);
   }
   
   public boolean productoDisponible(ProductoTecnologico p){
	   ArrayList<ProductoTecnologico> l= getAllDisponible();
	   
	   boolean disponible=false;
	   for(int i=0; i<l.size() && !disponible; i++){
		   if(l.get(i).getModelo().equals(p.getModelo())){
		    disponible=true;
   }
   
   }
    return disponible;   
   }
    
   public HashMap<String, HashMap<TipodeEstado, ArrayList<ProductoTecnologico>>> getInventario() {
	   return this.elements;
   }
   
  }
    
   
