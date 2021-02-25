package cl.awakelab.evaluacion.controlador;

import java.util.List;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

import cl.awakelab.evaluacion.modelo.Asistentes;
import cl.awakelab.evaluacion.modelo.Capacitacion;
import cl.awakelab.evaluacion.servicio.AsistentesServicio;
import cl.awakelab.evaluacion.servicio.CapacitacionServicio;

@Controller
public class AsistentesControlador {

	@Autowired
	AsistentesServicio as;
	
	@Autowired
	CapacitacionServicio cs;
	
	private static final Logger logger = LoggerFactory.getLogger(AsistentesControlador.class);
	
	@RequestMapping(value="/agregarasistente", method = RequestMethod.GET)
	public String listarCapacitaciones(Model model) {
		logger.info("Ingreso al agregar asistente");
		
		List<Asistentes> listaasis = as.listarAsistentes();
		List<Capacitacion> listacapa = cs.listarCapacitaciones();
		model.addAttribute("lasistentes",listaasis);
		model.addAttribute("lcapacitacion",listacapa);
		
		logger.info("Ya mostré listado");
		return "frmadministrarasis";
	}
	
	
	@RequestMapping (value="/procesasistente",method = RequestMethod.POST)
	public String procesarCrearCap(Model model,
			@RequestParam ("nombreasis") String nombre,
			@RequestParam ("edadasis") int edad,
			@RequestParam ("correoasis") String correo,
			@RequestParam ("telefonoasis") String telefono,
			@RequestParam ("idcapa") int idcap) {
		
		logger.info("Proceso la asignacion de asistente");
		
		Asistentes asis = new Asistentes();
		asis.setIdasistente(0);
		asis.setAsisnombrecompleto(nombre);
		asis.setAsisedad(edad);
		asis.setAsiscorreo(correo);
		asis.setAsistelefono(telefono);
		asis.setCapacitacion_idcapacitacion(idcap);
		
		boolean result = as.crearAsistentes(asis);
		String msje = "";
		
		if (result) {
			msje = "La asignacion de asistentes fue creada sin inconvenientes";
			logger.warn("Se creó la asignacion de asistente");
			
		}
		else {
			msje = "Ocurrió un error al momento de ejecutar la creación";
			logger.error("Falló al asignar el asistente");
		}
		
		String red="iniciocli";
		model.addAttribute("msgcrearasi", msje);
		model.addAttribute("redireccion", red);
		
		return "msgcrear";
	}
	
	@RequestMapping(value="/eliminarasistente/{idasis}", method = RequestMethod.GET)
	public String eliminarAsistente(Model model, @PathVariable int idasis) {
		Asistentes asis = as.obtenerAsistenteId(idasis);
		String msje = "";
		boolean result= as.eliminarAsistentes(asis);
		
		
		if (result) {
			msje = "La eliminacion del asistente fue realizada sin inconvenientes";
			logger.warn("Se elimino el asistente");
			
		}
		else {
			msje = "Ocurrió un error al momento de ejecutar la eliminacion";
			logger.error("Falló al eliminar el asistente");
		}
		
		String red="iniciocli";
		model.addAttribute("msgeliminarasi", msje);
		model.addAttribute("redireccion", red);
		return "msgeliminar";
	}	

	
}
