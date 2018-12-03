package Ejercicio15;

import java.util.Scanner;

public class TestCuenta {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner cajero = new Scanner(System.in);
		Cuenta cuenta;
		boolean salida = false;

		do {
			switch (mostrarMenu()) {
			case 1:////////////////////////////////////////////////////////////////////////////
				if (Cuenta.cuentaYaCreada()) {
					System.out.println("Ya tiene una cuenta abierta.");
					break;
				} else {
					cuenta = new Cuenta();
					System.out.println("Nueva cuenta creada con saldo 0,00€");
					break;
				}

			case 2:////////////////////////////////////////////////////////////////////////////
				if (Cuenta.cuentaYaCreada()) {
					System.out.println("Ya tiene una cuenta abierta.");
					break;
				} else {
					boolean rep = true;
					do {
						System.out.println("Indique el saldo inicial de la nueva cuenta.");
						try {
							cuenta = new Cuenta(cajero.nextFloat());
							rep = false;
						} catch (Exception ex) {
							System.out.println("La cantidad introducida no es correcta. Intentelo de nuevo.");
							cajero.next();
							rep = true;
						} 
					} while (!rep);

				}

			case 3://///////////////////////////////////////////////////////////////
				float cantidad = 0;
				boolean rep = true;
				do {
					System.out.println("Indique la cantidad a ingresar...");
					try {
						cuenta.ingresar(cajero.nextFloat());
					} catch (Exception ex) {
						System.out.println("El dato introducido no es correcto. Intentelo de nuevo.");
						cajero.next();
						rep = true;
					} 
				} while (!rep);
				break;
			case 4:////////////////////////////////////////////////////////////////////
				break;
			case 5:////////////////////////////////////////////////////////////////////
				break;
			case 6:////////////////////////////////////////////////////////////////////
				System.out.println("Gracias por su visita. Vuelva pronto.");
				salida = true;
				break;
			}
		} while (!salida);

	}

	public static int mostrarMenu() {
		// Creamos objeto Scanner para capturar opción deseada por el usuario
		Scanner scn = new Scanner(System.in);
		// Limpiamos la consola
		System.out.print("\033[H\033[2J");
		System.out.flush();

		// Mostramos el menú
		String menu = "1.- Crear cuenta vacia.\n";
		menu += "2.- Crear cuenta con saldo inicial.\n";
		menu += "3.- Ingresar dinero.\n";
		menu += "4.- Sacar dinero.\n";
		menu += "5.- Ver saldo.\n";
		menu += "6.- Salir.\n";
		menu += "\n";
		menu += "Indique la opción a realizar...\n";

		return scn.nextInt();

	}

}
