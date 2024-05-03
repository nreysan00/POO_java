package ejemplo4;

public class ejemplo4 {

	public static void main(String[] args) {
		//Creamos los objetos
		libro libro1 = new libro(1111111111, "titulo1", "autor1", 30);
		libro libro2 = new libro(1111111112, "titulo2", "autor2", 60);
		
		//Mostramos su estado
		System.out.println(libro1.toString());
		System.out.println(libro2.toString());
		
		//Modificamos el atributo numPaginas del libro1
		libro1.setNumPaginas(70);
		
		//Comparamos quien tiene más páginas
		if(libro1.getNumPaginas() > libro2.getNumPaginas()) {
			System.out.println(libro1.getTitulo() + " tiene más páginas");
		}else {
			System.out.println(libro2.getTitulo() + " tiene más páginas");
		}

	}

}
