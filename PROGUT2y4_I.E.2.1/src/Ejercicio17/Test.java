package Ejercicio17;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;


public class Test {

	/**
	 * La clase Test contendr� los m�todos est�ticos necesarios para controlar que
	 * el usuario introduzca los datos correctos. Adem�s, contiene el m�todo main
	 * donde se crear�n 2 objetos de la clase Servidor y 2 de la clase Port�til
	 * mediante un constructor que reciba los par�metros. Tambi�n se crear�n 1
	 * objetos de la clase Servidor y 1 de la clase Port�til mediante el constructor
	 * por defecto, por lo que necesitar�s llamar posteriormente a los m�todos
	 * �establecer�� para asignar los valores que te indique el usuario a los
	 * atributos del objeto.
	 * 
	 * 
	 * @param args
	 * @throws IOException
	 * @throws NumberFormatException
	 */
	public static void main(String[] args) throws NumberFormatException, IOException {
		// TODO Auto-generated method stub

		int hddValido = hddValido();
		String procesadorValido = procesadorValido();
		int monitorValido = monitorValido();
		float precioValido = precioValido();

		// Creamos los dos Objetos servidor mediante constructor con parametros
		Servidor serv1 = new Servidor(8, hddValido, procesadorValido, "ASUS Cerberus GeForce GTX 1050", monitorValido,
				"Logitech K850 Plus", "Pictek Rat�n Gaming",precioValido);
		Servidor serv2 = new Servidor(8, hddValido, procesadorValido, "ASUS Cerberus GeForce GTX 1050", monitorValido,
				"Logitech K400 Plus", "Pictek Rat�n Gaming",precioValido);

		// Creamos los dos Objetos portatil mediante constructor con parametros
		Portatil port1 = new Portatil(8, 500, "Ryzen Threadripper 2950X", "ASUS Cerberus GeForce GTX 1050", "Asus",
				monitorValido, 2300,precioValido);
		Portatil port2 = new Portatil(8, 500, "Core i9-9900K", "ASUS Cerberus GeForce GTX 1050", "Lenovo",
				monitorValido, 2900,precioValido);

		// Creamos un solo objeto servidor con el constructor por defecto (vacio)
		Servidor serv3 = new Servidor();
		// Pedimos al usuario que especifique todas las caracteristicas del equipo
		montarServidor(serv3);

		// Creamos un solo objeto Portatil con el constructor por defecto (vacio)
		Portatil port3 = new Portatil();
		// Pedimos al usuario que especifique todas las caracteristicas del equipo
		montarPortatil(port3);

	}

	public static void montarServidor(Servidor serv) throws NumberFormatException, IOException {
		// Primero solicitamos los atributos basicos

		// Pedimos
		// RAM////////////////////////////////////////////////////////////////////////////////////////////////////////////
		serv.setRam(ramValida());

		// Pedimos la capacidad de disco
		// duro///////////////////////////////////////////////////////////////////////////////////////
		serv.setHdd(hddValido());

		// Pedimos el
		// procesador////////////////////////////////////////////////////////////////////////////////////////////////////
		serv.setPro(procesadorValido());

		// Pedimos la targeta
		// gráfica///////////////////////////////////////////////////////////////////////////////
		serv.setGra(graficaValida());

		// Ahora solo los atributos especificos de cada clase
		serv.setPulMonitor(monitorValido());
		serv.setTeclado("Genérico");
		serv.setRaton("Genérico");

	}

	public static void montarPortatil(Portatil port) throws NumberFormatException, IOException {
		// Primero solicitamos los atributos basicos

		// Pedimos
		// RAM////////////////////////////////////////////////////////////////////////////////////////////////////////////
		port.setRam(ramValida());

		// Pedimos la capacidad de disco
		// duro///////////////////////////////////////////////////////////////////////////////////////
		port.setHdd(hddValido());

		// Pedimos el
		// procesador////////////////////////////////////////////////////////////////////////////////////////////////////
		port.setPro(procesadorValido());

		// Pedimos la targeta
		// gráfica///////////////////////////////////////////////////////////////////////////////
		port.setGra(graficaValida());

		// Ahora solo los atributos especificos de cada clase
		// Se entiende que el usuario no puede elegir ni el peso ni la marca del
		// portatil
		port.setMarca("Genérica");
		port.setPeso(2000);// en gramos
		port.setTamanoPantalla(monitorValido());
	}

	
	public static int ramValida() {
		BufferedReader scn = new BufferedReader(new InputStreamReader(System.in));
		boolean rep = true;
		int entrada = 0, salida = 0;
		do {
			System.out.println("Indique la capacidad de Memoria RAM.(mínimo 4)...");
			try {
				entrada = Integer.parseInt(scn.readLine());
				if (entrada % 4 == 0) {
					rep = false;
					salida = entrada;
				} else {
					System.out.println(
							"La capacidad indicada debe ser multiplo e igual o superior a 4. Intentelo de nuevo.");

				}
			} catch (Exception ex) {
				System.out.println("El dato introducido no es correcto. Intentelo de nuevo.");

			}
		} while (rep);

		return salida;
	}

