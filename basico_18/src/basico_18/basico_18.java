package basico_18;
import java.util.Scanner;

public class basico_18 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Introduce el primer número: ");
		int num1=sc.nextInt();
		
		System.out.println("Introduce el segundo número: ");
		int num2=sc.nextInt();
		
		for (int i=0; i<10 ; i++) {
			int numAleatorio=(int)Math.floor(Math.random()*(num1-num2)+num2);
			System.out.println(numAleatorio);
		}

	}

}
