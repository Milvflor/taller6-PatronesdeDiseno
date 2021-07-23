package patrones.observer;

import patrones.chainofresponsibility.Persona;

/**
*
* @author milvflor
*/
public interface I_Observable {
	
	public void attach(Persona persona);
	public void detach(Persona persona);
	public void notify_();
}
