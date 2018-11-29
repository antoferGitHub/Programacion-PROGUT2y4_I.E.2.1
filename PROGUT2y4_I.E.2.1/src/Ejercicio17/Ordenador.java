package Ejercicio17;

public class Ordenador {

	private int ram;
	private int hdd;
	private String pro;
	private String gra;
	
	public Ordenador(int ram, int hdd, String pro, String gra) {
		this.ram = ram;
		this.hdd = hdd;
		this.pro = pro;
		this.gra = gra;
	}
	
	public Ordenador() {
		ram=0;
		hdd=0;
		pro=null;
		gra=null;
	}

	public int getRam() {
		return ram;
	}

	public void setRam(int ram) {
		this.ram = ram;
	}

	public int getHdd() {
		return hdd;
	}

	public void setHdd(int hdd) {
		this.hdd = hdd;
	}

	public String getPro() {
		return pro;
	}

	public void setPro(String pro) {
		this.pro = pro;
	}

	public String getGra() {
		return gra;
	}

	public void setGra(String gra) {
		this.gra = gra;
	}
	
	
	
	
}
