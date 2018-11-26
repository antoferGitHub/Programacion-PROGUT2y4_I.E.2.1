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

	/**
	 * Constructor por defecto sin parámetros
	 */
	public Triangulo() {
		lado1 = 1;
		lado2 = 1;
		lado3 = 1;

	}

	/**
	 * Constructor sobrecargado
	 * 
	 * @param lado1 Medida del lado 1 del triángulo
	 * @param lado2 Medida del lado 2 del triángulo
	 * @param lado3 Medida del lado 3 del triángulo
	 */
	public Triangulo(double lado1, double lado2, double lado3) {
		this.lado1 = lado1;
		this.lado2 = lado2;
		this.lado3 = lado3;

	}

	/**
	 * Compara dos triángulos
	 * 
	 * @param a Primer triángulo a comparar
	 * @param b Segundo triángulo a comparar
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
	 * Determina si un grupo de triángulos son iguales
	 * 
	 * @param triangulos Array con el conjunto de triangulos a comparar
	 * @return Retorna Verdadero si todos los triangulos indicados son iguales
	 */
	public static boolean compare_vTriangulos(Triangulo[] triangulos) {
		double l1 = 0, l2 = 0, l3 = 0;

		for (Triangulo tActivo : triangulos) {
			if (l1 == 0) {
				l1 = tActivo.lado1;
				l2 = tActivo.lado2;
				l3 = tActivo.lado3;

			} else {
				if (l1 != tActivo.lado1 || l2 != tActivo.lado2 || l3 != tActivo.lado3) {
					return false;
				}
			}
		}

		return true;
	}

	/**
	 * Comprueba y devuelve el tipo de triángulo
	 * 
	 * @param t Objeto de la clase Triangulo que se comparará
	 * @return Retorna un entero correspondiente al tipo de triangulo
	 * 1 - Equilátero
	 * 2 - Isósceles
	 * 3 - Escaleno
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

		System.out.println("Todo ok");
		return tipo;
	}

}
