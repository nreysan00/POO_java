package basico_15;
import java.util.Scanner;

public class basico_15 {

	public static void main(String[] args) {
		
		int codigo;
		Scanner sc = new Scanner(System.in);
		do {
			System.out.println("Introduce un número mayor que 0");
			codigo=sc.nextInt();
		}while (codigo<=0);
		
		System.out.println(codigo);

	}

}
