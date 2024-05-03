package ejemplo6;

public class productos {
	
	//Atributos
	private String nombre;
	private double precio;
	
	//Constructores
	public productos(String nombre, double precio) {
		this.nombre = nombre;
		this.precio = precio;
	}
	
	//Métodos
	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public double getPrecio() {
		return precio;
	}

	public void setPrecio(double precio) {
		this.precio = precio;
	}

	@Override
	public String toString() {
		return "nombre=" + nombre + ", precio=" + precio +", ";
	}
	
	public double calcular(int cantidad) {
		return precio * cantidad;
	}
}