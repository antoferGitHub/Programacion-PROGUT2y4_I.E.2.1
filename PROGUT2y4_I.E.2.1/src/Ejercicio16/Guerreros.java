package Ejercicio16;

public class Guerreros extends Personajes {

	private String arma;

	public Guerreros(String nombre, int energia, String arma) {
		super(nombre, energia);
		this.arma = arma;

	}

	public String combatir(int energia) {
		this.nivelEnergia -= energia;
		return "Arma : " + this.arma + " Energía de Ataque : " + energia;
		
	}
	
	
}
