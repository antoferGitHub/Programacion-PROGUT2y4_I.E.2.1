package Ejercicio09;

public class Estudiante extends Persona{

	private int codigo;
	private String categoria;
	private float pagoPensiones;
	private String colegioProc;
	
	public Estudiante(String apellidos, String nombre, String sexo, String dni, int codigo, String categoria,
			float pagoPensiones, String colegioProc) {
		super(apellidos, nombre, sexo, dni);
		this.codigo = codigo;
		this.categoria = categoria;
		this.pagoPensiones = pagoPensiones;
		this.colegioProc = colegioProc;
	}
	
	public float descuentoPPP(int rango) {
		
		float descuento=0;
		if (rango>=13) {
			descuento=8;
			if (rango>=16) {
				descuento=15;
			}	
		}
		return descuento;
	}
}
