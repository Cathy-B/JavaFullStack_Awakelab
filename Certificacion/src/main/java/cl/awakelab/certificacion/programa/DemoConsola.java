package cl.awakelab.certificacion.programa;

import java.util.Scanner;

public class DemoConsola {

	public static void main(String[] args) {
		
		AnalizadorTitulosImpl1 at1 = new AnalizadorTitulosImpl1();
		AnalizadorTitulosImpl2 at2 = new AnalizadorTitulosImpl2();
		
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Introduzca el título de la película");
		String titulo = "";
		titulo = scan.nextLine();
		
		System.out.println("Resultado análisis Implementación 1: "+at1.analizar(titulo));
		System.out.println("Resultado análisis Implementación 2: "+at2.analizar(titulo));
		
		scan.close();
	}

}
