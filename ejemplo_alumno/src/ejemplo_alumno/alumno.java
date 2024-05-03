package ejemplo_alumno;

public class alumno {
	String nombre;
	String asignatura;
	int nota;
	
	public alumno(String nombre, String asignatura, int nota) {
		this.nombre = nombre;
		this.asignatura = asignatura;
		this.nota = nota;
	}

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
		if (nota <= 4) {
		return "El alumno " + nombre + " ha obtenido insuficiente en la asignatura " + asignatura;
	}else if (nota == 5){
		return "El alumno " + nombre + " ha obtenido suficiente en la asignatura " + asignatura;
	}else if (nota <= 6) {
		return "El alumno " + nombre + " ha obtenido bien en la asignatura " + asignatura;
	}else if (nota <=8) {
		return "El alumno " + nombre + " ha obtenido notable en la asignatura " + asignatura;
	}else {
		return "El alumno " + nombre + " ha obtenido sobresaliente en la asignatura " + asignatura;
	}
	
	}
}
