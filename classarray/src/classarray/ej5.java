package classarray;

public class ej5 {

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
	        int[] arr = {64, 34, 25, 12, 22, 11, 90};
	        bubbleSort(arr);
	        for (int i : arr) {
	            System.out.print(i + " ");
	        }
	        System.out.println();
	    }
	}