package basico_19;
import java.util.Scanner;

public class basico_19 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		int numero=0;
		do {
			System.out.println("Introduce un número");
			numero=sc.nextInt();
		}while (numero<0); int contador=0; for (int i=numero; i>0; i/=10) {
			contador++;
		}
		
		if (contador==1) {
			System.out.println("El número " + numero + " tiene " + contador + " cifra");
		}else {
			System.out.println("El número "+ numero + " tiene " + contador + " cifras");
		}

	}

}
