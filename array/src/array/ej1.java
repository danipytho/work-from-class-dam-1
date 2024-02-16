package array;

import java.util.Scanner;

public class ej1 {

	public static void main(String[] args) {
		int [] numeros = new int [10];
		
		relllenararry(numeros);
		mostrararry(numeros);
		
		
		// TODO Auto-generated method stub

	}
public static void relllenararry(int []num)
{
	Scanner sc = new Scanner(System.in);
	for (int i= 0; i<num.length;i++) {
		System.out.println("escribe numero ");
		num[i]=sc.nextInt();
	}
}
	

	public static void mostrararry(int []num)
	{
		
		for (int i= 0; i<num.length;i++) {
			System.out.println("en la posicion " +i + " el numero es "+ num[i]);
			
		}
}
}