	public static String graficaValida() {
		BufferedReader bfr = new BufferedReader(new InputStreamReader(System.in));
		int entrada = 0;
		boolean rep = true;
		String lista[] = { "GTX 1050 D5 2G", "GTX 1050 D5 3G", "GTX 1050 Ti StormX", "RX 570 Armor 4G OC",
				"GTX 1060 Dual 3GB", "RX 580 GTS XXX Edition", "GTX 1060 Gaming", "GTX 1070 WINDFORCE OC",
				"RX Vega 56 ROG Strix OC", "GTX 1070 Ti Windforce 8G" };
		do {
			System.out.println("Indique una targeta gráfica de la lista...");
			int contador = 1;
			for (String valor : lista) {
				System.out.println(contador + ".- " + valor);
				contador += 1;
			}

			try {
				entrada = Integer.parseInt(bfr.readLine());
				if (entrada > 10 || entrada < 1) {
					System.out.println("La opción indicada no es válida. Intentelo de nuevo.");
				} else {
					rep = false;

				}
			} catch (Exception ex) {
				System.out.println("Laaaaa opción introducida no es válida. Intentelo de nuevo");

			}
		} while (rep);

		return lista[entrada - 1];
	}

	public static int hddValido() {
		BufferedReader scn = new BufferedReader(new InputStreamReader(System.in));
		boolean rep = true;
		int entrada = 0, salida = 0;
		do {
			System.out.println("Indique la capacidad del disco duro.(multiplo de 5)...");
			try {
				entrada = Integer.parseInt(scn.readLine());
				if (entrada % 5 == 0) {
					rep = false;
					salida = entrada;
				} else {
					System.out.println("El n�mero introducido no es multiplo de 5.Intentelo de nuevo.");

				}
			} catch (Exception ex) {
				System.out.println("El dato introducido no es correcto. Intentelo de nuevo.");

			}
		} while (rep);

		return salida;
	}

	public static float precioValido() {
		BufferedReader scn = new BufferedReader(new InputStreamReader(System.in));
		boolean rep = true;
		float entrada = 0, salida = 0;
		do {
			System.out.println("Indique el precio del equipo.(mayor a 0,00�)...");
			try {
				entrada = Integer.parseInt(scn.readLine());
				if (entrada > 0) {
					rep = false;
					salida = entrada;
				} else {
					System.out.println("El precio indicado es igual o menor a 0.Intentelo de nuevo.");

				}
			} catch (Exception ex) {
				System.out.println("El dato introducido no es correcto. Intentelo de nuevo.");

			}
		} while (!rep);

		return salida;
	}

	public static int monitorValido() {
		BufferedReader scn = new BufferedReader(new InputStreamReader(System.in));
		boolean rep = true;
		int entrada = 0, salida = 0;
		do {
			System.out.println("Indique las pulgadas de la pantalla.(superior a 14\")...");
			try {
				entrada = Integer.parseInt(scn.readLine());
				if (entrada > 14) {
					rep = false;
					salida = entrada;
				} else {
					System.out.println("Las pulgadas indicadas no son correctas.Intentelo de nuevo.");

				}
			} catch (Exception ex) {
				System.out.println("El dato introducido no es correcto. Intentelo de nuevo.");

			}
		} while (rep);

		return salida;
	}

	
	
	
	public static String procesadorValido() throws NumberFormatException, IOException {
		BufferedReader bfr = new BufferedReader(new InputStreamReader(System.in));
		int entrada = 0;
		boolean rep = true;
		String lista[] = { "Ryzen Threadripper 2950X", "Ryzen Threadripper 1950X", "Ryzen Threadripper 2920X",
				"Core i9-9900K", "Ryzen 7 2700X", "Core i7-7800X", "Core i7-8700K", "Ryzen 7 1700X", "Core i7-8700",
				"Core i5-8600K" };
		do {
			System.out.println("Indique un procesador de la lista...");
			int contador = 1;
			for (String valor : lista) {
				System.out.println(contador + ".- " + valor);
				contador += 1;
			}

			try {
				entrada = Integer.parseInt(bfr.readLine());
				if (entrada > 10 || entrada < 1) {

				} else {
					rep = false;
				}
			} catch (Exception ex) {
				System.out.println("Laaaaa opci�n introducida no es v�lida. Intentelo de nuevo");

			}
		} while (rep);

		return lista[entrada];
	}
}
