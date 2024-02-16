package ej4;

public class electrodomesticos {
    protected String color;
    protected double precioBase;
    protected String consumo;
    protected double peso;

    // Valores por defecto que tambien son los valores del constructor por defecto
    protected static final String colord = "blanco";
    protected static final double preciod = 100.0;
    protected static final char consumod = 'F';
    protected static final double pesod = 5.0;
    private static final String[]  colores = {"blanco", "negro", "rojo", "azul", "gris"};
    private static final char[] letras = {'A', 'B', 'C', 'D', 'E', 'F'};
    private static final double[] PRECIOS_CONSUMO = {100, 80, 60, 50, 30, 10};
    
    
    
//contructor por defecto
    public electrodomesticos() {
        this.color = colord;
        this.precioBase = preciod;
        this.consumo = consumod;
        this.peso = pesod;
        
        
        
        
        
    }
    public electrodomesticos(double precioBase, String color, String string, double peso) {
    	super();
        this.precioBase = precioBase;
        this.color = colord;
        setColor(color); 
        this.consumo = string;
        this.peso = peso;
    }



	public String getColor() {
		return color;
	}

	public void setColor(String color) {
		this.color = color;
	}

	public double getPrecioBase() {
		return precioBase;
	}

	public void setPrecioBase(double precioBase) {
		this.precioBase = precioBase;
	}

	public char getConsumo() {
		return consumo;
	}

	public void setConsumo(char consumo) {
		this.consumo = consumo;
	}

	public double getPeso() {
		return peso;
	}

	public void setPeso(double peso) {
		this.peso = peso;
	}

	public static String getColord() {
		return colord;
	}

	public static double getPreciod() {
		return preciod;
	}

	public static char getConsumod() {
		return consumod;
	}

	public static double getPesod() {
		return pesod;
	}
    
	
    
	//inportant
	public void setConsumo1(char cons) {
		char letraConsumo = Character.toUpperCase(cons);
		if (letraConsumo == 'A' || letraConsumo == 'B' || letraConsumo == 'C' || letraConsumo == 'D' || letraConsumo == 'E') {
		
	    
	
	    
	}
		private void setColor1(String cons) {
		    String letraConsumo = cons.toUpperCase();
		    if (letraConsumo.equals("blanco") || letraConsumo.equals("B") || letraConsumo.equals("C")
		            || letraConsumo.equals("D") || letraConsumo.equals("E")) {
		        
		    
		}
		    
		
		
	
    

}
}
