package cl.awakelab.evaluacion.servicio;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import cl.awakelab.evaluacion.modelo.Cliente;
import cl.awakelab.evaluacion.modelo.ClienteRepositorio;

@Service
public class ClienteServicioImpl implements ClienteServicio{

	@Autowired
	ClienteRepositorio cr;
	
	@Override
	public boolean crearCliente(Cliente cliente) {
		
		cr.save(cliente);
		return true;
	}

	@Override
	public boolean editarCliente(Cliente cliente) {
		
		cr.save(cliente);
		return true;
	}

	@Override
	public Cliente obtenerCliPorId(int usuario_runusuario) {
		
		return cr.findOne(usuario_runusuario);
	}

}
