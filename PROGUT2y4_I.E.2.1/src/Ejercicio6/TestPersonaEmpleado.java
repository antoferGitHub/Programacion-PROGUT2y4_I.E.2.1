package Ejercicio6;

public class TestPersonaEmpleado {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		Persona persona1 = new Persona("Antonio",38); // Creamos un objeto de la clase Persona
		Empleado empleado1 = new Empleado("Juan",30,1000); // Creamos un objeto de la clase Empleado
		
		System.out.println(persona1.datosPersona());
		System.out.println(empleado1.datosPersona());
		System.out.println("Sueldo : " + String.format("%.2f", empleado1.getSueldo()));

	}

}
