package Ejercicio12;

public class Empleado {

	private String nombre;
	private int horas;
	private double tarifa;

	/**
	 * Constructor
	 * 
	 * @param nombre Nombre del nuevo empleado
	 * @param horas  Horas trabajadas
	 * @param tarifa Tarifa que se aplica a cada hora de trabajo
	 */
	public Empleado(String nombre, int horas, double tarifa) {
		this.nombre = nombre;
		this.horas = horas;
		this.tarifa = tarifa;

	}

	public String sueldoBruto() {
		double sueldoBruto = 40 * tarifa;
		if (horas > 40) {
			sueldoBruto += ((horas - 40) * 1.5) * tarifa;
		}
		return nombre + " trabajó " + horas + " horas con una tarifa de " + tarifa + "€ y cobrará " + sueldoBruto + "€";
	}

}
