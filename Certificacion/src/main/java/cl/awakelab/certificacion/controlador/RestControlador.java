package cl.awakelab.certificacion.controlador;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import cl.awakelab.certificacion.dao.PeliculaDaoImpl;
import cl.awakelab.certificacion.modelo.Peliculas;

@RestController
public class RestControlador {

	@Autowired
	PeliculaDaoImpl pd;
	
	@RequestMapping(value="/verdetalle",method=RequestMethod.GET, headers = "Accept=application/json")
	public List<Peliculas> obtenerPeliculas(){
		List<Peliculas> lpeliculas = pd.obtenerPeliculas(6, "DINOSAUR");
		
		return lpeliculas;
	}
}
