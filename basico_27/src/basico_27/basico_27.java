package basico_27;
import java.util.Scanner;

public class basico_27 {

	public static void main(String[] args) {
		Scanner sn=new Scanner(System.in);
		System.out.println("Introduce un número: ");
		int num = sn.nextInt();
		
		int contador=0;
		
		while(num!=-1) {
			System.out.println("Introduce un número: ");
			contador++;
			num=sn.nextInt();
		}
		
		System.out.println("Fin, se ha introducido "+contador+" números");

	}

}
