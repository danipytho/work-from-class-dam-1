package ej2;

public class Cuenta {

	private String nombreCliente;
	private String numCuenta;
	private double tipoInteres;
	private double saldo;
// por defecto
	public Cuenta() {
		super();
		this.nombreCliente = "";
		this.numCuenta = "";
		this.tipoInteres = 0;
		this.saldo = 0;
	}
	//constructor
	public Cuenta(String nombreCliente, String numCuenta, double tipoInteres, double saldo) {
		super();
		this.nombreCliente = nombreCliente;
		this.numCuenta = numCuenta;
		this.tipoInteres = tipoInteres;
		this.saldo = saldo;
	}
	//copia
	public Cuenta(Cuenta c) {
		super();
		this.nombreCliente = c.nombreCliente;
		this.numCuenta = c.numCuenta;
		this.tipoInteres = c.tipoInteres;
		this.saldo = c.saldo;
	}

//getter/setter (sourse)
	public String getNombreCliente() {
		return nombreCliente;
		
	}

	public String getNumCuenta() {
		return numCuenta;
	}

	public void setNumCuenta(String numCuenta) {
		this.numCuenta = numCuenta;
	}

	public double getTipoInteres() {
		return tipoInteres;
	}

	public void setTipoInteres(double tipoInteres) {
		this.tipoInteres = tipoInteres;
	}

	public double getSaldo() {
		return saldo;
	}

	public void setSaldo(double saldo) {
		this.saldo = saldo;
	}

	public void setNombreCliente(String nombreCliente) {
		this.nombreCliente = nombreCliente;
	}
	// Método ingreso
    public boolean ingreso(double cantidad) {
        if (cantidad >= 0) {
            saldo += cantidad;
            return true;
        } else {
            return false;
        }
    }
    // metodo sacar dinero
    public boolean reintegro(double cantidad) {
        if (cantidad >= 0 && saldo >= cantidad) {
            saldo -= cantidad;
            return true;
        } else {
            return false;
        }
    }
    // transferir
    public boolean transferencia(Cuenta cuentaDestino, double importe) {
        if (importe >= 0 && saldo >= importe) {
            saldo -= importe;	
            cuentaDestino.saldo += importe;
            return true;
        } else {
            return false;
        }
    }

}
