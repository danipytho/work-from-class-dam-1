package array;
import java.util.Scanner;
public class ej4 {
	static Scanner sc = new Scanner(System.in);
	public static void main(String[] args) {
		char[] alphabet = new char[26];
		char[] alphabet2 = new char[6];
        char currentLetter = 'A';
        
        for (int i = 0; i < alphabet.length; ++i) {
            alphabet[i] = currentLetter;
           
            currentLetter++;
        }
        for (int w = 0; w <6; ++w) {
            System.out.println("escoja un numero:");
            int f1=sc.nextInt();
            f1-=1;
        
        char value = alphabet[f1];
        
        	 System.out.println("lettra:" + value);
        	
                 alphabet2[w] = value;
                
        	 
        	 
        	 } 
        for (int i = 0; i < alphabet2.length; i++) {
            System.out.println("palabras escogida "+ alphabet2[i]);
    }
}
}
	
	
	
	


	
