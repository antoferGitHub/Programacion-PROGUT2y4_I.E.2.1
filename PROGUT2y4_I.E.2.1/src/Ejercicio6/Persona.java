package Ejercicio6;

/**
 * 
 * Confeccionar una clase Persona que tenga como atributos el nombre y la edad.
 * Definir como responsabilidades un método que cargue los datos personales y
 * otro que los imprima.
 * 
 * @author Antonio Torres Fernández
 *
 */
public class Persona {

	/**
	 * Nombre de la persona
	 */
	private String nombre;
	/**
	 * Edad de la persona
	 */
	private int edad;

	/**
	 * Constructor
	 * @param nombre
	 * 				Asigna el valor al atributo nombre
	 * @param edad
	 * 				Asigna el valor al atributo edad
	 */
	public Persona(String nombre, int edad) {
		this.nombre = nombre;
		this.edad = edad;

	}

	/**
	 * Retorna una cadena con toda la información de la persona
	 * @return Cadena con los valores de los atributos de la clase
	 */
	public String datosPersona() {
		String cadena = "Nombre : " + nombre + "\nEdad : " + edad;
		return cadena;
	}

}
