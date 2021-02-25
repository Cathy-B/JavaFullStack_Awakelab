package cl.awakelab.evaluacion.servicio;

import java.util.List;

import cl.awakelab.evaluacion.modelo.Asesorias;


public interface AsesoriasServicio {

	public List<Asesorias> listarAsesorias();
	
	public boolean crearAsesorias(Asesorias asesorias);
	
}
