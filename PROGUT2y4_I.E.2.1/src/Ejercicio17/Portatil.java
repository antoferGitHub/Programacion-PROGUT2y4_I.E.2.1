package Ejercicio17;

public class Portatil extends Ordenador{

	private String marca;
	private int tamanoPantalla;
	private int peso;
	
	public Portatil() {
		this.marca = null;
		this.tamanoPantalla = 0;
		this.peso = 0;
	}
	
	public Portatil(int ram, int hdd, String pro, String gra, String marca, int tamanoPantalla, int peso) {
		super(ram, hdd, pro, gra);
		this.marca = marca;
		this.tamanoPantalla = tamanoPantalla;
		this.peso = peso;
	}
	
	public String getMarca() {
		return marca;
	}
	
	public void setMarca(String marca) {
		this.marca = marca;
	}
	
	public int getTamanoPantalla() {
		return tamanoPantalla;
	}
	
	public void setTamanoPantalla(int tamanoPantalla) {
		this.tamanoPantalla = tamanoPantalla;
	}
	
	public int getPeso() {
		return peso;
	}
	
	public void setPeso(int peso) {
		this.peso = peso;
	}
	
	
}
