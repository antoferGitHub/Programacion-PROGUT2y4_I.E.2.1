package Ejercicio11;

public class TestTriangulo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		//Contruiremos un triangulo sin parametros para usar el constructor por defecto
		Triangulo tri1 = new Triangulo();
		
		//Creamos otro objeto triangulo pero usando el constructor sobrecargado
		Triangulo tri2 = new Triangulo(2,2,2);
		
		//Compararemos los dos triangulos anteriormente creados
		if (Triangulo.compareTo_Triangulos(tri1,tri2)) {
			System.out.println("Los triangulos son iguales");
		}else
			System.out.println("Los triangulos no son iguales");
		}
	
		//Creamos un tercer triángulo
		Triangulo tri3 = new Triangulo(3,3,3);
		Triangulo[] triangulos = new Triangulo[3];
		triangulos[0]=tri1;
		triangulos[1]=tri2;
		triangulos[2]=tri3;
		
		if (compare_vTriangulos(triangulos)) {
			
		}
	

}
