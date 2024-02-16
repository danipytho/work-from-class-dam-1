package ej2;

import java.util.Scanner;

import ej4.electrodomesticos;

public class main {
	public static void main(String[] args) {
		//inportant
		electrodomesticos elect1 = new electrodomesticos(100, "rojo", "a" , 22.3);
		 System.out.println(elect1);
		//inportant
        Scanner scanner = new Scanner(System.in);
        Cuenta cuenta = null;

        int opcion;
        do {
            System.out.println("\n--- Menú ---");
            System.out.println("1. Crear cuenta");
            System.out.println("2. Mostrar saldo de cuenta");
            System.out.println("3. Hacer ingreso en cuenta");
            System.out.println("4. Hacer transferencia");
            System.out.println("5. Mostrar datos de la cuenta");
            System.out.println("0. Salir");

            System.out.print("Selecciona una opción: ");
            opcion = scanner.nextInt();
// inport opptions
            switch (opcion) {
                case 1:
                	//llama a praivate static crar cuenta
                    cuenta = crearCuenta();
                    break;
                case 2:
                    mostrarSaldo(cuenta);
                    break;
                case 3:
                    hacerIngreso(cuenta);
                    break;
                case 4:
                    hacerTransferencia(cuenta);
                    break;
                case 5:
                    mostrarDatosCuenta(cuenta);
                    break;
                case 0:
                    System.out.println("Saliendo del programa. ¡Hasta luego!");
                    break;
                default:
                    System.out.println("Opción no válida. Inténtalo de nuevo.");
            }

        } while (opcion != 0);

        scanner.close();
    }

    private static Cuenta crearCuenta() {
       //consige informacion sobre la cuenta
    	Scanner scanner = new Scanner(System.in);
        System.out.print("Ingrese el nombre del cliente: ");
        String nombreCliente = scanner.nextLine();
        System.out.print("Ingrese el número de cuenta: ");
        String numCuenta = scanner.nextLine();
        System.out.print("Ingrese el tipo de interés: ");
        double tipoInteres = scanner.nextDouble();
        System.out.print("Ingrese el saldo inicial: ");
        double saldoInicial = scanner.nextDouble();
// rturns the information that has bean gathered to the main code
        return new Cuenta(nombreCliente, numCuenta, tipoInteres, saldoInicial);
    }

    private static void mostrarSaldo(Cuenta cuenta) {
        if (cuenta != null) {
            System.out.println("Saldo de la cuenta: " + cuenta.getSaldo());
        } else {
            System.out.println("Primero debes crear una cuenta.");
        }
    }

    private static void hacerIngreso(Cuenta cuenta) {
        if (cuenta != null) {
            Scanner scanner = new Scanner(System.in);
            System.out.print("Ingrese la cantidad a depositar: ");
            double cantidad = scanner.nextDouble();

            if (cuenta.ingreso(cantidad)) {
                System.out.println("Ingreso realizado correctamente. Nuevo saldo: " + cuenta.getSaldo());
            } else {
                System.out.println("Error: la cantidad ingresada no es válida.");
            }
        } else {
            System.out.println("Primero debes crear una cuenta.");
        }
    }

    private static void hacerTransferencia(Cuenta cuenta) {
        if (cuenta != null) {
            Scanner scanner = new Scanner(System.in);
            System.out.print("Ingrese el número de cuenta de destino: ");
            String numCuentaDestino = scanner.nextLine();
            Cuenta cuentaDestino = new Cuenta(); // Aquí deberías buscar la cuenta en tu sistema

            if (cuentaDestino != null) {
                System.out.print("Ingrese la cantidad a transferir: ");
                double cantidad = scanner.nextDouble();

                if (cuenta.transferencia(cuentaDestino, cantidad)) {
                    System.out.println("Transferencia realizada correctamente. Nuevo saldo: " + cuenta.getSaldo());
                } else {
                    System.out.println("Error: la cantidad ingresada no es válida o saldo insuficiente.");
                }
            } else {
                System.out.println("La cuenta de destino no existe.");
            }
        } else {
            System.out.println("Primero debes crear una cuenta.");
        }
    }

    private static void mostrarDatosCuenta(Cuenta cuenta) {
        if (cuenta != null) {
            System.out.println("Nombre del cliente: " + cuenta.getNombreCliente());
            System.out.println("Número de cuenta: " + cuenta.getNumCuenta());
            System.out.println("Tipo de interés: " + cuenta.getTipoInteres());
            System.out.println("Saldo actual: " + cuenta.getSaldo());
        } else {
            System.out.println("Primero debes crear una cuenta.");
        }
    }
}

