package ejemplo6;

public class ejemplo6 {

	public static void main(String[] args) {
		
		//Creo array de productos
		productos[] producto = new productos[3];
		
		//Creo los elementos
		producto[0] = new productos("producto 1", 10);
		producto[1] = new perecedero(1, "producto 2", 20);
		producto[2] = new noperecedero("tipo 1", "producto 3", 5);
		
		//Cálculo el precio
		double total=0;
		for(int i=0; i<producto.length; i++) {
			total += producto[i].calcular(5);
		}
		
		System.out.println("el total es " + total);
	}

}
