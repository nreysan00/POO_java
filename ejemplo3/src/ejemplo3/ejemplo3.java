package ejemplo3;

public class ejemplo3 {

	public static void main(String[] args) {
		cuenta cuenta_1 = new cuenta("DiscoDurodeRoer");
		cuenta cuenta_2 = new cuenta("Natán", 300);

		//Ingresa dinero en las cuentas
		cuenta_1.ingresar(300);
		cuenta_2.ingresar(400);
		
		//Retiramos dinero en las cuentas
		cuenta_1.retirar(500);
		cuenta_2.retirar(100);
		
		//Muestro información de las cuentas
		System.out.println(cuenta_1); //0 euros
		System.out.println(cuenta_2); //600 euros
	}

}
