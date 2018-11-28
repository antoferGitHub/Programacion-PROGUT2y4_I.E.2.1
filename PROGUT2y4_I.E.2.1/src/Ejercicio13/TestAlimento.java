package Ejercicio13;

public class TestAlimento {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Alimento miAlimento = new Alimento("Manzana");
		System.out.print("Alimento Dietético : ");
		System.out.println(miAlimento.esDietetico() ? "SI" : "NO");
		System.out.println(miAlimento.muestraAlimento());

		Alimento miAlimento2 = new Alimento("Manzana", 25f, 36f, 15f, false, "medio", "alto");
		System.out.print("Alimento Dietético : ");
		System.out.println(miAlimento2.esDietetico() ? "SI" : "NO");
		System.out.println(miAlimento2.muestraAlimento());
	}

}
