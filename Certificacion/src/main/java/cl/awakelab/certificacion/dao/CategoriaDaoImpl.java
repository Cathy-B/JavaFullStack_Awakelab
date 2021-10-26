package cl.awakelab.certificacion.dao;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.List;

import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.RowMapper;

import cl.awakelab.certificacion.modelo.Categoria;

public class CategoriaDaoImpl implements ICategoriaDao{

	JdbcTemplate template;

	public void setTemplate(JdbcTemplate template) {
	this.template = template;
	}

	@Override
	public List<Categoria> obtenerCategorias() {
		
		String query = "SELECT category_id AS idcategoria, name AS categoria, last_update AS ultimaActua\r\n"
				+ "FROM category\r\n"
				+ "ORDER BY name ASC";
		
		return template.query(query,new RowMapper<Categoria>(){    
	        public Categoria mapRow(ResultSet rs, int row) throws SQLException {    
	        Categoria c = new Categoria();
	            c.setIdcategoria(rs.getInt(1));
	            c.setNombre(rs.getString(2));
	            c.setUltimaActua(rs.getString(2));
	            return c;
	        }
	    });
	}
	
}