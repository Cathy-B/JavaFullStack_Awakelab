package cl.awakelab.certificacion.dao;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.List;

import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.RowMapper;

import cl.awakelab.certificacion.modelo.Peliculas;

public class PeliculaDaoImpl implements IPeliculaDao{

	JdbcTemplate template;

	public void setTemplate(JdbcTemplate template) {
	this.template = template;
	}
	
	@Override
	public List<Peliculas> obtenerPeliculas(int idcategoria, String titulo) {
		
		String query = "SELECT c.name AS categoria, f.film_id as idpelicula, f.title AS titulo, f.length AS duracion, f.rating AS rating, f.rental_rate AS precio, f.rental_duration AS duracionarriendo\r\n"
				+ "FROM film f\r\n"
				+ "LEFT JOIN film_category fc ON f.film_id = fc.film_id\r\n"
				+ "LEFT JOIN category c ON fc.category_id = c.category_id\r\n"
				+ "WHERE c.category_id = "+idcategoria+" AND LOWER(f.title) LIKE '%"+titulo+"%'";
		
		return template.query(query,new RowMapper<Peliculas>(){    
	        public Peliculas mapRow(ResultSet rs, int row) throws SQLException {    
	        Peliculas p = new Peliculas();
	            p.setCategoria(rs.getString(1));
	            p.setIdpelicula(rs.getInt(2));
	            p.setTitulo(rs.getString(3));
	            p.setDuracion(rs.getInt(4));
	            p.setRating(rs.getString(5));
	            p.setPrecio(rs.getDouble(6));
	            p.setDuracionarriendo(rs.getInt(7));
	            return p;
	        }
	    });
	}

	@Override
	public List<Peliculas> obtenerListadoPeliculas() {
		
		String query = "SELECT c.name AS categoria, f.film_id as idpelicula, f.title AS titulo, f.length AS duracion, f.rating AS rating, f.rental_rate AS precio, f.rental_duration AS duracionarriendo\r\n"
				+ "FROM film f\r\n"
				+ "LEFT JOIN film_category fc ON f.film_id = fc.film_id\r\n"
				+ "LEFT JOIN category c ON fc.category_id = c.category_id";
		
		return template.query(query,new RowMapper<Peliculas>(){    
	        public Peliculas mapRow(ResultSet rs, int row) throws SQLException {    
	        Peliculas p = new Peliculas();
	            p.setCategoria(rs.getString(1));
	            p.setIdpelicula(rs.getInt(2));
	            p.setTitulo(rs.getString(3));
	            p.setDuracion(rs.getInt(4));
	            p.setRating(rs.getString(5));
	            p.setPrecio(rs.getDouble(6));
	            p.setDuracionarriendo(rs.getInt(7));
	            return p;
	        }
	    });
	}

	
}
