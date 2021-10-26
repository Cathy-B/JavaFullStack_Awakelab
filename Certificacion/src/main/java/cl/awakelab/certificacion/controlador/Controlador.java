package cl.awakelab.certificacion.controlador;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

import cl.awakelab.certificacion.dao.CategoriaDaoImpl;
import cl.awakelab.certificacion.dao.PeliculaDaoImpl;
import cl.awakelab.certificacion.modelo.Categoria;
import cl.awakelab.certificacion.modelo.Peliculas;

@Controller
public class Controlador {

	@Autowired
	CategoriaDaoImpl cd;
	
	@Autowired
	PeliculaDaoImpl pd;
	
	@RequestMapping(value="/",method=RequestMethod.GET)
	public String verinicio(Model model) {
		
		List<Categoria> liscategoria = cd.obtenerCategorias();
		List<Peliculas> lispeliculas = pd.obtenerListadoPeliculas();
		
		model.addAttribute("lcategoria",liscategoria);
		model.addAttribute("lpeliculas", lispeliculas);
		
		return "frminicio";
	}
	
	@RequestMapping(value="/reporte", method=RequestMethod.POST)
	public String verReporte(Model model,
			@RequestParam int idcategoria,
			@RequestParam String titulo) {
		List<Categoria> listaCategoria = cd.obtenerCategorias();
		List<Peliculas> listaPeliculas = pd.obtenerPeliculas(idcategoria, titulo);
		model.addAttribute("lcategoria", listaCategoria);
		model.addAttribute("lpeliculas",listaPeliculas);
		
		return "reporte";
		
	}
	
}
