package cl.awakelab.evaluacion2;

/* *
 * @ Clase  revisión
 * @ autores Jorge, Catherine, Yamilet
 * @ versión 16/11/2020 6
 * 
 */
public class Revision{
	
	/** Atributos de la clase */
	private int id_revision;
	private int id_cliente;
	private String nombreRevision;
	private String detalle;
	private int estado;
	
	
	/**
	 * Constructor vacío clase revision.
	 */
	public Revision() {
		super();
	}
	
	/**
	 * Constructor con los atributos de la clase revision.
	 *
	 * @param id_revision the id revision
	 * @param id_cliente the id cliente
	 * @param nombreRevision the nombre revision
	 * @param detalle the detalle
	 * @param estado the estado
	 */
	public Revision(int id_revision, int id_cliente, String nombreRevision, String detalle, int estado) {
		super();
		this.id_revision = id_revision;
		this.id_cliente = id_cliente;
		this.nombreRevision = nombreRevision;
		this.detalle = detalle;
		this.estado = estado;
	}
	
	/**
	 * Gets the id revision.
	 *
	 * @return the id revision
	 */
	public int getId_revision() {
		return id_revision;
	}
	
	/**
	 * Sets the id revision.
	 *
	 * @param id_revision the new id revision
	 */
	public void setId_revision(int id_revision) {
		this.id_revision = id_revision;
	}
	
	/**
	 * Gets the id cliente.
	 *
	 * @return the id cliente
	 */
	public int getId_cliente() {
		return id_cliente;
	}
	
	/**
	 * Sets the id cliente.
	 *
	 * @param id_cliente the new id cliente
	 */
	public void setId_cliente(int id_cliente) {
		this.id_cliente = id_cliente;
	}
	
	/**
	 * Gets the nombre revision.
	 *
	 * @return the nombre revision
	 */
	public String getNombreRevision() {
		return nombreRevision;
	}
	
	/**
	 * Sets the nombre revision.
	 *
	 * @param nombreRevision the new nombre revision
	 */
	public void setNombreRevision(String nombreRevision) {
		this.nombreRevision = nombreRevision;
	}
	
	/**
	 * Gets the detalle.
	 *
	 * @return the detalle
	 */
	public String getDetalle() {
		return detalle;
	}
	
	/**
	 * Sets the detalle.
	 *
	 * @param detalle the new detalle
	 */
	public void setDetalle(String detalle) {
		this.detalle = detalle;
	}
	
	/**
	 * Gets the estado.
	 *
	 * @return the estado
	 */
	public int getEstado() {
		return estado;
	}
	
	/**
	 * Sets the estado.
	 *
	 * @param estado the new estado
	 */
	public void setEstado(int estado) {
		this.estado = estado;
	}
	
	/**
	 * método To string.
	 *
	 * @return string
	 */
	@Override
	public String toString() {
		return "Revision [id_revision=" + id_revision + ", id_cliente=" + id_cliente + ", nombreRevision="
				+ nombreRevision + ", detalle=" + detalle + ", estado=" + estado + "]";
	}
	
	

}