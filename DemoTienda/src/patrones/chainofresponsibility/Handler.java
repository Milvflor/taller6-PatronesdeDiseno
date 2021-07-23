package patrones.chainofresponsibility;

public interface Handler {
	public void solicitarCambio();
	public void setNext(Handler handler);
}
