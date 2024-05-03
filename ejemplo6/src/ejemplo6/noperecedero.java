package ejemplo6;

public class noperecedero extends productos {
	
	//Atributos
	private String tipo;
	
	//Constructores
	public noperecedero(String tipo, String nombre, double precio) {
		super(nombre, precio);
		this.tipo = tipo;
	}
	
	//Métodos
	public String getTipo() {
		return tipo;
	}

	public void setTipo(String tipo) {
		this.tipo = tipo;
	}

	@Override
	public String toString() {
		return super.toString() + " tipo=" + tipo + "{ ";
	}
	
	
}
