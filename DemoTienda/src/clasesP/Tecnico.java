/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package clasesP;

/**
 *
 * @author gabrielaramos
 */
public class Tecnico extends Persona{

    public Tecnico(String nombre) {
        super(nombre);
    }
    
    public boolean constatarTipoFallo(){
        return false;
    }
}
