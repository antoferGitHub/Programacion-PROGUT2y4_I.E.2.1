package Ejercicio17;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;

public class Test {

	/**
	 * La clase Test contendrá los métodos estáticos necesarios para controlar que
	 * el usuario introduzca los datos correctos. Además, contiene el método main
	 * donde se crearán 2 objetos de la clase Servidor y 2 de la clase Portátil
	 * mediante un constructor que reciba los parámetros. También se crearán 1
	 * objetos de la clase Servidor y 1 de la clase Portátil mediante el constructor
	 * por defecto, por lo que necesitarás llamar posteriormente a los métodos
	 * “establecer…” para asignar los valores que te indique el usuario a los
	 * atributos del objeto.
	 * 
	 * 
	 * @param args
	 * @throws IOException 
	 * @throws NumberFormatException 
	 */
	public static void main(String[] args) throws NumberFormatException, IOException {
		// TODO Auto-generated method stub

		Servidor serv1 = new Servidor(8, hddValido(), procesadorValido(), "ASUS Cerberus GeForce GTX 1050",
				monitorValido(), "Logitech K850 Plus", "Pictek Ratón Gaming");
		Servidor serv2 = new Servidor(8, hddValido(), procesadorValido(), "ASUS Cerberus GeForce GTX 1050",
				monitorValido(), "Logitech K400 Plus", "Pictek Ratón Gaming");

	}

	public static int hddValido() {
		Scanner scn = new Scanner(System.in);
		boolean rep = true;
		int entrada = 0, salida = 0;
		do {
			System.out.println("Indique la capacidad del disco duro.(multiplo de 5)...");
			try {
				entrada = scn.nextInt();
				if (entrada % 5 == 0) {
					rep = false;
					salida = entrada;
				} else {
					System.out.println("El número introducido no es multiplo de 5.Intentelo de nuevo.");
					//scn.next();
				}
			} catch (Exception ex) {
				System.out.println("El dato introducido no es correcto. Intentelo de nuevo.");
				scn.next();
			}
		} while (rep);

		scn.close();
		return salida;
	}

	public static float precioValido() {
		Scanner scn = new Scanner(System.in);
		boolean rep = true;
		float entrada = 0, salida = 0;
		do {
			System.out.println("Indique el precio del equipo.(mayor a 0,00€)...");
			try {
				entrada = scn.nextFloat();
				if (entrada > 0) {
					rep = false;
					salida = entrada;
				} else {
					System.out.println("El precio indicado es igual o menor a 0.Intentelo de nuevo.");
					scn.next();
				}
			} catch (Exception ex) {
				System.out.println("El dato introducido no es correcto. Intentelo de nuevo.");
				scn.next();
			}
		} while (!rep);

		scn.close();
		return salida;
	}

	public static int monitorValido() {
		BufferedReader scn=new BufferedReader(new InputStreamReader(System.in));
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
		} while (!rep);

		
		return salida;
	}

	public static String procesadorValido() throws NumberFormatException, IOException {
		BufferedReader bfr=new BufferedReader(new InputStreamReader(System.in));
		int entrada = 0;
		boolean rep = true;
		String salida = null;
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

			entrada = Integer.parseInt(bfr.readLine());
			try {
				
				
				
				if (entrada > 10 || entrada < 1) {
					
				} else {
					rep = false;
				}
			} catch (Exception ex) {
				System.out.println("Laaaaa opción introducida no es válida. Intentelo de nuevo");
				
			}
		} while (rep);

		return lista[entrada];
	}
}
