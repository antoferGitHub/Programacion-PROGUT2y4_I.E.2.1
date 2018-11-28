package Ejercicio11;


public class TestTriangulo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// TODO Auto-generated method stub
		
			
				
		//Creamos un array de objetos triangulos
		Triangulo[] misTriangulos = new Triangulo[3];
				
		//creamos un primer triangulo con el constructor por defecto y lo agregamos a nuestro ArrayList
		misTriangulos[0]=new Triangulo();
				
		//Creamos un segundo triangulo con el constructor sobrecargado y lo agregamos a nuestro ArrayList
		misTriangulos[1]=new Triangulo(2,2,2);
				
		//Creamos un tercer triangulo y lo agregamos a nuestro ArrayList
		misTriangulos[2]=new Triangulo(3,3,3);

		//Usamos el método compareTo_triangulos de la clase Triangulo
		boolean result = Triangulo.compareTo_Triangulos(misTriangulos[0],misTriangulos[2]);
		System.out.println("El resultado devuelto es : " + result);
		
		//Usamos el método compare_vTriangulos de la clase triangulo
		result = Triangulo.compare_vTriangulos(misTriangulos);
		String msg = result ? "Todos los triangulos son iguales" : "Se han encontrado triangulos diferentes";
		System.out.println(msg);
	}
}

