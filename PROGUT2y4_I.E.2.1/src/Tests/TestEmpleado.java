package Tests;

import Ejercicio5.Empleado;

public class TestEmpleado {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Empleado empleado1 = new Empleado(1000.00,10.00,10,20.00,false, (short) 2,"14324462Q");
		System.out.println(empleado1.printLn());
		System.out.println();
		System.out.println(empleado1.printAll());
	}

}
