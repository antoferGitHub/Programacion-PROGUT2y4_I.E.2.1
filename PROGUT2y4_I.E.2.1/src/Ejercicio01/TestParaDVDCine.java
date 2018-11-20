package Ejercicio01;

public class TestParaDVDCine {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		// Creamos el objeto miPeli de la clase DVDCine
		DVDCine miPeli = new DVDCine("Los otros", "The others", 2001, "Alejandro Amenabar",
				"Nicole Kidman,  Fionnula Flanagan,  Christopher Eccleston,  Alakina Mann, James Bentley,  Eric Sykes,  Elaine Cassidy,  Renée Asherson,  Michelle Fairley",
				"Terror", 104,
				"Isla de Jersey, 1945. La Segunda Guerra Mundial ha terminado, pero el marido de Grace (Nicole Kidman) no vuelve. Sola en un aislado caserón victoriano de la isla de Jersey, educa a sus hijos dentro de rígidas normas religiosas. Los niños sufren una extraña enfermedad: no pueden recibir directamente la luz del día. Los tres nuevos sirvientes que se incorporan a la vida familiar deben aprender una regla vital: la casa estará siempre en penumbra, y nunca se abrirá una puerta si no se ha cerrado la anterior. Pero el estricto orden que Grace ha impuesto se verá desafiado por circunstancias que escapan a su control. (FILMAFFINITY)");

		// Mostramos los datos de la película mediante el método muestraDVDCine.
		// Los métados (esThriller y tieneResumen) están probados dentro del método
		// muestraDVDCine que se ejecuta a continuación
		System.out.println(miPeli.muestraDVDCine());
		
	}

}
