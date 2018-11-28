package Ejercicio15;

/**
 * Crear una clase llamada Cuenta, que gestione las operaciones sobre la
 * cuenta
 * 
 * @author Antonio Torres Fernandez
 *
 */
public class Cuenta {
	
	private float saldo;
	private static boolean cuentaCreada;

	/**
	 * Contructor por defecto
	 */
	public Cuenta() {
		this.saldo=0;
		cuentaCreada=true;
		
	}
	
	public Cuenta(float saldo) {
		this.saldo=saldo;
		cuentaCreada=true;
	}
	
	/**
	 * Agrega al saldo de la cuesta la cantidad recibida
	 * 
	 * @param c cantidad a ingresar
	 */
	public void ingresar(float c) {
		saldo+=c;
	}
	
	public void extraer(float c) {
		saldo-=c;
	}
	
	public float gatSaldo() {
		return saldo;
	}
	
	public static boolean cuentaYaCreada() {
		return cuentaCreada;
	}
}
