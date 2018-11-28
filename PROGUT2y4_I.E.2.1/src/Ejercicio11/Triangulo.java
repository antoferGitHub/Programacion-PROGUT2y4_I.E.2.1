package Ejercicio11;

/**
 * Se quiere definir una clase Triangulo que represente al pol�gono Triangulo.
 * 
 * @author Antonio Torres Fern�ndez
 *
 */
public class Triangulo {

	private double lado1;
	private double lado2;
	private double lado3;

	/**
	 * Constructor por defecto sin par�metros
	 */
	public Triangulo() {
		lado1 = 1;
		lado2 = 1;
		lado3 = 1;

	}

	/**
	 * Constructor sobrecargado
	 * 
	 * @param lado1 Medida del lado 1 del tri�ngulo
	 * @param lado2 Medida del lado 2 del tri�ngulo
	 * @param lado3 Medida del lado 3 del tri�ngulo
	 */
	public Triangulo(double lado1, double lado2, double lado3) {
		this.lado1 = lado1;
		this.lado2 = lado2;
		this.lado3 = lado3;

	}

	/**
	 * Compara dos tri�ngulos
	 * 
	 * @param a Primer tri�ngulo a comparar
	 * @param b Segundo tri�ngulo a comparar
	 * @return Retorna Verdadero si los triangulos indicados son iguales
	 */
	public static boolean compareTo_Triangulos(Triangulo a, Triangulo b) {
		if (a.lado1 != b.lado1 || a.lado2 != b.lado2 || a.lado3 != b.lado3) {
			return false;
		} else {
			return true;
		}
	}

	/**
	 * Determina si un grupo de tri�ngulos son iguales
	 * 
	 * @param triangulos Array con el conjunto de triangulos a comparar
	 * @return Retorna Verdadero si todos los triangulos indicados son iguales
	 */

	public static boolean compare_vTriangulos(Triangulo[] triangulos) {

		boolean iguales = true;
		for (int x = 0; x < triangulos.length - 1; x++) {
			iguales = compareTo_Triangulos(triangulos[x], triangulos[x + 1]);
			if (!iguales)
				break;
		}

		return iguales;
	}

	/**
	 * Comprueba y devuelve el tipo de tri�ngulo
	 * 
	 * @param t Objeto de la clase Triangulo que se comparar�
	 * @return Retorna un entero correspondiente al tipo de triangulo 1 - Equil�tero
	 *         2 - Is�sceles 3 - Escaleno
	 */
	public int tipoTriangulo(Triangulo t) {
		int tipo = 0;
		if (t.lado1 == t.lado2) {
			if (t.lado2 == t.lado3) {
				tipo = 1;
			} else {
				tipo = 2;
			}
		} else {
			if (t.lado2 == t.lado3 || t.lado1 == t.lado3) {
				tipo = 2;
			} else {
				tipo = 3;
			}
		}

		return tipo;
	}

}
