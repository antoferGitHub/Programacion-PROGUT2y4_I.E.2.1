package Ejercicio12;

import java.util.Scanner;

public class TestEmpleado {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner scn = new Scanner(System.in);
		String nombre;
		int horas;
		
		
		System.out.println("Indique el nombre del empleado...");
		nombre = scn.nextLine();
		
		do {
			System.out.println("Indique el número de horas trabajadas por el empleado...");
			scn.close();
			horas=scn.nextInt();
		}while(!scn.hasNextInt());
		
		System.out.println("HOla");
		
		
		

	}

}
