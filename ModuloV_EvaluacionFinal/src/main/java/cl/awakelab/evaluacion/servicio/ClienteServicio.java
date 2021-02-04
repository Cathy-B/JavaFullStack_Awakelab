package cl.awakelab.evaluacion.servicio;

import cl.awakelab.evaluacion.modelo.Cliente;

public interface ClienteServicio {

	public boolean crearCliente(Cliente cliente);
	public boolean editarCliente(Cliente cliente);
	public Cliente obtenerCliPorId(int usuario_runusuario);
	
}
