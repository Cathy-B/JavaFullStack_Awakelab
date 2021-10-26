package cl.awakelab.certificacion.dao;

import java.util.List;

import cl.awakelab.certificacion.modelo.Peliculas;

public interface IPeliculaDao {

	List<Peliculas> obtenerPeliculas(int idcategoria, String titulo);
	List<Peliculas> obtenerListadoPeliculas();
	
}
