package cl.awakelab.evaluacion.controlador;

import java.util.List;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

import cl.awakelab.evaluacion.modelo.Asesorias;
import cl.awakelab.evaluacion.modelo.Cliente;
import cl.awakelab.evaluacion.modelo.Profesional;
import cl.awakelab.evaluacion.servicio.AsesoriasServicio;
import cl.awakelab.evaluacion.servicio.ClienteServicio;
import cl.awakelab.evaluacion.servicio.ProfesionalServicio;

@Controller
public class AsesoriasControlador {

	@Autowired
	AsesoriasServicio as;
	
	@Autowired
	ClienteServicio clis;
	
	@Autowired
	ProfesionalServicio pro;
	
	private static final Logger logger = LoggerFactory.getLogger(AsesoriasControlador.class);
	
	
	@RequestMapping(value="/listaasesoria", method = RequestMethod.GET)
	public String listarCapacitaciones(Model model) {
		logger.info("Ingreso al listado de capacitaciones");
		
		List<Asesorias> listaase = as.listarAsesorias();
		model.addAttribute("lasesorias",listaase);
		
		logger.info("Ya mostré listado");
		return "frmlistaasesoria";
	}
	
	
	@RequestMapping (value="/creaasesoria",method = RequestMethod.GET)
	public String crearCapacitacion(Model model) {
		
		logger.info("Ingreso a la creación de asesorias");
		List<Cliente> listcli = clis.listarClientes();
		logger.info("Cargué lista de clientes");
		model.addAttribute("lclientes", listcli);
		
		List<Profesional> listpro = pro.listarProfesionales();
		logger.info("Cargué lista de profesionales");
		model.addAttribute("lprofesionales", listpro);
		
		
		return "frmcreaasesorias";
	}
	
	
	@RequestMapping (value="/procesaasesoria",method = RequestMethod.POST)
	public String procesarCrearCap(Model model,
			@RequestParam ("fechaasesoria") String fecha,
			@RequestParam ("motivo") String motivo,
			@RequestParam ("runcli") int runcli,
			@RequestParam ("runpro") int runpro) {
		
		logger.info("Proceso la creación de Asesorias");
		
		Asesorias asesoria = new Asesorias();
		asesoria.setIdasesoria(0);
		asesoria.setFecharealizacion(fecha);
		asesoria.setMotivo(motivo);
		asesoria.setCliente_rutcliente(runcli);
		asesoria.setProfesionales_runprofesional(runpro);
		
		boolean result = as.crearAsesorias(asesoria);
		String msje = "";
		
		if (result) {
			msje = "La asesoria fue creada sin inconvenientes";
			logger.warn("Se creó la asesoria");
			
		}
		else {
			msje = "Ocurrió un error al momento de ejecutar la creación";
			logger.error("Falló al crear la asesoria");
		}
		
		String red="iniciopro";
		model.addAttribute("msgcrearase", msje);
		model.addAttribute("redireccion", red);
		
		return "msgcrear";
	}
}
