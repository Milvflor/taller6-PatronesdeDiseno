/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package demotienda;

import clasesP.Persona;
import java.util.ArrayList;
import java.util.HashMap;
import productos.ProductoTecnologico;

/**
 *
 * @author gabrielaramos
 */
public class Inventario {
    private HashMap<String, HashMap<String, ArrayList<ProductoTecnologico>>> elements;
    private Persona jefe;
    
    public ArrayList<ProductoTecnologico> getDisponible(String modelo){
  
    return elements.get(modelo).get("Disponible");
    }
    
    public ArrayList<ProductoTecnologico> getDanados(String modelo){

    return elements.get(modelo).get("Danado");
    }
    
    public ArrayList<ProductoTecnologico> getReparando(String modelo){
        
    return elements.get(modelo).get("Reparando");
    
    }
    
    public ArrayList<ProductoTecnologico> getAllDisponible(){
    ArrayList<ProductoTecnologico> l = new ArrayList<>();
        for(String key: elements.keySet()){
            for(int i=0; i<elements.get(key).get("Disponible").size();i++){
            l.add(elements.get(key).get("Disponible").get(i));
            }
        }
    return l;
    }
    
    public ArrayList<ProductoTecnologico> getAllDanados(){
    ArrayList<ProductoTecnologico> l = new ArrayList<>();
        for(String key: elements.keySet()){
            for(int i=0; i<elements.get(key).get("Danado").size();i++){
            l.add(elements.get(key).get("Danado").get(i));
            }
        }
    return l;
    }
    
    
    
    public ArrayList<ProductoTecnologico> getAllReparando(){
        ArrayList<ProductoTecnologico> l = new ArrayList<>();
        for(String key: elements.keySet()){
            for(int i=0; i<elements.get(key).get("Reparando").size();i++){
            l.add(elements.get(key).get("Reparando").get(i));
            }
        }
    return l;
    }
    
   public void remove(String key){
       elements.get(key).get("Disponible").remove(0);
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
    
   
   
  }
    
   
