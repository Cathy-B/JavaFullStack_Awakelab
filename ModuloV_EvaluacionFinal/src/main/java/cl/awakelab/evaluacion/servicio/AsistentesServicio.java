package cl.awakelab.evaluacion.servicio;

import java.util.List;


import cl.awakelab.evaluacion.modelo.Asistentes;

public interface AsistentesServicio {
	
	public List<Asistentes> listarAsistentes();
	
	public boolean crearAsistentes(Asistentes asistentes);
	
	public boolean eliminarAsistentes(Asistentes asistentes);
	
	public Asistentes obtenerAsistenteId(int idasis);


}
