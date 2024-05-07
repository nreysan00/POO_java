package basico_30;
import javax.swing.JOptionPane;

public class basico_30 {

	public static void main(String[] args) {
		
		String texto=JOptionPane.showInputDialog(null,
												"Por favor, introduce una frase",
												"Introducción",
												JOptionPane.INFORMATION_MESSAGE);
		
		String cadenaResultante;
		
		boolean isMayus;
		
		int eleccion=JOptionPane.showConfirmDialog(null,
										"¿Quieres que se pase a mayúsculas?",
										"Elección",
										JOptionPane.YES_OPTION);
		
		isMayus=	(eleccion==JOptionPane.YES_OPTION);
		
		if(isMayus) {
			cadenaResultante=texto.toUpperCase();
		}else {
			cadenaResultante=texto.toLowerCase();
		}
		
		JOptionPane.showMessageDialog(null,
										cadenaResultante,
										"Resultado",
										JOptionPane.INFORMATION_MESSAGE);
	}
}
