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

import cl.awakelab.evaluacion.modelo.Profesional;
import cl.awakelab.evaluacion.modelo.Usuario;
import cl.awakelab.evaluacion.servicio.ProfesionalServicio;
import cl.awakelab.evaluacion.servicio.UsuarioServicio;


@Controller
public class UsuarioControlador {

	@Autowired
	UsuarioServicio us;
	
	@Autowired
	ProfesionalServicio ps;
	
	private static final Logger logger = LoggerFactory.getLogger(UsuarioControlador.class);
	
	@RequestMapping (value="/listausuarios",method = RequestMethod.GET)
	public String listarUsuarios(Model model) {
		
		logger.info("Ingreso al listado de usuarios");
		
		List<Usuario> listadodeuser = us.listarUsuarios();
		model.addAttribute("lusuarios",listadodeuser);
		
		return "frmlistausuario";
	}
	
	@RequestMapping (value="/creausuario",method = RequestMethod.GET)
	public String crearUsuario() {
		
		logger.info("Ingreso a la creación de usuarios");
		return "frmcrearusuario";
	}
	
	@RequestMapping (value="/procesausuario",method = RequestMethod.POST)
	public String procesarCrearUs(Model model,
			@RequestParam (name ="run_usuario") int rut_user,
			@RequestParam ("txtnombre") String nombre_user,
			@RequestParam ("txtfecha") String fecha_nacimiento,
			@RequestParam ("tipousuario") int tipo,
			//Datos Profesional
			@RequestParam ("run_pro") String runprofesional,
			@RequestParam ("nombre_pro") String nombre_pro,
			@RequestParam ("apellido_pro") String apellido_pro,
			@RequestParam ("telefono_pro") String telefono_pro,
			@RequestParam ("titulo") String titulo,
			@RequestParam ("proyecto") String proyecto) {
		
		logger.info("Proceso la creación de usuarios");
		Usuario usuario = new Usuario(rut_user, nombre_user, fecha_nacimiento, tipo);
		Profesional pro = new Profesional();
		
		if(tipo == 1) {
			
		}else if(tipo == 2) {
			
		}else if(tipo == 3) {
			
			pro.setRunprofesional(runprofesional);
			pro.setNombre_pro(nombre_pro);
			pro.setApellido_pro(apellido_pro);
			pro.setTelefono_pro(telefono_pro);
			pro.setTitulo(titulo);
			pro.setProyecto(proyecto);
			pro.setUsuario_runusuario(rut_user);
			
			boolean result = us.crearUsuario(usuario);
			boolean result1 = ps.crearProfesional(pro);
			
			String msg = "";
			
			if (result && result1) {
				msg = "El usuario tipo profesional se agregó exitosamente";
				logger.warn("Se creó el usuario");
			}
			else {
				msg = "El usuario tipo profesional no se pudo agregar porque ocurrió un error";
				logger.error("Falló al crear el usuario");
			}
			model.addAttribute("msgcrearusu", msg);
			
			
			}
		return "msgcrear";
		
		/*Usuario usuario = new Usuario(nombre, fecha_nacimiento, rut_usuario, tipo);
		boolean result = us.crearUsuario(usuario);
		String msje = "";
		
		if (result) {
			msje = "El usuario fue creado sin inconvenientes";
			logger.warn("Se creó el usuario");
			
		}
		else {
			msje = "Ocurrió un error al momento de ejecutar la creación";
			logger.error("Falló al crear el usuario");
		}*/

		
	}
	
	
}
