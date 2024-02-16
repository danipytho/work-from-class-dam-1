package array2d;

import java.util.Scanner;

public class ej5 {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.print("Ingrese el tamaño de la matriz: ");
        int n = scanner.nextInt();
				
		
		
		int[][] matrizA = new int[n][n];
		
		
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
            	System.out.print("Ingrese el VALOR de la matriz: ");
            	int NNN = scanner.nextInt();
                matrizA[i][j] = NNN;
            }
        }
        int[][] matrizB = new int[n][n];
      
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
            	System.out.print("Ingrese el VALOR de la matrizB: ");
                int NN = scanner.nextInt();
                matrizB[i][j] = NN;
                
            }
        }
        int[][] matrizC = new int[n][n];
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                matrizC[i][j] = matrizA[i][j] + matrizB[i][j];
            }
        }
        System.out.println("MatrizA:");
        printMatrix(matrizA, n);

        System.out.println("\nMatrizB:");
        printMatrix(matrizB, n);

        System.out.println("\nMatrizC (MatrizA + MatrizB):");
        printMatrix(matrizC, n);
    }

    // Function to print a matrix
    private static void printMatrix(int[][] matrix, int size) {
        for (int i = 0; i < size; i++) {
            for (int j = 0; j < size; j++) {
                System.out.print(matrix[i][j] + " ");
            }
            System.out.println();
}
        }
	}

            

