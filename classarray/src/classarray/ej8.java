package classarray;

import java.util.Random;

public class ej8 {
	 public static void bubbleSort(int[] array1) {
	        int n = array1.length;
	        for (int i = 0; i < n - 1; i++) {
	            for (int j = 0; j < n - i - 1; j++) {
	                if (array1[j] > array1[j + 1]) {
	                    
	                    int temp = array1[j];
	                    array1[j] = array1[j + 1];
	                    array1[j + 1] = temp;
	                }
	            }
	        }
	    }

	public static void main(String[] args) {
		System.out.print(" array no ordenado");
		int[] randomArray = new int[10];
        Random random = new Random();
        for (int i = 0; i < randomArray.length; i++) {
            randomArray[i] = random.nextInt(100); 
            System.out.print(randomArray[i]+ " " );
            
        } bubbleSort(randomArray);

        System.out.println( " " );
        System.out.print(" array si ordenado");
        for (int num : randomArray) {
            System.out.print(num + " ");
        }
    }
}