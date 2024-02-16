package ej3;

import java.util.ArrayList;
import java.util.Scanner;

public class main {
	
	public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ArrayList<Libro> listaLibros = new ArrayList<>();
        int prestamos = 0;
// advanced windo closser if salir is false (!salir) do stu7ff
        boolean salir = false;
        while (!salir) {
            System.out.println("Menú:");
            System.out.println("1. Inserción de libros");
            System.out.println("2. Mostrar libros");
            System.out.println("3. Realizar préstamo");
            System.out.println("4. Realizar devolución");
            System.out.println("5. Salir");
            System.out.print("Elija una opción: ");
            int opcion = scanner.nextInt();
            scanner.nextLine();  // Limpiar el buffer
            double totalEjemplares = 0;
            Libro nuevoLibro = new Libro();
           
            //scanner.nextLine();  // Limpiar el buffer

            switch (opcion) {
                case 1:
                    System.out.print("Ingrese el nombre del libro: ");
                    String nombreLibro = scanner.nextLine();
                    System.out.print("Ingrese el autor del libro: ");
                    String autorLibro = scanner.nextLine();
                    System.out.print("Ingrese la cantidad total de ejemplares: ");
                    totalEjemplares = scanner.nextDouble();
                    
                    
                    
                    
// cambia los valores a los del constructor?
                    
                    nuevoLibro.setNlibro(nombreLibro);
                    nuevoLibro.setAutor(autorLibro);
                    nuevoLibro.setNejemplar(totalEjemplares);
                    
                    listaLibros.add(nuevoLibro);
                    
                    break;
                case 2:
                    System.out.println("Lista de libros:");
                    for (Libro libro : listaLibros) {
                        System.out.println(libro);
                    }
                    break;
                case 3:
                	if (totalEjemplares <0) {
                		
                		totalEjemplares -=1;
                		prestamos +=1;
                		System.out.print("nummero de ej"+totalEjemplares);
                	}
                    
                    break;
                case 4:
                	if (prestamos >0) {
                		prestamos -=1;
                		
                	}
                	else {
                		System.out.println("no hay libro que devolver    ");
                		
                	}
                		
                	
                    
                    break;
                case 5:
                    salir = true;
                    break;
                default:
                    System.out.println("Opción no válida");
            }
        }
        scanner.close();
        
    }

}

	


