package cl.awakelab.evaluacion.servicio;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import cl.awakelab.evaluacion.modelo.Profesional;
import cl.awakelab.evaluacion.modelo.ProfesionalRepositorio;


@Service
public class ProfesionalServicioImpl implements ProfesionalServicio{

	@Autowired
	ProfesionalRepositorio pr;
	
	@Override
	public boolean crearProfesional(Profesional profesional) {
		
		pr.save(profesional);
		return true;
	}

}
