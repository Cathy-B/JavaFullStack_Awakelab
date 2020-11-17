package cl.awakelab.evaluacion2;

import java.time.LocalDate;
import java.time.Period;
import java.time.format.DateTimeFormatter;

/* *
 * @ Clase padre
 * @ autores Jorge, Catherine, Yamilet
 * @ versión 16/11/2020 7
 * 
 */
public abstract class Usuario implements Asesoria {

// Atributos de la clase
	private String nombreUser;
	private String fechaNacimiento;
	private String run;

	/**
	 * método To string.
	 *
	 * @return string
	 */
	@Override
	public String toString() {
		return "Usuario [nombreUser= " + nombreUser + ", fechaNacimiento= " + fechaNacimiento + ", run= " + run + "]";
	}

	/**
	 * Constructor vacío usuario.
	 */
	public Usuario() {
		super();
	}

	/**
	 * Constructor con los atributos de la clase padre usuario.
	 *
	 * @param nombreUser      the nombre user
	 * @param fechaNacimiento the fecha nacimiento
	 * @param run             the run
	 */
	public Usuario(String nombreUser, String fechaNacimiento, String run) {
		super();
		this.nombreUser = nombreUser;
		this.fechaNacimiento = fechaNacimiento;
		this.run = run;
	}

	/**
	 * Gets the nombre user.
	 *
	 * @return the nombre user
	 */
	public String getNombreUser() {
		return nombreUser;
	}

	/**
	 * Sets the nombre.
	 *
	 * @param nombreUser the new nombre
	 */
	public void setNombre(String nombreUser) {
		this.nombreUser = nombreUser;
	}

	/**
	 * Gets the fecha nacimiento.
	 *
	 * @return the fecha nacimiento
	 */
	public String getFechaNacimiento() {
		return fechaNacimiento;
	}

	/**
	 * Sets the fecha nacimiento.
	 *
	 * @param fechaNacimiento the new fecha nacimiento
	 */
	public void setFechaNacimiento(String fechaNacimiento) {
		this.fechaNacimiento = fechaNacimiento;
	}

	/**
	 * Gets the run.
	 *
	 * @return the run
	 */
	public String getRun() {
		return run;
	}

	/**
	 * Sets the run.
	 *
	 * @param run the new run
	 */
	public void setRun(String run) {
		this.run = run;
	}

	/**
	 * método Mostrar edad con la fecha ingresada muestra un mensaje con la edad del
	 * usuario
	 */
	public void mostrarEdad() {
		DateTimeFormatter date = DateTimeFormatter.ofPattern("dd/MM/yyyy");
		LocalDate nacimiento = LocalDate.parse(this.getFechaNacimiento(), date);
		LocalDate fechaActual = LocalDate.now();
		Period periodo = Period.between(nacimiento, fechaActual);

		System.out.println("El usuario " + this.getNombreUser() + " tiene " + periodo.getYears() + " años");

	}

	/**
	 * método Analizar usuario implementado desde la interface Asesoría muestra el
	 * nombre y el run del usuario
	 */
	@Override
	public void analizarUsuario() {
		System.out.println("Nombre del usuario: " + this.getNombreUser());

		if (Integer.parseInt(run) < 99999999) {
			System.out.println("Run del usuario: " + this.getRun());

		} else {
			System.out.println("Rut no es válido");
		}

	}

	/**
	 * Mostrar detalle.
	 */
	@Override
	public void mostrarDetalle() {
		// TODO Auto-generated method stub

	}

}
