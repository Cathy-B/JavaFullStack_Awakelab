package cl.awakelab.evaluacion2;

/* *
 * @ Clase visitaTerreno
 * @ autores Jorge, Catherine, Yamilet
 * @ versión 16/11/2020 7
 * 
 */
public class VisitaTerreno {
	
	/** Atributos de la clase encapsulados */
	private int id_visita;
	private String rutCliente;
	private String dia;
	private String hora;
	private String lugar;
	private String comentarios;
	
	/**
	 * Constructor vacío visita terreno.
	 */
	public VisitaTerreno() {
		super();
	}

	/**
	 * Constructor con los atributos de la clase visita terreno.
	 *
	 * @param id_visita the id visita
	 * @param rutCliente the rut cliente
	 * @param dia the dia
	 * @param hora the hora
	 * @param lugar the lugar
	 * @param comentarios the comentarios
	 */
	public VisitaTerreno(int id_visita, String rutCliente, String dia, String hora, String lugar, String comentarios) {
		super();
		this.id_visita = id_visita;
		this.rutCliente = rutCliente;
		this.dia = dia;
		this.hora = hora;
		this.lugar = lugar;
		this.comentarios = comentarios;
	}

	/**
	 * Gets the id visita.
	 *
	 * @return the id visita
	 */
	public int getId_visita() {
		return id_visita;
	}

	/**
	 * Sets the id visita.
	 *
	 * @param id_visita the new id visita
	 */
	public void setId_visita(int id_visita) {
		this.id_visita = id_visita;
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
	 * Gets the comentarios.
	 *
	 * @return the comentarios
	 */
	public String getComentarios() {
		return comentarios;
	}

	/**
	 * Sets the comentarios.
	 *
	 * @param comentarios the new comentarios
	 */
	public void setComentarios(String comentarios) {
		this.comentarios = comentarios;
	}

	/**
	 * método To string.
	 *
	 * @return the string
	 */
	@Override
	public String toString() {
		return "VisitaTerreno [id_visita=" + id_visita + ", rutCliente=" + rutCliente + ", dia=" + dia + ", hora="
				+ hora + ", lugar=" + lugar + ", comentarios=" + comentarios + "]";
	}
	
	
	
}