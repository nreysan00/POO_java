package ejemplo5;

public class alumno {
	//Atributos
	String nombre;
	int nota;
	String asignatura;
	
	/*Constructores*/
	public alumno(String nombre, int nota, String asignatura) {
		
	}

	/*Métodos*/
	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getAsignatura() {
		return asignatura;
	}

	public void setAsignatura(String asignatura) {
		this.asignatura = asignatura;
	}

	public int getNota() {
		return nota;
	}

	public void setNota(int nota) {
		this.nota = nota;
	}
	
	@Override
	public String toString() {
		return "El alumno " + nombre + " ha obtenido " + nota + " en la asignatura " + asignatura;
	}
}