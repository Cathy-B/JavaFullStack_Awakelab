package cl.awakelab.certificacion.modelo;

public class Peliculas {

	private String categoria;
	private int idpelicula;
	private String titulo;
	private int duracion;
	private String rating;
	private double precio;
	private int duracionarriendo;
	
	public Peliculas() {
		super();
	}

	public Peliculas(String categoria, int idpelicula, String titulo, int duracion, String rating, double precio,
			int duracionarriendo) {
		super();
		this.categoria = categoria;
		this.idpelicula = idpelicula;
		this.titulo = titulo;
		this.duracion = duracion;
		this.rating = rating;
		this.precio = precio;
		this.duracionarriendo = duracionarriendo;
	}

	public String getCategoria() {
		return categoria;
	}

	public void setCategoria(String categoria) {
		this.categoria = categoria;
	}

	public int getIdpelicula() {
		return idpelicula;
	}

	public void setIdpelicula(int idpelicula) {
		this.idpelicula = idpelicula;
	}

	public String getTitulo() {
		return titulo;
	}

	public void setTitulo(String titulo) {
		this.titulo = titulo;
	}

	public int getDuracion() {
		return duracion;
	}

	public void setDuracion(int duracion) {
		this.duracion = duracion;
	}

	public String getRating() {
		return rating;
	}

	public void setRating(String rating) {
		this.rating = rating;
	}

	public double getPrecio() {
		return precio;
	}

	public void setPrecio(double precio) {
		this.precio = precio;
	}

	public int getDuracionarriendo() {
		return duracionarriendo;
	}

	public void setDuracionarriendo(int duracionarriendo) {
		this.duracionarriendo = duracionarriendo;
	}

	@Override
	public String toString() {
		return "Peliculas [categoria=" + categoria + ", idpelicula=" + idpelicula + ", titulo=" + titulo + ", duracion="
				+ duracion + ", rating=" + rating + ", precio=" + precio + ", duracionarriendo=" + duracionarriendo
				+ "]";
	}

	
}
