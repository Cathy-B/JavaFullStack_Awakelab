package cl.awakelab.certificacion.programa;

public class AnalizadorTitulosImpl2 implements AnalizadorTitulos{

	@Override
	public int analizar(String titulo) {
		
		int resul = 2;
		int vocales = 0;
		
		for(int i = 0; i < titulo.length();i++) {
			char c = titulo.charAt(i);
			
			if((c == 'a') || (c == 'A') || (c == 'e') || (c == 'E') || (c == 'i') ||(c == 'I') || (c == 'o') || (c == 'O') || (c == 'u') || (c == 'U')) {
				vocales++;
			}
		}
		
		if(vocales < 8) {
			resul = -1;
		}else if(vocales  >= 9 && vocales <= 12) {
			resul = 0;
		}else if(vocales > 12) {
			resul = 1;
		}
		
		return resul;
	}

}
