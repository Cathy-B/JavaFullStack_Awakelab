package cl.awakelab.certificacion.programa;

import java.util.Scanner;

public class DemoConsola {

	public static void main(String[] args) {
		
		AnalizadorTitulosImpl1 at1 = new AnalizadorTitulosImpl1();
		AnalizadorTitulosImpl2 at2 = new AnalizadorTitulosImpl2();
		
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Introduzca el t�tulo de la pel�cula");
		String titulo = "";
		titulo = scan.nextLine();
		
		System.out.println("Resultado an�lisis Implementaci�n 1: "+at1.analizar(titulo));
		System.out.println("Resultado an�lisis Implementaci�n 2: "+at2.analizar(titulo));
		
		scan.close();
	}

}
