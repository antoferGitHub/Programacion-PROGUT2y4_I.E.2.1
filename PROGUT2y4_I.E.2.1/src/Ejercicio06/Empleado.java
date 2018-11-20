/**
 * 
 */
package Ejercicio06;

/**
 * 
 * Plantear una segunda clase Empleado que herede de la clase Persona. Añadir un
 * atributo sueldo y los métodos de cargar el sueldo e imprimir su sueldo.
 * 
 * @author Antonio Torres Fernández
 *
 */
public class Empleado extends Persona {

	/**
	 * Atributo que almacena el sueldo del empleado
	 */
	private double sueldo;

	/**
	 * Constructor
	 * 
	 * @param nombre Asigna el nombre al empleado
	 * @param edad   Asigna la edad inicial al empleado
	 * @param sueldo Asigna el sueldo inicial del empleado
	 */
	public Empleado(String nombre, int edad, double sueldo) {
		super(nombre, edad);
		this.sueldo = sueldo;

	}

	/**
	 * Asigna el nuevo valor para el sueldo del empleado
	 * 
	 * @param sueldo Nuevo valor para el sueldo del empleado
	 */
	public void setSueldo(double sueldo) {
		this.sueldo = sueldo;
	}

	/**
	 * Retorna el valor actual del sueldo del empleado
	 * @return Valor actual del sueldo del empleado
	 */
	public Double getSueldo() {
		return sueldo;
	}
	
	/** (non-Javadoc)
	 * Retorna una copia del objeto
	 * @see java.lang.Object#clone()
	 */
	public Object clone() {
		return this;
	}

}
