package ejemplo5;
//import javax.swing.JOptionPane;

public class ejemplo5 {

	public static void main(String[] args) {
		//Pedimos datos por pantalla
		//String nombre = JOptionPane.showInputDialog("Introduce tu nombre: ");
		
		//String texto = JOptionPane.showInputDialog("Introduce la nota obtenida: ");
		//int nota = Integer.parseInt(texto);
		
		//String asignatura = JOptionPane.showInputDialog("Introduce la asignatura: ");
				
		//Creamos objeto
		alumno alumno1 = new alumno("Natán", 7, "Lengua");
		
		System.out.println(alumno1.toString());
		
		
	}

}
