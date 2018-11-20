package Ejercicio04;

/**
 * 
 * Desarrolla una clase Cafetera con atributos _capacidadMaxima (la cantidad
 * máxima de café que puede contener la cafetera) y _cantidadActual (la cantidad
 * actual de café que hay en la cafetera).
 * 
 * @author Antonio Torres Fernández
 *
 */
public class Cafetera {

	private int capacidadMaxima;
	private int cantidadActual;

	public Cafetera() {
		capacidadMaxima = 1000;
		cantidadActual = 0;
	}

	public Cafetera(int capacidadMaxima) {
		this.capacidadMaxima = capacidadMaxima;
		this.cantidadActual = capacidadMaxima;

	}

	public Cafetera(int capacidadMaxima, int cantidadActual) {

		if (cantidadActual > capacidadMaxima) {
			cantidadActual = capacidadMaxima;
		}
		this.capacidadMaxima = capacidadMaxima;
		this.cantidadActual = cantidadActual;

	}

	public int getCapacidadMaxima() {
		return capacidadMaxima;
	}

	public void setCapacidadMaxima(int capacidadMaxima) {
		this.capacidadMaxima = capacidadMaxima;
	}

	public int getCantidadActual() {
		return cantidadActual;
	}

	public void setCantidadActual(int cantidadActual) {
		this.cantidadActual = cantidadActual;
	}

	public void llenarCafetera() {
		cantidadActual = capacidadMaxima;
	}

	public void servirTaza(int dosis) {
		cantidadActual -= dosis;
		if (cantidadActual < 0)
			vaciarCafetera();
	}

	public void vaciarCafetera() {
		cantidadActual = 0;
	}

	public void agregarCafe(int cantidad) {
		cantidadActual += cantidad;
		if (cantidadActual > capacidadMaxima)
			llenarCafetera();
	}

}
