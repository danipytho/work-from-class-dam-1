package EXP;

import java.util.InputMismatchException;
import java.util.Scanner;

import javax.swing.Spring;

public class ej2 {
	public static void main(String[] args) {
        boolean f0 = false;
        while (!f0) {

        try {
        	Scanner sc = new Scanner(System.in);
            System.out.println("Select the first number to divide: ");
            String f1 = sc.toString();

            System.out.println("Select the second number to divide: ");
            String f2 = sc.toString();

            
            System.out.println("Result: " + f3);
            f0 = true;
        } catch (InputMismatchException e) {
            System.out.println("Error: Please enter valid numeric values.");
            System.out.println();
        }

        }
    }
}
		
	}

}
