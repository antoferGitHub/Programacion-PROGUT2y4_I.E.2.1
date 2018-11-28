package Ejercicio02;

/**
 *Crear una clase de nombre Vehiculo que contenga como atributos el
 *modelo de tipo String, la potencia de tipo double y la tracción a las
 *cuatro ruedas cRuedas de tipo boolean. El constructor de la clase
 *admitirá como argumento el modelo y tendrá como métodos de tipo get y
 *set para la potencia y para la tracción a las cuatro ruedas. La clase
 *contará con el método imprimir que retorna los datos de cada vehículo
 *y si tiene tracción a las cuatro ruedas.
 *
 * @author Antonio Torres Fernández
 *
 * 
 */
public class Vehiculo {

	/**
	 * Modelo del vehiculo
	 */
	private String modelo;
	/**
	 * Potencia del motor
	 */
	private double potencia;
	/**
	 * Informa si el vehiculo tiene traccion a las cuatro ruedas
	 */
	private boolean cRuedas;

	/**
	 * @param modelo Modelo del vehiculo
	 */
	public Vehiculo(String modelo) {
		this.modelo = modelo;

	}

	/**
	 * Devuelve la potencia del motor
	 * @return Devuelve la potencia del motor
	 */
	public double getPotencia() {
		return potencia;
	}

	/**
	 * Asigna una nueva potencia al motor
	 * 
	 * @param potencia Nueva potencia del motor
	 */
	public void setPotencia(double potencia) {
		this.potencia = potencia;
	}

	/**
	 * Devuelve si el vehiculo tiene traccion a las cuatro ruedas o no
	 * 
	 * @return devuelve TRUE si el vehiculo tiene traccion a las cuatro ruedas
	 */
	public boolean getcRuedas() {
		return cRuedas;
	}

	/**
	 * Asigna si el vehiculo dispone de traccion a las cuatro ruedas
	 * 
	 * @param cRuedas Nuevo valor para traccion
	 */
	public void setcRuedas(boolean cRuedas) {
		this.cRuedas = cRuedas;
	}

	/**
	 * Devuelve una cadena con la información completa del vehiculo
	 * 
	 * @return Devuelve una cadena con la información completa del vehiculo
	 */
	public String imprimir() {
		String descripcion = "Modelo : " + modelo + "\n" + "Potencia : " + potencia + "\n"
				+ "Tracción a las 4 ruedas : ";

		return  this.getcRuedas() ? descripcion + "SI" : descripcion + "NO";

	}

}
