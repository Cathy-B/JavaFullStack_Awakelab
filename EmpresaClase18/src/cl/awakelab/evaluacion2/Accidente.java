package cl.awakelab.evaluacion2;
/* *
 * @ Clase hija Accidente
 * @ autores Jorge, Catherine, Yamilet
 * @ versión 16/11/2020 6
 * 
 */
public class Accidente extends Usuario {
	
	/** Atributos de la clase encapsulados*/
	private int id_accidente;
	private String rutCliente;
	private String dia;
	private String hora;
	private String lugar;
	private String origen;
	private String consecuencias;
	

	/**
	 * Constructor vacío Accidente.
	 */
	public Accidente() {
		super();
	}

	/**
	 * Constructor con los atributos de la clase accidente.
	 *
	 * @param nombreUser the nombre user
	 * @param fechaNacimiento the fecha nacimiento
	 * @param run the run
	 * @param id_accidente the id accidente
	 * @param rutCliente the rut cliente
	 * @param dia the dia
	 * @param hora the hora
	 * @param lugar the lugar
	 * @param origen the origen
	 * @param consecuencias the consecuencias
	 */
	public Accidente(String nombreUser, String fechaNacimiento, String run, int id_accidente, String rutCliente,
			String dia, String hora, String lugar, String origen, String consecuencias) {
		super(nombreUser, fechaNacimiento, run);
		this.id_accidente = id_accidente;
		this.rutCliente = rutCliente;
		this.dia = dia;
		this.hora = hora;
		this.lugar = lugar;
		this.origen = origen;
		this.consecuencias = consecuencias;
	}
	
	

	/**
	 * Gets the id accidente.
	 *
	 * @return the id accidente
	 */
	public int getId_accidente() {
		return id_accidente;
	}

	/**
	 * Sets the id accidente.
	 *
	 * @param id_accidente the new id accidente
	 */
	public void setId_accidente(int id_accidente) {
		this.id_accidente = id_accidente;
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
	 * Gets the origen.
	 *
	 * @return the origen
	 */
	public String getOrigen() {
		return origen;
	}

	/**
	 * Sets the origen.
	 *
	 * @param origen the new origen
	 */
	public void setOrigen(String origen) {
		this.origen = origen;
	}

	/**
	 * Gets the consecuencias.
	 *
	 * @return the consecuencias
	 */
	public String getConsecuencias() {
		return consecuencias;
	}

	/**
	 * Sets the consecuencias.
	 *
	 * @param consecuencias the new consecuencias
	 */
	public void setConsecuencias(String consecuencias) {
		this.consecuencias = consecuencias;
	}

	
	/**
	 * método To string.
	 *
	 * @return string
	 */
	@Override
	public String toString() {
		return "Accidente [id_accidente=" + id_accidente + ", rutCliente=" + rutCliente + ", dia=" + dia + ", hora="
				+ hora + ", lugar=" + lugar + ", origen=" + origen + ", consecuencias=" + consecuencias + "]";
	}

	/**
	 * método Mostrar detalle.
	 */
	@Override
	public void mostrarDetalle() {
		// TODO Auto-generated method stub
		
	}
	
	
	
}