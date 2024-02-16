package ej1;

public class Contador {
    private int cont;

    // Constructor por defecto
    public Contador() {
        this.cont = 0;
    }

    // Constructor con parámetros
    public Contador(int valorInicial) {
        this.cont = (valorInicial >= 0) ? valorInicial : 0;
    }

    // Constructor copia
    public Contador(Contador otroContador) {
        this.cont = otroContador.cont;
    }

    // Método getter
    public int getCont() {
        return cont;
    }

    // Método setter
    public void setCont(int nuevoValor) {
        this.cont = (nuevoValor >= 0) ? nuevoValor : 0;
    }

    // Método para incrementar el contador en una unidad
    public void incrementar() {
        this.cont++;
    }

    // Método para decrementar el contador en una unidad, nunca será negativo
    public void decrementar() {
        this.cont = (this.cont > 0) ? this.cont - 1 : 0;
    }
}