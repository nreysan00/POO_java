package ejercicio8;

public class contacto {
	
	//Atributos
	private String nombre;
	private int telefono;
	
	public contacto (String nombre, int telefono) {
		this.nombre = nombre;
		this.telefono = telefono;
	}
	
	public contacto(String nombre) {
		this.nombre = nombre;
		this.telefono = 0;
	}

	//Métodos
	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public int getTelefono() {
		return telefono;
	}

	public void setTelefono(int telefono) {
		this.telefono = telefono;
	}
	
	public boolean equals(contacto c) {
		
		if(this.nombre.trim().equalsIgnoreCase(c.getNombre().trim())) {
			return true;
		}
		return false;
	}

	@Override
	public String toString() {
		return "nombre=" + nombre + ", telefono=" + telefono;
	}
	
	
}
