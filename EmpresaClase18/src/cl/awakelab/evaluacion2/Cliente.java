package cl.awakelab.evaluacion2;

/* *
 * @ Clase Cliente
 * @ autores Jorge, Catherine, Yamilet
 * @ versión 16/11/2020 7
 * 
 */
public class Cliente extends Usuario {

	/** Atributos de la clase encapsulados */
	
	private String rut;
	private String nombre;
	private String apellidos;
	private int telefono;
	private String afp;
	private int sistemaSalud;
	private String direccion;
	private String comuna;
	private int edad;

	/**
	 * método to string.
	 *
	 * @return un string
	 */
	@Override
	public String toString() {
		return "Cliente [rut= " + rut + ", nombre= " + nombre + ", apellidos= " + apellidos + ", telefono= " + telefono
				+ ", afp= " + afp + ", sistemaSalud= " + sistemaSalud + ", direccion= " + direccion + ", comuna= "
				+ comuna + ", edad= " + edad + "]";
	}

	/**
	 * Constructor vacío de la clase cliente.
	 */
	public Cliente() {
		super();
	}

	/**
	 * Constructor con los atributos de la clase cliente y de la clase padre usuario.
	 *
	 * @param nombreUser      nombre user del usuario
	 * @param fechaNacimiento fecha nacimiento usuario
	 * @param run             run del usuario
	 * @param rut             rut
	 * @param nombre          nombre
	 * @param apellidos       apellidos
	 * @param telefono        telefono
	 * @param afp             afp
	 * @param sistemaSalud    sistema salud
	 * @param direccion       direccion
	 * @param comuna          comuna
	 * @param edad            edad
	 */
	public Cliente(String nombreUser, String fechaNacimiento, String run, String rut, String nombre, String apellidos,
			int telefono, String afp, int sistemaSalud, String direccion, String comuna, int edad) {
		super(nombreUser, fechaNacimiento, run);
		this.rut = rut;
		this.nombre = nombre;
		this.apellidos = apellidos;
		this.telefono = telefono;
		this.afp = afp;
		this.sistemaSalud = sistemaSalud;
		this.direccion = direccion;
		this.comuna = comuna;
		this.edad = edad;
	}

	/**
	 * Gets rut.
	 *
	 * @return rut
	 */
	public String getRut() {

		return rut;

	}

	/**
	 * Sets the rut.
	 *
	 * @param rut the new rut
	 */
	public void setRut(String rut) {
		this.rut = rut;
	}

	/**
	 * Gets the nombre.
	 *
	 * @return the nombre
	 */
	public String getNombre() {

		return nombre;
	}

	/**
	 * Sets the nombre.
	 *
	 * @param nombre the new nombre
	 */
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	/**
	 * Gets the apellidos.
	 *
	 * @return the apellidos
	 */
	public String getApellidos() {
		return apellidos;
	}

	/**
	 * Sets the apellidos.
	 *
	 * @param apellidos the new apellidos
	 */
	public void setApellidos(String apellidos) {
		this.apellidos = apellidos;
	}

	/**
	 * Gets the telefono.
	 *
	 * @return the telefono
	 */
	public int getTelefono() {
		return telefono;
	}

	/**
	 * Sets the telefono.
	 *
	 * @param telefono the new telefono
	 */
	public void setTelefono(int telefono) {
		this.telefono = telefono;
	}

	/**
	 * Gets the afp.
	 *
	 * @return the afp
	 */
	public String getAfp() {
		return afp;
	}

	/**
	 * Sets the afp.
	 *
	 * @param afp the new afp
	 */
	public void setAfp(String afp) {
		this.afp = afp;
	}

	/**
	 * Gets the sistema salud.
	 *
	 * @return the sistema salud
	 */
	public int getSistemaSalud() {
		return sistemaSalud;
	}

	/**
	 * Sets the sistema salud.
	 *
	 * @param sistemaSalud the new sistema salud
	 */
	public void setSistemaSalud(int sistemaSalud) {
		this.sistemaSalud = sistemaSalud;
	}

	/**
	 * Gets the direccion.
	 *
	 * @return the direccion
	 */
	public String getDireccion() {
		return direccion;
	}

	/**
	 * Sets the direccion.
	 *
	 * @param direccion the new direccion
	 */
	public void setDireccion(String direccion) {
		this.direccion = direccion;
	}

	/**
	 * Gets the comuna.
	 *
	 * @return the comuna
	 */
	public String getComuna() {
		return comuna;
	}

	/**
	 * Sets the comuna.
	 *
	 * @param comuna the new comuna
	 */
	public void setComuna(String comuna) {
		this.comuna = comuna;
	}

	/**
	 * Gets the edad.
	 *
	 * @return the edad
	 */
	public int getEdad() {
		return edad;
	}

	/**
	 * Sets the edad.
	 *
	 * @param edad the new edad
	 */
	public void setEdad(int edad) {
		this.edad = edad;
	}

	/**
	 * método Obtener sistema salud según el el valor ingresado muestra la información
	 *
	 * @return the string
	 */
	public String obtenerSistemaSalud() {
		String mensaje;

		if (sistemaSalud == 1) {
			mensaje = "Fonasa";
		} else if (sistemaSalud == 2) {
			mensaje = "Isapre";
		} else {
			mensaje = "No válido";
		}

		return mensaje;
	}

	/**
	 * método Analizar usuario muestra dirección y comuna del cliente
	 */
	@Override
	public void analizarUsuario() {

		super.analizarUsuario();

		System.out.println("Dirección del cliente: " + this.direccion);
		System.out.println("Comuna del cliente: " + this.comuna);

	}

	/**
	 * método Obtener nombre muestra el nombre completo del cliente
	 *
	 * @return the string
	 */
	public String obtenerNombre() {

		String nombreCompleto = this.nombre + " " + this.apellidos;

		return nombreCompleto;

	}

	/**
	 * método Mostrar detalle muestra todos los atributos del cliente
	 */
	@Override
	public void mostrarDetalle() {
		System.out.println("Rut : " + this.rut);
		System.out.println("Nombre : " + this.nombre + " " + this.apellidos);
		System.out.println("Teléfono: " + this.telefono);
		System.out.println("AFP: " + this.afp);
		String mensaje;

		if (sistemaSalud == 1) {
			mensaje = "Fonasa";
		} else if (sistemaSalud == 2) {
			mensaje = "Isapre";
		} else {
			mensaje = "No válido";
		}

		System.out.println("Sistema de salud: " + mensaje);
		System.out.println("Dirección: " + this.direccion);
		System.out.println("Comuna: " + this.comuna);
		System.out.println("Edad: " + this.edad);

	}

}
