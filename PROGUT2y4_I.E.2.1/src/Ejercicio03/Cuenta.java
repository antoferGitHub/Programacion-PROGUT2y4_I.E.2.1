package Ejercicio03;

/**
 * Crea una clase Cuenta (bancaria) con atributos para el número de cuenta (un
 * entero largo), el DNI del cliente (otro entero largo), el saldo actual y el
 * interés anual que se aplica a la cuenta (porcentaje).
 * 
 * @author Antonio Torres Fernández
 *
 */
public class Cuenta {

	/**
	 * Atributo propio de clase que se utiliza como contador para la asignación de
	 * los nuevos números de cuenta creados
	 */
	private static long numeroCuenta = 100001;

	/**
	 * Número de cuenta bancaria
	 */
	private long numCuenta;

	/**
	 * Número del documenta nacional de identidad del titular de la cuenta bancaria
	 */
	private long dni;

	/**
	 * Saldo (en Euros) de la cuenta bancaria
	 */
	private double saldo;

	/**
	 * Interes anual (en %) aplicable a la cuenta bancaria
	 */
	private float interesA;

	// crea un constructor por defecto y otro constructor con DNI, saldo e interés
	/**
	 * Constructor por defecto
	 */
	public Cuenta() {
		numeroCuenta += 1;
		numCuenta = numeroCuenta;
		dni = 0;
		saldo = 0;
		interesA = 0;
	}

	/**
	 * Constructor con parametros para dni,saldo y porcentaje de interes
	 * 
	 * @param dni      número de documento nacional de identidad del tirular de la
	 *                 cuenta bancaria
	 * @param saldo    Saldo inicial de apertura de la cuenta bancaria
	 * @param interesA Porcentaje de interes aplicable a la cuenta bancaria
	 */
	public Cuenta(long dni, float saldo, float interesA) {
		numeroCuenta += 1;
		numCuenta = numeroCuenta;
		this.dni = dni;
		this.saldo = saldo;
		this.interesA = interesA;

	}

	/**
	 * devuelve el DNI del titular de la cuenta bancaria
	 * 
	 * @return devuelve el DNI del titular de la cuenta bancaria
	 */
	public long getDni() {
		return dni;
	}

	/**
	 * Asigna un nuevo valor al DNI del titular de la cuenta bancaria
	 * 
	 * @param dni Nuevo valor al DNI del titular de la cuenta bancaria
	 */
	public void setDni(long dni) {
		this.dni = dni;
	}

	/**
	 * Devuelve el saldo actual de la cuenta bancaria
	 * 
	 * @return Devuelve el saldo actual de la cuenta bancaria
	 */
	public double getSaldo() {
		return saldo;
	}

	/**
	 * Asigna un nuevo saldo a la cuenta bancaria
	 * 
	 * @param saldo nuevo saldo a la cuenta bancaria
	 */
	public void setSaldo(double saldo) {
		this.saldo = saldo;
	}

	/**
	 * Devuelve el valor del interes asignado a la cuenta bancaria
	 * 
	 * @return Devuelve el valor del interes asignado a la cuenta bancaria
	 */
	public float getInteresA() {
		return interesA;
	}

	/**
	 * Asigna un nuevo valor para el interés asignado a la cuenta bancaria
	 * 
	 * @param interesA Nuevo valor para el interés asignado a la cuenta bancaria
	 */
	public void setInteresA(float interesA) {
		this.interesA = interesA;
	}

	/**
	 * Devuelve el número de cuenta
	 * 
	 * @return Devuelve el número de cuenta
	 */
	public long getNumCuenta() {
		return numCuenta;
	}

	public void actualizarSaldo() {
		saldo *= 1 + ((interesA / 365) / 100);
	}

	/**
	 * Actualiza el saldo de la cuenta bancaria sumando el valor de un ingreso
	 * 
	 * @param ingreso Valor a ingresar
	 */
	public void ingresar(double ingreso) {
		saldo += ingreso;
	}

	/**
	 * Actualiza el saldo de la cuenta bancaria restando el valor de una retirada
	 * 
	 * @param retiro Valor a retirar
	 */
	public void retirar(double retiro) {
		if (retiro > saldo) {
			System.out.println("Imposible ejecutar retirada : No dispone de saldo suficiente");
		} else {
			saldo -= retiro;
		}
	}

	public String mostrarDatos() {
		String datos = "Número de cuenta : " + numCuenta + "\n" + "DNI del titular : " + dni + "\n" + "Saldo actual : "
				+ String.format("%,2f", saldo) + "\n" + "Interés anual aplicable : " + String.format("%,2f", interesA)
				+ "%";
		return datos;

	}
}
