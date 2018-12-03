package Ejercicio17;

public class Servidor extends Ordenador {

	private int pulMonitor;
	private String teclado;
	private String raton;
	
	public Servidor() {
		pulMonitor=0;
		teclado="";
		raton="";
	}

	public Servidor(int pulMonitor, String teclado, String raton) {
		super();
		this.pulMonitor = pulMonitor;
		this.teclado = teclado;
		this.raton = raton;
	}

	public Servidor(int ram, int hdd, String pro, String gra, int pulMonitor, String teclado, String raton,float precio) {
		super(ram, hdd, pro, gra,precio);
		this.pulMonitor = pulMonitor;
		this.teclado = teclado;
		this.raton = raton;
	}

	public int getPulMonitor() {
		return pulMonitor;
	}

	public void setPulMonitor(int pulMonitor) {
		this.pulMonitor = pulMonitor;
	}

	public String getTeclado() {
		return teclado;
	}

	public void setTeclado(String teclado) {
		this.teclado = teclado;
	}

	public String getRaton() {
		return raton;
	}

	public void setRaton(String raton) {
		this.raton = raton;
	}
	
	

}
