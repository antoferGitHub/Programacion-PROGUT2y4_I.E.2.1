package Ejercicio13;

public enum Contenido {
	BAJO('B'), MEDIO('M'), ALTO('A');

	private char abrev;

	private Contenido(char abrev) {
		this.abrev = abrev;
	}
	
	public char getAbrev() {
		return abrev;
	}

}
