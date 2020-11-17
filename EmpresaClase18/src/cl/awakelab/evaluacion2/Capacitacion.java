package cl.awakelab.evaluacion2;

/* *
 * @ Clase hija Capacitación
 * @ autores Jorge, Catherine, Yamilet
 * @ versión 16/11/2020 7
 * 
 */
public class Capacitacion extends Usuario {

	/** Atributos de la clase encapsulados */
	private int id_capacitacion;
	private String rutCliente;
	private String dia;
	private String hora;
	private String lugar;
	private String duracion;
	private int cantAsistentes;

	/**
	 * Constructor vacío capacitacion.
	 */
	public Capacitacion() {
		super();
	}

	/**
	 * Constructor con los atributos de la clase capacitación y de la clase padre usuario
	 *
	 * @param id_capacitacion the id capacitacion
	 * @param rutCliente the rut cliente
	 * @param dia the dia
	 * @param hora the hora
	 * @param lugar the lugar
	 * @param duracion the duracion
	 * @param cantAsistentes the cant asistentes
	 */
	public Capacitacion(int id_capacitacion, String rutCliente, String dia, String hora, String lugar, String duracion,
			int cantAsistentes) {
		super();
		this.id_capacitacion = id_capacitacion;
		this.rutCliente = rutCliente;
		this.dia = dia;
		this.hora = hora;
		this.lugar = lugar;
		this.duracion = duracion;
		this.cantAsistentes = cantAsistentes;
	}

	/**
	 * Gets the id capacitacion.
	 *
	 * @return the id capacitacion
	 */
	public int getId_capacitacion() {
		return id_capacitacion;
	}

	/**
	 * Sets the id capacitacion.
	 *
	 * @param id_capacitacion the new id capacitacion
	 */
	public void setId_capacitacion(int id_capacitacion) {
		this.id_capacitacion = id_capacitacion;
	}

	/**
	 * Gets the rut cliente.
	 *
	 * @return the rut cliente
	 */
	public String getRutCliente() {
		return rutCliente;
	}

	/**
	 * Sets the rut cliente.
	 *
	 * @param rutCliente the new rut cliente
	 */
	public void setRutCliente(String rutCliente) {
		this.rutCliente = rutCliente;
	}

	/**
	 * Gets the dia.
	 *
	 * @return the dia
	 */
	public String getDia() {
		return dia;
	}

	/**
	 * Sets the dia.
	 *
	 * @param dia the new dia
	 */
	public void setDia(String dia) {
		this.dia = dia;
	}

	/**
	 * Gets the hora.
	 *
	 * @return the hora
	 */
	public String getHora() {
		return hora;
	}

	/**
	 * Sets the hora.
	 *
	 * @param hora the new hora
	 */
	public void setHora(String hora) {
		this.hora = hora;
	}

	/**
	 * Gets the lugar.
	 *
	 * @return the lugar
	 */
	public String getLugar() {
		return lugar;
	}

	/**
	 * Sets the lugar.
	 *
	 * @param lugar the new lugar
	 */
	public void setLugar(String lugar) {
		this.lugar = lugar;
	}

	/**
	 * Gets the duracion.
	 *
	 * @return the duracion
	 */
	public String getDuracion() {
		return duracion;
	}

	/**
	 * Sets the duracion.
	 *
	 * @param duracion the new duracion
	 */
	public void setDuracion(String duracion) {
		this.duracion = duracion;
	}

	/**
	 * Gets the cant asistentes.
	 *
	 * @return the cant asistentes
	 */
	public int getCantAsistentes() {
		return cantAsistentes;
	}

	/**
	 * Sets the cant asistentes.
	 *
	 * @param cantAsistentes the new cant asistentes
	 */
	public void setCantAsistentes(int cantAsistentes) {
		this.cantAsistentes = cantAsistentes;
	}

	/**
	 * método To string.
	 *
	 * @return the string
	 */
	@Override
	public String toString() {
		return "Capacitacion [id_capacitacion=" + id_capacitacion + ", rutCliente=" + rutCliente + ", dia=" + dia + ", hora=" + hora
				+ ", lugar=" + lugar + ", duracion=" + duracion + ", cantAsistentes=" + cantAsistentes + "]";
	}

	/**
	 * método Mostrar detalle muestra la información de la capacitación por medio de un mensaje
	 */
	@Override
	public void mostrarDetalle() {
		
		System.out.println("La capacitación será en " + this.lugar + " a las " + this.hora + " del día " + this.dia
				+ " y durará " + this.duracion + " minutos ");
		

	}

	/**
	 * Analizar usuario.
	 */
	@Override
	public void analizarUsuario() {
		// TODO Auto-generated method stub

	}

}
