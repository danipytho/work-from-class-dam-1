package array;

import java.util.Random;
import java.util.Scanner;

public class ej6 {

	 public static void main(String[] args) {
	        Scanner scanner = new Scanner(System.in);

	        System.out.print("Introduce el tamaño de los arrays: ");
	        int tamano = scanner.nextInt();

	        int[] primerArray = generarNumerosAleatorios(tamano);
	        int[] segundoArray = generarNumerosAleatorios(tamano);
	        int[] resultado = multiplicarArrays(primerArray, segundoArray);

	        System.out.print("Primer Array: ");
	        mostrarArray(primerArray);

	        System.out.print("Segundo Array: ");
	        mostrarArray(segundoArray);

	        System.out.print("Resultado: ");
	        mostrarArray(resultado);

	        scanner.close();
	    }

	    private static int[] generarNumerosAleatorios(int tamano) {
	        int[] array = new int[tamano];
	        Random random = new Random();

	        for (int i = 0; i < tamano; i++) {
	        	array[i]= (int) Math.floor(Math.random() * (100 - 0) + 0);
	        }

	        return array;
	    }

	    private static int[] multiplicarArrays(int[] array1, int[] array2) {
	        int[] resultado = new int[Math.min(array1.length, array2.length)];

	        for (int i = 0; i < resultado.length; i++) {
	            resultado[i] = array1[i] * array2[i];
	        }

	        return resultado;	
	    }

	    private static void mostrarArray(int[] array) {
	        for (int i = 0; i < array.length; i++) {
	            System.out.print(array[i]);
	            if (i < array.length - 1) {
	                System.out.print(", ");
	            }
	        }
	        System.out.println();
	    }
	}

