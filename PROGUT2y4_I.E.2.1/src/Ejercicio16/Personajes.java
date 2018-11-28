package Ejercicio16;

public class Personajes {

	private String nombre;
	protected int nivelEnergia;

	public Personajes(String nombre, int nivelEnergia) {
		this.nombre=nombre;
		this.nivelEnergia=nivelEnergia;
	}
		
	
	public void alimentarse(int energia) {
		nivelEnergia += energia;

	}

}
