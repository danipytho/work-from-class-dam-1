package array;

import java.util.Scanner;
import java.util.stream.IntStream;
import java.util.Arrays;
import java.util.Random;

public class ej3 {
	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		System.out.println(" el numero es ");
		int f1 = sc.nextInt();
		int[] numeros = new int[f1];
		// relllenararry(numeros, f1);

		boolean esPrimo;
		int randomNumber;
		for (int i = 0; i < numeros.length; i++) {
			esPrimo = false;
			randomNumber=0;
			
			while (esPrimo != true) {
				randomNumber = (int) Math.floor(Math.random() * (100 - 0) + 0);
				esPrimo = numprimo(randomNumber);
			}
			numeros[i] = randomNumber;
		}
		;

		int numprimo = 0;
		for (int i = 0; i < numeros.length; i++) {
			boolean esprimo = false;
			if (esprimo != true) {
				System.out.println("El número primo es " + numeros[i]);
			}

		}
		int nummayor = 0;

		for (int i = 0; i < numeros.length; i++) {
			if (nummayor < numeros[i]) {
				nummayor = numeros[i];

			}

		}
		System.out.println("El número primo mas grande es " + nummayor);
	}

	private static boolean numprimo(int num) {
		boolean esprimo = false;
		if (num >= 2) {
			for (int i = 2; i < num; i++) {
				if (num % i == 0) {
					esprimo = false;
					break;

				} else {
					esprimo = true;
				}
			}
		}

		return esprimo;

	}

//solo generar numeros que son primos
	// public static void relllenararry(int[] num, int f1) {
	// int[] num2 = new java.util.Random().ints(10, 0, 100)
	// .filter(x ->
	// java.math.BigInteger.valueOf(x).isProbablePrime(1)).limit(10).toArray();

	// for (int i = 0; i < f1; i++) {
	// num[i] = num2[i];
	// }
	// }
}
