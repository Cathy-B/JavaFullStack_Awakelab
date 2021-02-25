package cl.awakelab.evaluacion.modelo;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Asesorias {
	
	@Id
	private int idasesoria;                 
    private String fecharealizacion;              
    private String motivo;                       
    private int cliente_rutcliente;            
    private int  profesionales_runprofesional;
    
    
    public Asesorias() {
		super();
	}


	public Asesorias(int idasesoria, String fecharealizacion, String motivo, int cliente_rutcliente,
			int profesionales_runprofesional) {
		super();
		this.idasesoria = idasesoria;
		this.fecharealizacion = fecharealizacion;
		this.motivo = motivo;
		this.cliente_rutcliente = cliente_rutcliente;
		this.profesionales_runprofesional = profesionales_runprofesional;
	}


	public int getIdasesoria() {
		return idasesoria;
	}


	public void setIdasesoria(int idasesoria) {
		this.idasesoria = idasesoria;
	}


	public String getFecharealizacion() {
		return fecharealizacion;
	}


	public void setFecharealizacion(String fecharealizacion) {
		this.fecharealizacion = fecharealizacion;
	}


	public String getMotivo() {
		return motivo;
	}


	public void setMotivo(String motivo) {
		this.motivo = motivo;
	}


	public int getCliente_rutcliente() {
		return cliente_rutcliente;
	}


	public void setCliente_rutcliente(int cliente_rutcliente) {
		this.cliente_rutcliente = cliente_rutcliente;
	}


	public int getProfesionales_runprofesional() {
		return profesionales_runprofesional;
	}


	public void setProfesionales_runprofesional(int profesionales_runprofesional) {
		this.profesionales_runprofesional = profesionales_runprofesional;
	}


	@Override
	public String toString() {
		return "Asesorias [idasesoria=" + idasesoria + ", fecharealizacion=" + fecharealizacion + ", motivo=" + motivo
				+ ", cliente_rutcliente=" + cliente_rutcliente + ", profesionales_runprofesional="
				+ profesionales_runprofesional + "]";
	}

	
}
