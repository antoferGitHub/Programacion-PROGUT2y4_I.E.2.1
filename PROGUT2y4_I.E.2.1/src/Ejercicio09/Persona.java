package Ejercicio09;

public class Persona {
	
	private String apellidos;
	private String nombre;
	private String sexo;
	private String dni;
	
	
	public Persona(String apellidos, String nombre, String sexo, String dni) {
		this.apellidos = apellidos;
		this.nombre = nombre;
		this.sexo = sexo;
		this.dni = dni;
	}
	
	public Persona() {
		apellidos = "";
		nombre = "";
		sexo = "";
		dni = "";
	}

	public String getApellidos() {
		return apellidos;
	}

	public void setApellidos(String apellidos) {
		this.apellidos = apellidos;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getSexo() {
		return sexo;
	}

	public void setSexo(String sexo) {
		this.sexo = sexo;
	}

	public String getDni() {
		return dni;
	}

	public void setDni(String dni) {
		this.dni = dni;
	}
	
	
}
