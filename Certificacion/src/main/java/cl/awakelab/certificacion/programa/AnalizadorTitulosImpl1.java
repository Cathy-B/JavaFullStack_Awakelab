package cl.awakelab.certificacion.programa;

public class AnalizadorTitulosImpl1 implements AnalizadorTitulos{

	@Override
	public int analizar(String titulo) {
		
		int resul = 2;
		int espacios = titulo.split("\\s+|\n|,").length;
		
		if(espacios == 1) {
			resul = -1;
		}else if(espacios == 2) {
			resul = 0;
		}else if(espacios >2) {
			resul = 1;
		}
		
		return resul;
	}

}
