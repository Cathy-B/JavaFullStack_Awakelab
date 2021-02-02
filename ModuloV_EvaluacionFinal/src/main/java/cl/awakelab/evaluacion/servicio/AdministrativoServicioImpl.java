package cl.awakelab.evaluacion.servicio;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import cl.awakelab.evaluacion.modelo.Administrativo;
import cl.awakelab.evaluacion.modelo.AdministrativoRepositorio;

@Service
public class AdministrativoServicioImpl implements AdministrativoServicio{

	@Autowired
	AdministrativoRepositorio ar;
	
	@Override
	public boolean crearAdministrativo(Administrativo administrativo) {
		
		ar.save(administrativo);
		return true;
	}

	
	
}