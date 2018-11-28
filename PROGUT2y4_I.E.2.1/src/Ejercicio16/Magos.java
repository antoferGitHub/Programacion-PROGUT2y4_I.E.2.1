package Ejercicio16;

public class Magos extends Personajes {

	private String poder;

	public Magos(String nombre, String poder) {
		super(nombre, 100);
		this.poder = poder;

	}
	
	public String encantar() {
		this.nivelEnergia-=2;
		return poder;
	}
	
	
}
