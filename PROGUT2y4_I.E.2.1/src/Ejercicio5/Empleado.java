package Ejercicio5;

/**
 * 
 * Crea una clase Empleado que modele la información que una empresa mantiene
 * sobre cada empleado: NIF, sueldo base, pago por hora extra, horas extra
 * realizadas en el mes, tipo (porcentaje) de IRPF, casado o no y número de
 * hijos. La clase debe contemplar accedentes y mutadores para todos los
 * atributos. Al crear los objetos se podrá proporcionar, si se quiere, el
 * número de DNI
 * 
 * @author Antonio Torres Fernández
 *
 */
public class Empleado {
	/**
	 * Número del documento nacional de identidad del empleado
	 */
	private String dni;
	/**
	 * Salario Base del empleado
	 */
	private double salarioBase;
	/**
	 * Precio valor de la hora extraordinaria trabajada
	 */
	private double valorHoraExtra;
	/**
	 * Número de horas extras trabajadas en el mes actual
	 */
	private int horasExtras;
	/**
	 * Retencion en porcentaje aplicable al salario bruto referente a los impuestos de retenciones de personas físicas
	 */
	private double irpf;
	/**
	 * Información sobre el estado civil del empleado
	 */
	private boolean casado;
	/**
	 * Número de hijos del empleado
	 */
	private int hijos;

	/**
	 * @param salarioBase
	 * 			Salario Base que se le asignará al empleado	
	 * @param valorHoraExtra
	 * 			Valor que se le asignará a cada hora extra trabajada por el empleado
	 * @param horasExtras
	 * 			Total de horas extras trabajadas en el mes por el empleado
	 * @param irpf
	 * 			Porcentaje del impuesto de retenciones sobre personas físicas que se le aplicará al salario bruto del empleado
	 * @param casado
	 * 			Asignacion inicial sobre el estado civil del empleado
	 * @param hijos
	 * 			Número de hijos a cargo del empleado
	 */
	public Empleado(double salarioBase, double valorHoraExtra, int horasExtras, double irpf, boolean casado,
			int hijos) {

		dni = "00000000A";
		this.salarioBase = salarioBase;
		this.valorHoraExtra = valorHoraExtra;
		this.horasExtras = horasExtras;
		this.irpf = irpf;
		this.casado = casado;
		this.hijos = hijos;
	}

	/**
	 * @param salarioBase
	 * 			Salario Base que se le asignará al empleado	
	 * @param valorHoraExtra
	 * 			Valor que se le asignará a cada hora extra trabajada por el empleado
	 * @param horasExtras
	 * 			Total de horas extras trabajadas en el mes por el empleado
	 * @param irpf
	 * 			Porcentaje del impuesto de retenciones sobre personas físicas que se le aplicará al salario bruto del empleado
	 * @param casado
	 * 			Asignacion inicial sobre el estado civil del empleado
	 * @param hijos
	 * 			Número de hijos a cargo del empleado
	 * @param dni
	 * 			Número del documento nacional de identidad del empleado
	 */
	public Empleado(double salarioBase, double valorHoraExtra, int horasExtras, double irpf, boolean casado, int hijos,
			String dni) {

		this.dni = dni;
		this.salarioBase = salarioBase;
		this.valorHoraExtra = valorHoraExtra;
		this.horasExtras = horasExtras;
		this.irpf = irpf;
		this.casado = casado;
		this.hijos = hijos;
	}

	/**
	 * Devuelve de DNI del empleado
	 * @return retorna el DNI del empleado
	 */
	public String getDni() {
		return dni;
	}

	/**
	 * Asigna un nuevo valor para el DNI del empleado
	 * @param dni Nuevo valor a asignar para el DNI del empleado
	 */
	public void setDni(String dni) {
		this.dni = dni;
	}

	/**
	 * Retorna el valor del sueldo base asignado al empleado
	 * @return Retorna el valor del sueldo base asignado al empleado
	 */
	public double getSalarioBase() {
		return salarioBase;
	}

	/**
	 * Asigna un nuevo valor para el salario base del empleado
	 * @param salarioBase nuevo valor a asignar para el salario base del empleado
	 */
	public void setSalarioBase(double salarioBase) {
		this.salarioBase = salarioBase;
	}

	/**
	 * Retorna el valor de la hora extra
	 * @return Retorna el valor de la hora extra
	 */
	public double getValorHoraExtra() {
		return valorHoraExtra;
	}

	/**
	 * Asigna un nuevo valor a la hora extra
	 * @param valorHoraExtra Nuevo valor a asignar para la hora extra
	 */
	public void setValorHoraExtra(double valorHoraExtra) {
		this.valorHoraExtra = valorHoraExtra;
	}

