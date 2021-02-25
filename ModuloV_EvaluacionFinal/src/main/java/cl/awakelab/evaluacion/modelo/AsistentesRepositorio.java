package cl.awakelab.evaluacion.modelo;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

	@Repository
	public interface AsistentesRepositorio extends CrudRepository<Asistentes, Integer>{
}
