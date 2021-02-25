package cl.awakelab.evaluacion.servicio;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import cl.awakelab.evaluacion.modelo.AsesoriaRepositorio;
import cl.awakelab.evaluacion.modelo.Asesorias;


@Service
public class AsesoriasServicioImpl implements AsesoriasServicio {

	@Autowired	
	AsesoriaRepositorio ar;
	
	@Override
	public List<Asesorias> listarAsesorias() {
		// TODO Auto-generated method stub
		return (List<Asesorias>) ar.findAll();
	}

	@Override
	public boolean crearAsesorias(Asesorias asesorias) {
		ar.save(asesorias);
		return true;
	}

}
