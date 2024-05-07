package basico_17;
import java.util.Scanner;

public class basico_17 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Introduce un día de la semana: ");
		String dia = sc.next();
		
		switch(dia) {
			case "lunes":
			case "martes":
			case "miércoles":
			case "jueves":
			case "viernes":
				System.out.println("Es un día laboral");
				break;
			case "sabado":
			case "domingo":
				System.out.println("Es un día festivo");
				default:
					System.out.println("Introduce un día de la semana");
		}

	}

}
