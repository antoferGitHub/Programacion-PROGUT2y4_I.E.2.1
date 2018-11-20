package Ejercicio11;

/**
 * Se quiere definir una clase Triangulo que represente al polígono Triangulo.
 * 
 * @author Antonio Torres Fernández
 *
 */
public class Triangulo {

	private double lado1;
	private double lado2;
	private double lado3;
	
	public Triangulo() {
		lado1=1;
		lado2=2;
		lado3=3;
		
	}

	public Triangulo(double lado1, double lado2, double lado3) {
		this.lado1 = lado1;
		this.lado2 = lado2;
		this.lado3 = lado3;

	}
	
	public boolean compareTo_Triangulos(Triangulo a, Triangulo b) {
		return a.equals(b);
	}

}
