package interfaz_1;

public class interfaz_1 {

	public static void main(String[] args) {
		
		serie listaSeries[]=new serie[5];
		videojuego listaVideojuegos[]=new videojuego[5];
		
		
		listaSeries[0]=new serie();
		listaSeries[1]=new serie("Juego de Tronos", "George R. R. Martin");
		listaSeries[2]=new serie("Los Simpsons", 25, "Humor", "Matt Groening");
		listaSeries[3]=new serie("Padre de familia", 12, "Humor", "Seth McFarlane");
		listaSeries[4]=new serie("Breaking Bad",5, "Thriller", "Vince Gilligan");
		
		listaVideojuegos[0]=new videojuego();
		listaVideojuegos[1]=new videojuego("Assasins Creed 2", 30, "Aventura", "Ubisoft");
		listaVideojuegos[2]=new videojuego("God Of War 3", "Santa Mónica");
		listaVideojuegos[3]=new videojuego("Super Mario 3DS", 30, "Plataforma", "Nintendo");
		listaVideojuegos[4]=new videojuego("Final Fantasy X", 200, "Rol", "Square Enix");
		
		listaSeries[1].entregar();
		listaSeries[4].entregar();
		listaVideojuegos[0].entregar();
		listaVideojuegos[3].entregar();
		
		int entregados=0;
		
		for (int i=0; i<listaSeries.length; i++) {
			if (listaSeries[i].isEntregado()) {
				entregados+=1;
				listaSeries[i].devolver();
			}
			if (listaVideojuegos[i].isEntregado()) {
				entregados+=1;
				listaVideojuegos[i].devolver();
			}
		}
		
		System.out.println("Hay "+ entregados + " artículos entregados");
		
		serie serieMayor=listaSeries[0];
		videojuego videojuegoMayor=listaVideojuegos[0];
		
		for (int i=1; i<listaSeries.length; i++) {
			if (listaSeries[i].compareTo(serieMayor)==serie.MAYOR) {
				serieMayor=listaSeries[i];
			}
			if (listaVideojuegos[i].compareTo(videojuegoMayor)==videojuego.MAYOR) {
				videojuegoMayor=listaVideojuegos[i];
			}
		}
		
		System.out.println(videojuegoMayor);
		System.out.println(serieMayor);
	}

}
