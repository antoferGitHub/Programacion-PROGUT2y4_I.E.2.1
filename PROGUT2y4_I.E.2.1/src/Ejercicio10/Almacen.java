package Ejercicio10;

/**
 * Desarrolla un programa creando una clase que permita almacenar los kilos de
 * papas y chocos del restaurante.
 * 
 * @author Antonio Torres Fern�ndez
 *
 */
public class Almacen {

	private int kilosPapas;
	private int kilosChocos;
	private static String msg = "Cantidad actual de kilos de ";

	/**
	 * Constructor por defecto
	 */
	public Almacen() {
		kilosPapas = 0;
		kilosChocos = 0;

	}

	/**
	 * 
	 * Constructor con entrada de parametros
	 * 
	 * @param kilosPapas Valor inical para el atributo de clase
	 * @param kiloChocos Valor inicial para el atributo de clase
	 */
	public Almacen(int kilosPapas, int kiloChocos) {
		this.kilosPapas = kilosPapas;
		this.kilosChocos = kiloChocos;

	}

	/**
	 * A�ade el valor indicado a los kilos de chocos ya existentes
	 * 
	 * @param kilosChocos Valor con el n�mero de kilos de chocos a a�adir
	 */
	public void addChocos(int kilosChocos) {
		this.kilosChocos += kilosChocos;

	}

	/**
	 * A�ade el valor indicado a los kilos de papas ya existentes
	 * 
	 * @param kilosPapas Valor con la cantidad de papas a a�adir
	 */
	public void addPapas(int kilosPapas) {
		this.kilosPapas = kilosPapas;
	}

	/**
	 * Retorna el n�mero de clientes que peude atender el restaurante
	 * 
	 * @return N�mero de comensales que puede atender el restaurante
	 */
	public int getComensales() {
		boolean stock = true;
		int comensales = 0;

		while (stock) {
			if (kilosPapas >= 1 && kilosChocos >= 0.5) {
				comensales += 3;
				kilosPapas -= 1;
				kilosChocos -= 0.5;
			} else {
				stock = false;
			}
		}
		return comensales;

	}

	/**
	 * Muestra por pantalla la cantidad de chocos que hay en almac�n
	 */
	public void showPapas() {
		System.out.println(msg + "chocos : " + kilosChocos);
	}

	/**
	 * Muestra por pantalla la cantidad de papas que hay en el almac�n
	 */
	public void showChocos() {
		System.out.println(msg + "papas : " + kilosPapas);
	}

}
