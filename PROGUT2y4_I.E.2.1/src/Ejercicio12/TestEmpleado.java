package Ejercicio12;

import java.util.Scanner;

public class TestEmpleado {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner scn = new Scanner(System.in);
		String nombre = null;
		int horas = 0;
		double tarifa = 0;
		Empleado[] empleados = new Empleado[3];

		for (int x = 1; x <= 3; x++) {
			// solicitamos el nombre del empleado
			System.out.println("Indique el nombre del empleado " + x);
			nombre = scn.next();

			// solicitamos las horas trabajadas por el empleado
			boolean ok = false;
			do {
				System.out.println("Indique el número de horas trabajadas por el empleado " + x);
				try {
					horas = scn.nextInt();
					ok = true;
				} catch (Exception e) {
					System.out.println("El dato introducido no es correcto. Vuelva a intentarlo.");
					ok = false;
					scn.next();
				}
			} while (!ok);

			// solicitamos la tarifa que se le asignara al empleado
			ok = false;
			do {
				System.out.println("Indique la tarifa que se le aplicará al empleado " + x);
				try {
					tarifa = scn.nextDouble();
					ok = true;
				} catch (Exception e) {
					System.out.println("El dato introducido no es correcto. Vuelva a intentarlo.");
					ok = false;
					scn.next();
				}
			} while (!ok);

			// Creamos el nuevo empleado con los datos recogidos
			empleados[x - 1] = new Empleado(nombre, horas, tarifa);

		}
		
		for (Empleado lista : empleados) {
			System.out.println(lista.sueldoBruto());
		}

	}

}
