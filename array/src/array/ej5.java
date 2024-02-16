package array;

import java.util.Scanner;
import java.util.Random;

public class ej5 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Introduce el tamaño: ");
        int tamano = scanner.nextInt();

        System.out.print("Introduce el dígito: ");
        int digito = scanner.nextInt();

        int[] numerosAleatorios = generarNumerosAleatorios(tamano, digito);
        

        
        
    }

   
    

    private static int[] generarNumerosAleatorios(int tamano, int digito) {
        int[] array = new int[tamano];
        Random random = new Random();

        for (int i = 0; i < tamano; i++) {
        	array[i]= (int) Math.floor(Math.random() * (300 - 0) + 0);
        }

       

        
        for (int numero : array) {
            if (numero % 10 == digito) {
            	 System.out.print(numero + " ");
                
            }
        }
		return array;
        
        	
        }
}




     
