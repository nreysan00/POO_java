package herencia;

public class comercial extends empleado {
	
	//Atributos
	private double comision;
	
	//Constructores
	public comercial(double comision, String nombre, int edad, double salario) {
		super(nombre, edad, salario);
		this.comision = comision;
	}

	//Métodos
	public double getComision() {
		return comision;
	}

	public void setComision(double comision) {
		this.comision = comision;
	}

	@Override
	public String toString() {
		return super.toString() + "comision=" + comision;
	}
	
	@Override
	public boolean plus() {
		if (super.getEdad() > 30 && this.comision > 200) {
			//Con super. llamo a un metodo de la clase padre
			double nuevoSalario = super.getSalario() + super.plus;
			super.setSalario(nuevoSalario);
			System.out.println("Se le ha añadido el plus, al empleado " + super.getNombre());
			return true;
		}
		
		return false;
	}
	
	
}
