package interfaz_1;

public class videojuego implements interfaz1 {
	//Constantes
	private final static int HORAS_ESTIMADAS_DEF=100;
	
	public final static int MAYOR=1;
	
	public final static int MENOR=-1;
	
	public final static int IGUAL=0;
	
	//Atributos
	private String titulo;
	
	private int horasEstimadas;
	
	private boolean entregado;
	
	private String genero;
	
	private String compañia;

	//Métodos
	public String getTitulo() {
		return titulo;
	}

	public void setTitulo(String titulo) {
		this.titulo = titulo;
	}

	public int getHorasEstimadas() {
		return horasEstimadas;
	}

	public void setHorasEstimadas(int horasEstimadas) {
		this.horasEstimadas = horasEstimadas;
	}

	public String getGenero() {
		return genero;
	}

	public void setGenero(String genero) {
		this.genero = genero;
	}

	public String getCompañia() {
		return compañia;
	}

	public void setCompañia(String compañia) {
		this.compañia = compañia;
	}
	
	@Override
	public void entregar() {
		entregado=true;
	}
	
	@Override
	public void devolver() {
		entregado=false;
	}
	
	@Override
	public boolean isEntregado() {
		if (entregado) {
			return true;
		}
		return false;
	}
	
	@Override
	public int compareTo(Object a) {
		int estado=MENOR;
		
		videojuego ref=(videojuego )a;
		if (horasEstimadas>ref.getHorasEstimadas()) {
			estado=MAYOR;
		}else if (horasEstimadas==ref.getHorasEstimadas()) {
			estado=IGUAL;
		}
		return estado;
	}

	@Override
	public String toString() {
		return "Titulo= " + titulo + ", Horas estimadas= " + horasEstimadas + ", Entregado= " + entregado
				+ ", Género= " + genero + ", Compañía= " + compañia;
	}
	
	public boolean equals(videojuego a) {
		if (titulo.equalsIgnoreCase(a.getTitulo()) && compañia.equalsIgnoreCase(a.getCompañia())) {
			return true;
		}
		return false;
	}
	
	public videojuego() {
		this("", HORAS_ESTIMADAS_DEF, "", "");
	}
	
	public videojuego(String titulo, String compañia) {
		this(titulo, HORAS_ESTIMADAS_DEF, "", compañia);
	}
	
	public videojuego(String titulo, int horasEstimadas, String genero, String compañia) {
		this.titulo=titulo;
		this.horasEstimadas=horasEstimadas;
		this.genero=genero;
		this.compañia=compañia;
		this.entregado=false;
	}
	
}
