package array;

import java.util.Random;
import java.util.Scanner;
public class ej2 {
	

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.println( " el numero es ");
		int f1=sc.nextInt();
		int [] numeros = new int [f1];
		relllenararry(numeros, f1);
		mostrararry(numeros);
		
		
		// TODO Auto-generated method stub

	}
public static void relllenararry(int []num, int f1)
{
	
		
		
 for (int i = 0; i < f1; i++) {
     int randomNumber = (int) Math.floor(Math.random() * (10 - 0) + 0);
     num[i] = randomNumber;
     

	}
}

	

	public static void mostrararry(int []num)
	{int sumnumeros = 0;
		
		for (int i= 0; i<num.length;i++) {
			System.out.println( " el numero es "+ num[i]);
		
			sumnumeros += num[i];
			
		}
		System.out.println( " el numero total "+ sumnumeros);
}
}
