package herencia;

public class repartidor extends empleado {
	
	//Atributos
	private String zona;
	
	//Constructores
	public repartidor(String zona, String nombre, int edad, double salario) {
		super(nombre, edad, salario);
		this.zona = zona;
	}
	
	//Métodos
	public String getZona() {
		return zona;
	}

	public void setZona(String zona) {
		this.zona = zona;
	}

	@Override
	public String toString() {
		return super.toString() + " zona=" + zona;
	}
	
	@Override
	public boolean plus() {
		if (super.getEdad() < 25 && this.zona.equalsIgnoreCase("zona 3")) {
			//Con super. llamo a la clase padre
			double nuevoSalario = super.getSalario() + super.plus;
			super.setSalario(nuevoSalario);
			System.out.println("Se le ha añadido el plus, al empleado " + super.getNombre());
			return true;
		}
		return false;
	}
	
	

}