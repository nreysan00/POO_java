package com.tutorialesprogramacionya.calculadora;
import com.tutorialesprogramacionya.rutinas.Cadena;
import com.tutorialesprogramacionya.rutinas.Matematica;

public class PruebaPaquetes {
	public static void main(String []ar) {
        System.out.println("La suma de 2+2 es "+Matematica.sumar(2, 2));
        String cadena="Hola Mundo";
        System.out.println(Cadena.mayuscula(cadena));
    }
}
