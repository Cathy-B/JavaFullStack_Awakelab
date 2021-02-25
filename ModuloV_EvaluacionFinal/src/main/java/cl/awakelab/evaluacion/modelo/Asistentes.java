package cl.awakelab.evaluacion.modelo;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Asistentes {
		@Id
		private int idasistente;                  
	    private String asisnombrecompleto;           
	    private int asisedad;                    
	    private String asiscorreo;                   
	    private String asistelefono;                 
	    private int capacitacion_idcapacitacion;
	    
		public Asistentes() {
			super();
		}

		public Asistentes(int idasistente, String asisnombrecompleto, int asisedad, String asiscorreo, String asistelefono,
				int capacitacion_idcapacitacion) {
			super();
			this.idasistente = idasistente;
			this.asisnombrecompleto = asisnombrecompleto;
			this.asisedad = asisedad;
			this.asiscorreo = asiscorreo;
			this.asistelefono = asistelefono;
			this.capacitacion_idcapacitacion = capacitacion_idcapacitacion;
		}

		@Override
		public String toString() {
			return "Asistentes [idasistente=" + idasistente + ", asisnombrecompleto=" + asisnombrecompleto
					+ ", asisedad=" + asisedad + ", asiscorreo=" + asiscorreo + ", asistelefono=" + asistelefono
					+ ", capacitacion_idcapacitacion=" + capacitacion_idcapacitacion + "]";
		}

		public int getIdasistente() {
			return idasistente;
		}

		public void setIdasistente(int idasistente) {
			this.idasistente = idasistente;
		}

		public String getAsisnombrecompleto() {
			return asisnombrecompleto;
		}

		public void setAsisnombrecompleto(String asisnombrecompleto) {
			this.asisnombrecompleto = asisnombrecompleto;
		}

		public int getAsisedad() {
			return asisedad;
		}

		public void setAsisedad(int asisedad) {
			this.asisedad = asisedad;
		}

		public String getAsiscorreo() {
			return asiscorreo;
		}

		public void setAsiscorreo(String asiscorreo) {
			this.asiscorreo = asiscorreo;
		}

		public String getAsistelefono() {
			return asistelefono;
		}

		public void setAsistelefono(String asistelefono) {
			this.asistelefono = asistelefono;
		}

		public int getCapacitacion_idcapacitacion() {
			return capacitacion_idcapacitacion;
		}

		public void setCapacitacion_idcapacitacion(int capacitacion_idcapacitacion) {
			this.capacitacion_idcapacitacion = capacitacion_idcapacitacion;
		} 
	    
	    
	    

}
