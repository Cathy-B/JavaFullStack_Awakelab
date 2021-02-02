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

import cl.awakelab.evaluacion.modelo.Administrativo;
import cl.awakelab.evaluacion.modelo.Cliente;
import cl.awakelab.evaluacion.modelo.Profesional;
import cl.awakelab.evaluacion.modelo.Usuario;
import cl.awakelab.evaluacion.servicio.AdministrativoServicio;
import cl.awakelab.evaluacion.servicio.ClienteServicio;
import cl.awakelab.evaluacion.servicio.ProfesionalServicio;
import cl.awakelab.evaluacion.servicio.UsuarioServicio;


@Controller
public class UsuarioControlador {

	@Autowired
	UsuarioServicio us;
	
	@Autowired
	ProfesionalServicio ps;
	
	@Autowired
	ClienteServicio cs;
	
	@Autowired
	AdministrativoServicio as;
	
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
			@RequestParam ("run_usuario") String rut_user,
			@RequestParam ("txtnombre") String nombre_user,
			@RequestParam ("txtfecha") String fecha_nacimiento,
			@RequestParam ("tipousuario") int tipo,
			//Datos cliente
			@RequestParam (value="run", defaultValue="none") String runcliente,
			@RequestParam (value="nombres", defaultValue="none") String nombre_cli,
			@RequestParam (value="apellidos", defaultValue="none") String apellido_cli,
			@RequestParam (value="telefono", defaultValue="none") String telefono_cli,
			@RequestParam (value="afps", defaultValue="none") String afp_cli,
			@RequestParam (value="salud", defaultValue="0") int salud_cli,
			@RequestParam (value="direccion", defaultValue="none") String direccion_cli,
			@RequestParam (value="comuna", defaultValue="none") String comuna_cli,
			@RequestParam (value="edad", defaultValue="0") int edad_cli,
			//Datos Administrativos
			@RequestParam (value="run_adm", defaultValue="none") String run_adm,
			@RequestParam (value="nombres_adm", defaultValue="none") String nombre_adm,
			@RequestParam (value="apellidos_adm", defaultValue="none") String apellido_adm,
			@RequestParam (value="correo_adm", defaultValue="none") String correo_adm,
			@RequestParam (value="area_adm", defaultValue="none") String area_adm,
			//Datos Profesionales
			@RequestParam (value="run_pro", defaultValue="none") String runprofesional,
			@RequestParam (value="nombre_pro", defaultValue="none") String nombre_pro,
			@RequestParam (value="apellido_pro", defaultValue="none") String apellido_pro,
			@RequestParam (value="telefono_pro", defaultValue="none") String telefono_pro,
			@RequestParam (value="titulo", defaultValue="none") String titulo,
			@RequestParam (value="proyecto", defaultValue="none") String proyecto) {
		
		logger.info("Proceso la creación de usuarios");
		Usuario usuario = new Usuario(rut_user, nombre_user, fecha_nacimiento, tipo);
		Cliente cli = new Cliente();
		Administrativo adm = new Administrativo();
		Profesional pro = new Profesional();
		
		if(tipo == 1) {
			
			cli.setRun_cliente(runcliente);
			cli.setNombres(nombre_cli);
			cli.setApellidos(apellido_cli);
			cli.setTelefono(telefono_cli);
			cli.setAfp(afp_cli);
			cli.setSistema_salud(salud_cli);
			cli.setDireccion(direccion_cli);
			cli.setComuna(comuna_cli);
			cli.setEdad(edad_cli);
			cli.setRun_usuario(rut_user);
			
			boolean result1 = us.crearUsuario(usuario);
			boolean result2 = cs.crearCliente(cli);
			
			String msg = "";
			
			if (result1 && result2) {
				msg = "El usuario tipo cliente se agregó exitosamente";
				logger.warn("Se creó el usuario");
			}
			else {
				msg = "El usuario tipo cliente no se pudo agregar porque ocurrió un error";
				logger.error("Falló al crear el usuario");
			}
			
			model.addAttribute("msgcrearusu", msg);
			
		}else if(tipo == 2) {
			
			adm.setRun_adm(run_adm);
			adm.setNombres_adm(nombre_adm);
			adm.setApellidos_adm(apellido_adm);
			adm.setCorreo_adm(correo_adm);
			adm.setArea_adm(area_adm);
			adm.setRun_usuario(rut_user);
			
			boolean result3 = us.crearUsuario(usuario);
			boolean result4 = as.crearAdministrativo(adm);
			
			String msg = "";
			
			if (result3 && result4) {
				msg = "El usuario tipo administrativo se agregó exitosamente";
				logger.warn("Se creó el usuario");
			}
			else {
				msg = "El usuario tipo administrativo no se pudo agregar porque ocurrió un error";
				logger.error("Falló al crear el usuario");
			}
			
			model.addAttribute("msgcrearusu", msg);
			
		}else if(tipo == 3) {
			
			pro.setRunprofesional(runprofesional);
			pro.setNombre_pro(nombre_pro);
			pro.setApellido_pro(apellido_pro);
			pro.setTelefono_pro(telefono_pro);
			pro.setTitulo(titulo);
			pro.setProyecto(proyecto);
			pro.setUsuario_runusuario(rut_user);
			
			boolean result5 = us.crearUsuario(usuario);
			boolean result6 = ps.crearProfesional(pro);
			
			String msg = "";
			
			if (result5 && result6) {
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
	}
	
	
}
