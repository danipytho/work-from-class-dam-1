package classarray;

import java.util.Arrays;

public class ej3 {

	public static void main(String[] args) {
		int[] array1 = new int[10];
		int[] array2 = new int[10];
		Arrays.fill(array1, 1);
		 array2 = Arrays.copyOf(array1, array1.length);
		// TODO Auto-generated method stub
		for (int i = 0; i < array1.length; i++) {
            System.out.print(array1[i]);
            System.out.println(" ");
            System.out.print(array2[i]);
            System.out.println(" ");
            

		}
		boolean sonIguales = Arrays.equals(array1, array2);
            if (sonIguales) {
                System.out.println("Los arrays son iguales.");
            } else {
                System.out.println("Los arrays no son iguales.");
            }
        
    }
    

	


}