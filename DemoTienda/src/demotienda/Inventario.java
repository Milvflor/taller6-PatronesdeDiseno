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
    
    public ArrayList<ProductoTecnologico> getDisponible(String id){
  
    return elements.get(id).get("Disponible");
    }
    
    public ArrayList<ProductoTecnologico> getDañados(String id){

    return elements.get(id).get("Danado");
    }
    
    public ArrayList<ProductoTecnologico> getReparando(String id){
        
    return elements.get(id).get("Reparando");
    
    }
    
    public ArrayList<ProductoTecnologico> getAllDisponible(String id){
    ArrayList<ProductoTecnologico> l = new ArrayList<>();
        for(String key: elements.keySet()){
            for(int i=0; i<elements.get(key).get("Disponible").size();i++){
            l.add(elements.get(key).get("Disponible").get(i));
            }
        }
    return l;
    }
    
    public ArrayList<ProductoTecnologico> getAllDañados(String id){
    ArrayList<ProductoTecnologico> l = new ArrayList<>();
        for(String key: elements.keySet()){
            for(int i=0; i<elements.get(key).get("Danado").size();i++){
            l.add(elements.get(key).get("Danado").get(i));
            }
        }
    return l;
    }
    
    
    
    public ArrayList<ProductoTecnologico> getAllReparando(String id){
        ArrayList<ProductoTecnologico> l = new ArrayList<>();
        for(String key: elements.keySet()){
            for(int i=0; i<elements.get(key).get("Reparando").size();i++){
            l.add(elements.get(key).get("Reparando").get(i));
            }
        }
    return l;
    }
    
    
  }
    
   
