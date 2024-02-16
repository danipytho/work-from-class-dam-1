package ej3;

import ej2.Cuenta;

public class Libro {
	//definir tipo variable
	public String nlibro;
	public String autor;
	public double nejemplar;
	public double nejemplarprestado;
	//constructor por defecto
	public Libro() {
		super();
		this.nlibro = "";
		this.autor = "";
		this.nejemplar = 0;
		this.nejemplarprestado = 0;
	
		
		

}//constructor copia
	public Libro(Libro c) {
		super();
		this.nlibro = c.nlibro;
		this.autor = c.autor;
		this.nejemplar = c.nejemplar;
		this.nejemplarprestado = c.nejemplarprestado;
		//getter setters
	}
	public String getNlibro() {
		return nlibro;
	}
	public void setNlibro(String nlibro) {
		this.nlibro = nlibro;
	}
	public String getAutor() {
		return autor;
	}
	public void setAutor(String autor) {
		this.autor = autor;
	}
	public double getNejemplar() {
		return nejemplar;
	}
	public void setNejemplar(double nejemplar) {
		this.nejemplar = nejemplar;
	}
	public double getNejemplarprestado() {
		return nejemplarprestado;
	}
	public void setNejemplarprestado(double nejemplarprestado) {
		this.nejemplarprestado = nejemplarprestado;
	}
	//comprovar si se a devuelto el libro
    public boolean devuelve() {
        if (this.nejemplarprestado > 0) {
            this.nejemplarprestado -= 1;
            return true;
        } else {
            return false;
        }


}// y sinceramente no tengo ni dea de qur hace esto
    public String toString() {
		return autor + nlibro + nejemplar + nejemplarprestado;
    	
    	
    }
}
	