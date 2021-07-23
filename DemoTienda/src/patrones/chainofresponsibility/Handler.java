package patrones.chainofresponsibility;

public interface Handler {
	public boolean solicitarCambio();
	public boolean verificarGaratia();
	public boolean constatarTipoFallo();
	public boolean certificarExistencia();
	public boolean solicitarAprobacion();
	public boolean aprobarReposicion();
}
