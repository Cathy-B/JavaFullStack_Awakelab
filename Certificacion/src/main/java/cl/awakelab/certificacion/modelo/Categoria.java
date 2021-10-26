package cl.awakelab.certificacion.modelo;

public class Categoria {

	private int idcategoria;
	private String nombre;
	private String ultimaActua;
	
	public Categoria() {
		super();
	}

	public Categoria(int idcategoria, String nombre, String ultimaActua) {
		super();
		this.idcategoria = idcategoria;
		this.nombre = nombre;
		this.ultimaActua = ultimaActua;
	}

	public int getIdcategoria() {
		return idcategoria;
	}

	public void setIdcategoria(int idcategoria) {
		this.idcategoria = idcategoria;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getUltimaActua() {
		return ultimaActua;
	}

	public void setUltimaActua(String ultimaActua) {
		this.ultimaActua = ultimaActua;
	}

	@Override
	public String toString() {
		return "Categoria [idcategoria=" + idcategoria + ", nombre=" + nombre + ", ultimaActua=" + ultimaActua + "]";
	}
	
	
}
