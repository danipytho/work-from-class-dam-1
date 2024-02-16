package ej1;

public class Main {
    public static void main(String[] args) {
        // Prueba de la clase Contador
        Contador contador1 = new Contador();  
        System.out.println("Contador 1: " + contador1.getCont());

        Contador contador2 = new Contador(5); 
        System.out.println("Contador 2: " + contador2.getCont());

        Contador contador3 = new Contador(contador2); 
        System.out.println("Contador 3: " + contador3.getCont());

        contador1.incrementar(); 
        System.out.println("Contador 1 después de incrementar: " + contador1.getCont());

        contador2.decrementar(); 
        System.out.println("Contador 2 después de decrementar: " + contador2.getCont());

        contador3.setCont(10); 
        System.out.println("Contador 3 después de establecer: " + contador3.getCont());
    }
}