	/**
	 * Retorna el número de horas extras trabajadas por el empleado
	 * @return Retorna el número de horas extras trabajadas por el empleado
	 */
	public int getHorasExtras() {
		return horasExtras;
	}

	/**
	 * Asigna un nuevo valor al número de horas extras trabajadas por el empleado
	 * @param horasExtras Nuevo valor a asignar para el número de horas extras trabajadas por el empleado
	 */
	public void setHorasExtras(int horasExtras) {
		this.horasExtras = horasExtras;
	}

	/**
	 * Retorna el valor del IRPF(en %) asignado al empleado
	 * @return Retorna el valor del IRPF(en %) asignado al empleado
	 */
	public double getIrpf() {
		return irpf;
	}

	/**
	 * Asigna un nuevo valor para el porcentaje de IRPF que se le aplicará al empleado
	 * @param irpf Nuevo valor para el porcentaje de IRPF que se le aplicará al trabajador
	 */
	public void setIrpf(double irpf) {
		this.irpf = irpf;
	}

	/**
	 * Retorna verdadero o falso según el estado civil (casado) del empleado
	 * @return Retorna verdadero o falso según el estado civil (casado) del empleado
	 */
	public boolean isCasado() {
		return casado;
	}

	/**
	 * Asigna verdadero o falso al estado civil (casado) del empleado
	 * @param casado Nuevo valor para asignar el estado civil (casado) del empleado
	 */
	public void setCasado(boolean casado) {
		this.casado = casado;
	}

	/**
	 * Retorna el número de hijos del empleado
	 * @return Retorna el número de hijos del empleado
	 */
	public int getHijos() {
		return hijos;
	}

	/**
	 * Asigna un nuevo valor al número de hijos del empleado
	 * @param hijos Nuevo valor a asignar para en número de hijos del empleado
	 */
	public void setHijos(byte hijos) {
		this.hijos = hijos;
	}

	/**
	 * Retorna valor calculado del numero de horas trabajadas por el valor de cada hora extra
	 * @return Retorna el producto del valor de hora extra y el número de horas extras trabajadas por el empleado
	 */
	public double calculoHorasExtras() {
		return valorHoraExtra * horasExtras;

	}

	/**
	 * Retorna el calculo del salario bruto del empleado
	 * @return Retorna la suma del calculo de horas extras más el salario base del empleado
	 */
	public double calculoSueldoBruto() {
		return calculoHorasExtras() + salarioBase;
	}

	/**
	 * Retorna el cálculo de la retención total que se le aplicara al salario bruto del empleado
	 * @return Retorna el importe a retener perteneciente al porcentaje aplicado al salario bruto dependiendo del número de hijos y el estado civil del empleado
	 */
	public double calculoRetenciones() {
		irpf -= hijos;
		if (casado)
			irpf -= 2;
		return (irpf / 100) * this.calculoSueldoBruto();
	}

	/**
	 * Retorna una descripción básica de los datos del empleado
	 * @return Retorna una descripción básica de los datos del empleado
	 */
	public String printLn() {
		String cadena;
		String estaCasado = (casado) ? "SI" : "NO";
		cadena = "DNI : " + dni + "\n";
		cadena += "Valor de la Hora Extra : " + String.format("%.2f", valorHoraExtra) + "€\n";
		cadena += "Horas extras trabajadas : " + horasExtras + "\n";
		cadena += "Porcentaje de IRPF : " + String.format("%.2f", irpf) + "%" + "\n";
		cadena += "Casado : " + estaCasado + "\n";
		cadena += "Número de hijos : " + hijos + "\n";
		return cadena;

	}

	/**
	 * Retorna una descripcion completa de todos los datos y valores del empleado
	 * @return Retorna una descripción completa de todos los datos y valores del empleado
	 */
	public String printAll() {
		String cadena = this.printLn();
		cadena += "Salario Base : " + String.format("%.2f", salarioBase) + "€\n";
		cadena += "Complemento por Horas Extras : " + String.format("%.2f", this.calculoHorasExtras()) + "€\n";
		cadena += "Sueldo bruto : " + String.format("%.2f", this.calculoSueldoBruto()) + "€\n";
		cadena += "Importe IRPF : " + String.format("%.2f", this.calculoRetenciones()) + "€\n";
		cadena += "Sueldo neto : " + String.format("%.2f", (this.calculoSueldoBruto() - this.calculoRetenciones()))
				+ "€\n";
		return cadena;
	}

}
