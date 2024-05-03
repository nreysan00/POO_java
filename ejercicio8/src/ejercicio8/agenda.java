package ejercicio8;

public class agenda {
	
	//Atributos
	private contacto[] contactos;
	
	//Constructores
	public agenda() {
		this.contactos = new contacto[10];	//Por defecto
	}
	
	public agenda(int tamanio) {
		this.contactos = new contacto[tamanio];	//Tamaño que nosotros queramos
	}
	
	//Métodos
	/**
	 * Añade un contacto a la agenda
	 */
	public void aniadirContacto(contacto c) {
		
		if (existeContacto(c)) {	//Indico si existe el contacto
			System.out.println("El contacto con ese nombre ya existe");
		}else if (agendaLlena()) {	//Indico si la agenda está llena o no llena
			System.out.println("La agenda está llena, no se pueden meter mas contactos");
		}else {
			
			boolean encontrado = false;
			for(int i=0; i < contactos.length && !encontrado; i++) {
				if (contactos[i] == null) {	//Controlo los nulos
					contactos[i] = c;	//Inserto el contacto
					encontrado = true;	//Indico que lo he encontrado
				}
			}
			if (encontrado) {
				System.out.println("Se ha añadido");
			}else {
				System.out.println("No se ha podido añadir");
			}
		}
	}
	
	/**
	 * Indica si existe un contacto
	 */
	public boolean existeContacto(contacto c) {
		
		for (int i=0; i < contactos.length; i++) {
			//Controlo nulos e indico si el contacto es el mismo
			if (contactos[i] != null && c.equals(contactos[i])) {
				return true;
			}
		}
		return false;
	}
	
	/**
	 * Lista los contactos de la agenda
	 */
	public void listarContactos() {
		if (huecosLibre() == contactos.length) {
			System.out.println("No hay contanctos que mostrar");
		}else {
			for (int i = 0; i < contactos.length; i++) {
				if (contactos[i] != null) {	//Controlo nulo
					System.out.println(contactos[i]);
				}
			}
		}
	}
	
	/**
	 * Busca un contacto por su nombre
	 */
	public void buscarPorNombre(String nombre) {
		
		boolean encontrado = false;
		for (int i=0; i < contactos.length && !encontrado; i++) {
			//Controlo nulos y compruebo que es el contacto buscado (forma mas engorrosa)
			if (contactos[i] != null && contactos[i].getNombre().trim().equalsIgnoreCase(nombre.trim())) {
				System.out.println("Su telefono es " + contactos[i].getTelefono());
				encontrado = true;	//Indico que lo he encontrado
			}
		}
		if (!encontrado) {
			System.out.println("No se ha encontrado el contacto");
		}
	}
	
	/**
	 * Indica si la agenda esta llena o no
	 */
	public boolean agendaLlena() {
		for (int i=0; i < contactos.length; i++) {
			if (contactos[i] == null) {	//Controlo nulos
				return false;
			}
		}
		return true;
	}
	
	/**
	 * Elimina un contacto de la agenda
	 */
	public void eliminarContacto(contacto c) {
		
		boolean encontrado = false;
		for (int i=0; i < contactos.length; i++) {
			if (contactos[i] != null && contactos[i].equals(c)) {
				contactos[i] = null;	//Controlo nulos
				encontrado = true;	//Indico que lo he encontrado
			}
		}
		
		if (encontrado) {
			System.out.println("Se ha eliminado el contacto");
		}else {
			System.out.println("No se ha eliminado el contacto");
		}
	}
	
	/**
	 * Indica cuantos contactos más podemos meter
	 */
	public int huecosLibre() {
		
		int contadorLibres = 0;
		for (int i=0; i < contactos.length; i++) {
			if (contactos[i] == null) {	//Controlo nulos
				contadorLibres++;	//Acumulo
			}
		}
		return contadorLibres;
	}
}
