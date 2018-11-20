package Tests;

import java.util.ArrayList;

import Ejercicio03.Cuenta;

public class TestCuenta {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		ArrayList<Cuenta> cuentas = new ArrayList<Cuenta>();
		for (int x = 1; x <= 5; x++) {
			cuentas.add(new Cuenta());
		}

		for (Cuenta esta : cuentas) {
			System.out.println();
			System.out.println(esta.mostrarDatos());
		}

	}

}
