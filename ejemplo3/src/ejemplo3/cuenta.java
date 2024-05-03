package ejemplo3;

public class cuenta {
	//Atributos
	private String titular;
	private double cantidad;
	
	//Constructores
	public cuenta(String titular) {
		this(titular, 0);
	}
	
	public cuenta (String titular, double cantidad) {
		this.titular = titular ;
		//Si la cantidad es menor que 0, lo ponemos a 0
		if (cantidad < 0 ) {
			this.cantidad = 0 ;
		}else {
			this.cantidad = cantidad ;
		}
	}
	//Métodos
	public String getTitular() {
		return titular;
	}

	public void setTitular(String titular) {
		this.titular = titular;
	}

	public double getCantidad() {
		return cantidad;
	}

	public void setCantidad(double cantidad) {
		this.cantidad = cantidad;
	}
	
	public void ingresar (double cantidad) {
		if(cantidad > 0 ) {
			this.cantidad += cantidad;
		}
	}
	
	public void retirar (double cantidad) {
		if (this.cantidad - cantidad < 0) {
			this.cantidad = 0;
		}else {
			this.cantidad -= cantidad;
		}
	}

	@Override
	public String toString() {
		return "El titular " + titular + " tiene " + cantidad + " euros en la cuenta.";
	}
	
}
