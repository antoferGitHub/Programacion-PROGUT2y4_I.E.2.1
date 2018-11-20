package Ejercicio07y08;

/**
 * Implementar la clase Asignatura que represente el nombre de una asignatura y
 * la nota correspondiente obtenida
 * 
 * @author Antonio Torres Fernández
 *
 */
public class Asignatura {
	
	/**
	 * Atributo de clase que almacena el nombre de la asignatura
	 */
	private String nombre;
	/**
	 * Atributo de clase que almacena el valor de la nota de la asignatura
	 */
	private float nota;
	
	/**
	 * Constructor
	 * @param nombre Parametro para asignar valor inicial al atributo de clase nombre
	 * @param nota Parámetro para asignar valor inicial al atributo de clase nota
	 */
	public Asignatura(String nombre, float nota) {
		this.nombre=nombre;
		this.nota=nota;
		
	}

	/**
	 * Retorna el valor del atributo nota
	 * @return Valor establecido para la asignatura
	 */
	public float getNota() {
		return nota;
	}

	/**
	 * Asigna un nuevo valor al atributo nota
	 * @param nota Nuevo valor a asignar para el atributo nota
	 */
	public void setNota(float nota) {
		this.nota = nota;
	}

	/**
	 * Retorna el valor almacenado en el atributo de clase que contiene el nombre de la asignatura
	 * @return Valor del atributo nombre de la asignatura
	 */
	public String getNombre() {
		return nombre;
	}
	
	/**
	 * Retorna la calificacion según el valor almacenado en el atributo nota
	 * @return Calificacion según nota
	 */
	public String calificacion() {
		String calificacion = (nota>4) ? "APROBADO" : "SUSPENSO";
		return calificacion;
		
	}
	
}
