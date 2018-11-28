package Ejercicio13;

public class Alimento {

	private String nombre;
	private float liquidos;
	private float hidratos;
	private float proteinas;
	private boolean origenAnimal;
	private Contenido vitaminas;
	private Contenido minerales;

	public Alimento(String nombre) {
		this.nombre = nombre;
		this.liquidos = 0;
		this.hidratos = 0;
		this.proteinas = 0;
		this.origenAnimal = true;
		this.vitaminas = Contenido.BAJO;
		this.minerales = Contenido.BAJO;

	}

	public Alimento(String nombre, float liquidos, float hidratos, float proteinas, boolean origenAnimal,
			String vitaminas, String minerales) {
		this.nombre = nombre;
		this.liquidos = liquidos;
		this.hidratos = hidratos;
		this.proteinas = proteinas;
		this.origenAnimal = origenAnimal;
		this.vitaminas = Contenido.valueOf(vitaminas.toUpperCase());
		this.minerales = Contenido.valueOf(minerales.toUpperCase());
	}

	public boolean esDietetico() {

		return (liquidos < 20 && vitaminas.name()=="BAJO") ? true : false;

	}

	public String muestraAlimento() {
		String origen = (this.esDietetico()) ? "SI" : "NO";

		

		String msg = nombre + "\n";
		msg += "Líquidos : " + String.format("%.2f", liquidos) + "%\n";
		msg += "Hidratos : " + String.format("%.2f", hidratos) + "%\n";
		msg += "Proteinas : " + String.format("%.2f", proteinas) + "%\n";
		msg += "Origen Animal : " + origen + "\n";
		msg += "Nivel de Minerales : " + minerales.name() + " - " + minerales.getAbrev() + "\n";
		msg += "Nivel de Vitaminas : " + vitaminas.name() + " - " + vitaminas.getAbrev() + "\n";

		return msg;

	}

}
