package ej5;

public class main {
	public static void main(String[] args) {
	    // Create an instance of the Empleados class
	    Empleados empleados = new Empleados("Juan", 35, 2000);
	    empleados.plus();  // Apply plus for Empleados
	    System.out.println(empleados);

	    // Create an instance of the Repartidor class
	    Empleados.Repartidor repartidor = empleados.new Repartidor("Ana", 22, 1500, "zona3");
	    repartidor.plus();  // Apply plus for Repartidor
	    System.out.println(repartidor);

	    // Create an instance of the Comercial class
	    Empleados.Comercial comercial = empleados.new Comercial("Pedro", 32, 2500, "zonaA", 250);
	    comercial.plus();  // Apply plus for Comercial
	    System.out.println(comercial);
	}

}
