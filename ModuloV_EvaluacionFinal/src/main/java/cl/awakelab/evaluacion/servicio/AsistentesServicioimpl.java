package cl.awakelab.evaluacion.servicio;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import cl.awakelab.evaluacion.modelo.Asistentes;
import cl.awakelab.evaluacion.modelo.AsistentesRepositorio;


@Service
public class AsistentesServicioimpl implements AsistentesServicio {

	@Autowired
	AsistentesRepositorio ar;

	@Override
	public List<Asistentes> listarAsistentes() {
		return (List<Asistentes>) ar.findAll();
	}

	@Override
	public boolean crearAsistentes(Asistentes asistentes) {
		ar.save(asistentes);
		return true;
	}

	@Override
	public boolean eliminarAsistentes(Asistentes asistentes) {
		ar.delete(asistentes);
		return true;
	}

	@Override
	public Asistentes obtenerAsistenteId(int idasis) {
		return ar.findOne(idasis);

	}
	
	
}
