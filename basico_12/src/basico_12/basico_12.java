package basico_12;

public class basico_12 {

	public static void main(String[] args) {
		int num=1;
		
		while (num<=100) {
			if (num%2==0 || num%3==0) {
				System.out.println(num);
			}
			num++;
		}

	}
	
	//Con for sería:
	
	/**
	 * for (int num=1; num<=100; num++) {
	 * 	if (num%2==0 || num%3==0) {
	 * 		System.out.println(num);
	 * 		}
	 * 	}
	 * }
	 * 	
	 */

}
