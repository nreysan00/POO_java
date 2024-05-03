package ejemplo2;

public class ejemplo2 {

	public static void main(String[] args) {
		coche v1 = new coche(0, 0, 0);
		coche v2 = new coche(1, 1, 0);
		
		v1.motor = 1;
		v1.luces = 1;
		
		System.out.println(v1);
		System.out.println(v2);
	}

}
