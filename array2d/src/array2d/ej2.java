package array2d;

import java.util.Scanner;

public class ej2 {
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print( "numero de columnas: ");
		int s = sc.nextInt();
		int [][] array1=new int[5][s];
		
		fillarray1(array1);
		

	}
	
	public static void fillarray1(int [][] matriz) {
		
			for(int i=0; i<matriz.length;i++) {
				for(int j=0;j<matriz[i].length;j++) {
					int randomNumber = (int) Math.floor(Math.random() * (10 - 0) + 0);
					matriz[i][j] = randomNumber;
					
					System.out.print(matriz[i][j]+ " ");
				}
				System.out.println();
			}
}
}

