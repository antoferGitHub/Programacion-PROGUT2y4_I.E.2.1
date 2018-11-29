package Ejercicio16;

public class TestPersonajes {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Guerreros guerrero = new Guerreros("Leonidas",90,"Espada");
		Magos mago = new Magos("Gandalf","FireBall");
		
		//Probamos metod combatir (propio de la clase guerrero) y el metodo alimentarse (heredado de la clase Personajes)
		guerrero.alimentarse(20);
		guerrero.combatir(30);
		
		//Probamos metodo encantar (propio de la clase Magos) y el metodo alimentarse (heredado de la clase Personajes)
		mago.alimentarse(30);
		mago.encantar();
		
	}

}
