package cl.awakelab.evaluacion.modelo;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Profesional {

	@Id
	private String runprofesional;
	@Column(name = "nombres")
	private String nombre_pro;
	@Column(name = "apellidos")
	private String apellido_pro;
	@Column(name = "telefono")
	private String telefono_pro;
	private String titulo;
	private String proyecto;
	private int usuario_runusuario;
	
	public Profesional() {
		super();
	}

	public Profesional(String runprofesional, String nombre_pro, String apellido_pro, String telefono_pro,
			String titulo, String proyecto, int usuario_runusuario) {
		super();
		this.runprofesional = runprofesional;
		this.nombre_pro = nombre_pro;
		this.apellido_pro = apellido_pro;
		this.telefono_pro = telefono_pro;
		this.titulo = titulo;
		this.proyecto = proyecto;
		this.usuario_runusuario = usuario_runusuario;
	}

	public String getRunprofesional() {
		return runprofesional;
	}

	public void setRunprofesional(String runprofesional) {
		this.runprofesional = runprofesional;
	}

	public String getNombre_pro() {
		return nombre_pro;
	}

	public void setNombre_pro(String nombre_pro) {
		this.nombre_pro = nombre_pro;
	}

	public String getApellido_pro() {
		return apellido_pro;
	}

	public void setApellido_pro(String apellido_pro) {
		this.apellido_pro = apellido_pro;
	}

	public String getTelefono_pro() {
		return telefono_pro;
	}

	public void setTelefono_pro(String telefono_pro) {
		this.telefono_pro = telefono_pro;
	}

	public String getTitulo() {
		return titulo;
	}

	public void setTitulo(String titulo) {
		this.titulo = titulo;
	}

	public String getProyecto() {
		return proyecto;
	}

	public void setProyecto(String proyecto) {
		this.proyecto = proyecto;
	}

	public int getUsuario_runusuario() {
		return usuario_runusuario;
	}

	public void setUsuario_runusuario(int usuario_runusuario) {
		this.usuario_runusuario = usuario_runusuario;
	}

	@Override
	public String toString() {
		return "Profesional [runprofesional=" + runprofesional + ", nombre_pro=" + nombre_pro + ", apellido_pro="
				+ apellido_pro + ", telefono_pro=" + telefono_pro + ", titulo=" + titulo + ", proyecto=" + proyecto
				+ ", usuario_runusuario=" + usuario_runusuario + "]";
	}
	
	
}
