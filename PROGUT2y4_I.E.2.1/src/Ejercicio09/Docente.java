package Ejercicio09;

public class Docente extends Persona {

	private int codigo;
	private String categoria;
	private String estPostgrado;
	private int horasClase;
	private float pagoHora;

	public Docente(String apellidos, String nombre, String sexo, String dni, int codigo, String categoria,
			String estPostgrado, int horasClase, float pagoHora) {
		super(apellidos, nombre, sexo, dni);
		this.codigo = codigo;
		this.categoria = categoria;
		this.estPostgrado = estPostgrado;
		this.horasClase = horasClase;
		this.pagoHora = pagoHora;
	}

	public float pagoParcial() {

		return horasClase * pagoHora;
	}
	
	

}
