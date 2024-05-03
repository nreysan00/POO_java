package ejemplo7;

public class Almacen {
	
	//Atributos
	private Bebida[][] estanteria;
	
	//Constructores
	public Almacen(int filas, int columnas) {
		estanteria = new Bebida[filas][columnas];
	}
	
	public Almacen() {
		estanteria = new Bebida[5][5];
	}

	//Métodos
	
	public void agregarBebida (Bebida b) {
		boolean encontrado = false;
		for (int i = 0; i < estanteria.length && !encontrado; i++ ) {
			for (int j = 0; j < estanteria[0].length && !encontrado ; j++) {
				if (estanteria[i][j] == null) {
					estanteria[i][j] = b; //Inserto bebida
					encontrado = true; //Salgo
				}
			}
		}
		
		//Indico si se ha añadido la bebida o no
		
		if (encontrado) {
			System.out.println("Bebida añadida");
		}else {
			System.out.println("No se ha podido añadir la bebida");
		}
	}
	
	public void eliminarBebida(int id) {
		
		boolean encontrado = false;
		for (int i=0; i < estanteria.length && !encontrado; i++) {
			for (int j=0; j < estanteria[0].length && !encontrado; j++) {
				if (estanteria[i][j] != null ) {
					if (estanteria[i][j].getId() == id) {
						estanteria[i][j] = null; //Elimino bebida
						encontrado = true; //Salgo
					}
				}
			}
		}
	
		//Indico si se ha eliminado
		if (encontrado) {
			System.out.println("Bebida eliminada");
		}else {
			System.out.println("No existe la bebida");
		}
	}
	
	//Recorro las estanterías y muestro las bebidas
	public void mostrarBebidas() {
		
		for (int i=0; i < estanteria.length ; i++) {
			for (int j=0; j < estanteria[0].length; j++) {
				if (estanteria[i][j] != null) { //Controlo nulos
					System.out.println("fila" + i + ", columna: " + j + " Bebida: " + estanteria[i][j].toString());
				}
			}
		}
	}
	
	//Calculo el precio de todas las bebidas
	public double calcularPrecioBebidas() {
		
		double precioTotal = 0;
		for (int i=0; i < estanteria.length; i++) {
			for (int j=0; j < estanteria[0].length; j++) {
				if (estanteria[i][j] != null) { //Controlo nulos
					precioTotal += estanteria[i][j].getPrecio(); //Acumulo el precio
				}
			}
		}
		return precioTotal;
	}
	
	public double calcularPrecioBebidas(String marca) {
		
		double precioTotal = 0;
		for (int i=0; i < estanteria.length; i++) {
			for (int j=0; j < estanteria[0].length; j++) {
				if (estanteria[i][j] != null) {
					
					if (estanteria[i][j].getMarca().equalsIgnoreCase(marca)) {
						precioTotal += estanteria[i][j].getPrecio(); //Acumulo el precio
					}
				}
			}
		}
		return precioTotal;
	}
	
	public double calcularPrecioBebidas(int columna) {
		
		double precioTotal = 0;
		if (columna >= 0 && columna < estanteria[0].length) {
			
			for(int i=0; i < estanteria.length; i++) {
				if (estanteria[i][columna] != null) { //Controlo nulos
					precioTotal += estanteria[i][columna].getPrecio(); //Acumulo el precio
				}
			}
		}else {
		System.out.println("La columna debe estar entre 0 y " + estanteria[0].length);	
		}
		return precioTotal;
	}
}
