package cl.awakelab.certificacion;

import org.junit.Test;
import static org.junit.Assert.assertEquals;

import cl.awakelab.certificacion.programa.AnalizadorTitulosImpl1;
import cl.awakelab.certificacion.programa.AnalizadorTitulosImpl2;

public class TestAnalizadorTitulos {
	
	@Test
	public void test1() {
		AnalizadorTitulosImpl1 at1 = new AnalizadorTitulosImpl1();
		
		String titulo = "Un dia cualquiera";
		int resul = at1.analizar(titulo);
		
		assertEquals(1,resul);
		
	}
	
	@Test
	public void test2() {
		AnalizadorTitulosImpl1 at1 = new AnalizadorTitulosImpl1();
		
		String titulo = "Today";
		int resul = at1.analizar(titulo);
		
		assertEquals(-1,resul);
		
	}
	
	@Test
	public void test3() {
		AnalizadorTitulosImpl2 at2 = new AnalizadorTitulosImpl2();
		
		String titulo = "Harry Potter y la piedra filosofal";
		int resul = at2.analizar(titulo);
		
		assertEquals(0,resul);
		
	}
	
	@Test
	public void test4() {
		AnalizadorTitulosImpl2 at2 = new AnalizadorTitulosImpl2();
		
		String titulo = "Airplane Sierra";
		int resul = at2.analizar(titulo);
		
		assertEquals(-1,resul);
		
	}
}
