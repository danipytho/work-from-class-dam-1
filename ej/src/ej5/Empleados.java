package ej5;

public class Empleados {
    private String nombre;
    private int edad;
    private double salario;
    private final double PLUS = 300;

    // Constructor principal
    public Empleados(String nombre, int edad, double salario) {
        this.nombre = nombre;
        this.edad = edad;
        this.salario = salario;
    }

    // Constructor de copia
    public Empleados(Empleados otroEmpleado) {
        this.nombre = otroEmpleado.nombre;
        this.edad = otroEmpleado.edad;
        this.salario = otroEmpleado.salario;
    }
    

    // Getter y Setter para el nombre
    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    // Getter y Setter para la edad
    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    // Getter y Setter para el salario
    public double getSalario() {
        return salario;
    }

    public void setSalario(double salario) {
        this.salario = salario;
    }

    // Método para calcular el salario total
    public double calcularSalarioTotal() {
        return salario + PLUS;
    }

    // Método plus para la clase Empleados (clase padre)
    public void plus() {
        // Implementación predeterminada para la clase Empleados (puede ser modificada en subclases si es necesario)
        System.out.println("Aplicado plus general para el empleado: " + nombre);
        salario += PLUS;
    }

    @Override
    public String toString() {
        return "Empleado [nombre=" + nombre + ", edad=" + edad + ", salario=" + salario + "]";
    }

    // Clase Repartidor que hereda de Empleados
    public class Repartidor extends Empleados {
        private String zona;

        // Constructor
        public Repartidor(String nombre, int edad, double salario, String zona) {
            super(nombre, edad, salario);
            this.zona = zona;
        }

        // Getter y Setter para la zona
        public String getZona() {
            return zona;
        }

        public void setZona(String zona) {
            this.zona = zona;
        }

        // Método específico para Repartidor
        public void repartir() {
            System.out.println("Repartiendo en la zona " + zona);
        }

        // Método plus específico para Repartidor
        @Override
        public void plus() {
            if (getEdad() < 25 && zona.equals("zona3")) {
                System.out.println("Aplicado plus para el Repartidor: " + getNombre());
                setSalario(getSalario() + PLUS);
            }
        }

        @Override
        public String toString() {
            return super.toString() + " [zona=" + zona + "]";
        }
    }

    // Clase Comercial que hereda de Empleados
    public class Comercial extends Empleados {
        private String zonaVentas;
        private double comision;

        // Constructor
        public Comercial(String nombre, int edad, double salario, String zonaVentas, double comision) {
            super(nombre, edad, salario);
            this.zonaVentas = zonaVentas;
            this.comision = comision;
        }

        // Getter y Setter para la zona de ventas
        public String getZonaVentas() {
            return zonaVentas;
        }

        public void setZonaVentas(String zonaVentas) {
            this.zonaVentas = zonaVentas;
        }

        // Getter y Setter para la comisión
        public double getComision() {
            return comision;
        }

        public void setComision(double comision) {
            this.comision = comision;
        }

        // Método específico para Comercial
        public void vender() {
            System.out.println("Realizando ventas en la zona " + zonaVentas);
        }

        // Método plus específico para Comercial
        @Override
        public void plus() {
            if (getEdad() > 30 && comision > 200) {
                System.out.println("Aplicado plus para el Comercial: " + getNombre());
                setSalario(getSalario() + PLUS);
            }
        }

        @Override
        public String toString() {
            return super.toString() + " [zonaVentas=" + zonaVentas + ", comision=" + comision + "]";
        }
    }
}

    
    