package interfaz_1;

public class serie implements interfaz1 {
	//Constantes
	private final static int NUM_TEMPORADAS_DEF=3;
	
	public final static int MAYOR=1;
	
	public final static int MENOR=-1;
	
	public final static int IGUAL=0;
	
	//Atributos
	private String titulo;
	
	private int numeroTemporadas;
	
	private boolean entregado;
	
	private String genero;
	
	private String creador;

	//Métodos
	public String getTitulo() {
		return titulo;
	}

	public void setTitulo(String titulo) {
		this.titulo = titulo;
	}

	public int getNumeroTemporadas() {
		return numeroTemporadas;
	}

	public void setNumeroTemporadas(int numeroTemporadas) {
		this.numeroTemporadas = numeroTemporadas;
	}

	public String getGenero() {
		return genero;
	}

	public void setGenero(String genero) {
		this.genero = genero;
	}

	public String getCreador() {
		return creador;
	}

	public void setCreador(String creador) {
		this.creador = creador;
	}
	
	public void entregar() {
		entregado=true;
	}
	
	public void devolver() {
		entregado=false;
	}
	
	public boolean isEntregado() {
		if (entregado) {
			return true;
		}
		return false;
	}
	
	public int compareTo(Object a) {
		int estado=MENOR;
		
		serie ref=(serie)a;
		if (numeroTemporadas>ref.getNumeroTemporadas()) {
			estado=MAYOR;
		}else if (numeroTemporadas==ref.getNumeroTemporadas()){
			estado=IGUAL;
		}
		return estado;
	}

	@Override
	public String toString() {
		return "Título= " + titulo + ", Número de Temporadas= " + numeroTemporadas + ", entregado=" + entregado
				+ ", Genero= " + genero + ", Creador= " + creador ;
	}
	
	public boolean equals(serie a) {
		if (titulo.equalsIgnoreCase(a.getTitulo()) && creador.equalsIgnoreCase(a.getCreador())) {
			return true;
		}
		return false;
	}
	
	public serie() {
		this("", NUM_TEMPORADAS_DEF, "", "");
	}
	
	public serie(String titulo, String creador) {
		this(titulo, NUM_TEMPORADAS_DEF, "", creador);
	}
	
	public serie(String titulo, int numeroTemporadas, String genero, String creador) {
		this.titulo=titulo;
		this.numeroTemporadas=numeroTemporadas;
		this.genero=genero;
		this.creador=creador;
		this.entregado=false;
		
	}
}
