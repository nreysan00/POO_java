package ejemplo_alumno;
import java.util.Scanner;

public class ejemplo_alumno {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
        
        System.out.println("Introduce el nombre: ");
        String nombre = sc.nextLine();
        
        System.out.println("Introduce la asignatura: ");
        String asignatura = sc.nextLine();
        
        System.out.println("Introduce la nota: ");
        int nota = sc.nextInt();
		
		alumno alumno1 = new alumno(nombre, asignatura, nota);
		
		/*System.out.println(nombre );
		System.out.println(asignatura );
		System.out.println(nota ); */
		System.out.println(alumno1.toString());

	}

}
