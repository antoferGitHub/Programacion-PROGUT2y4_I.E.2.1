package Ejercicio14;

public class Marciano {

	private boolean vivo;
	private String nombre;
	private static int numMarcianos;

	public Marciano(String nombre) {
		this.vivo = true;
		this.nombre = nombre;
		this.numMarcianos += 1;
		this.nace(nombre);
	}

	public void nace(String nombre) {
		System.out.println("Hola, he nacido y soy el marciano " + nombre);
	}

	public void muere() {
		numMarcianos = vivo ? numMarcianos -= 1 : numMarcianos;
		String msg = vivo ? "El marciano " + nombre + " ha muerto" : "El marciano " + nombre + " ya está muerto";
		vivo = false;
		System.out.println(msg);

	}
	
	public boolean estaVivo() {
		return vivo;
	}
	
	public static int cuentaMarcianos() {
		return numMarcianos;
	}
	
	public String getNombre() {
		return nombre;
	}

}
