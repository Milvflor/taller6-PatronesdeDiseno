package clasesP;

import demotienda.Tienda;

/**
*
* @author milvflor
*/
public class Notificador implements I_Observer{
	
	private Tienda observable = null;
	
	public Notificador(I_Observable t) {
		this.observable = (Tienda) t;
	}
	
	@Override
	public void update() {
		System.out.println("El producto "+ observable.getChangeStateP().getMarca() +" tiene estado: "+observable.getChangeStateP().getEstado()+".");		
	}

}
