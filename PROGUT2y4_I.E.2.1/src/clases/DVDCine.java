package clases;

/**
 * Escribe una clase que represente una película en DVD de nombre DVDCine con
 * los atributos necesarios para mostrar la ficha que se recoge en el apartado
 * segundo. Esta clase contará con un constructor que admite como argumentos
 * todos los atributos de la clase.
 * 
 * @author antofer
 *
 */
public class DVDCine {

	/**
	 * Titulo de la pelicula en el mercado español
	 */
	private String titulo;
	/**
	 * Título Original de la película
	 */
	private String tituloOriginal;
	/**
	 * Año de Estreno
	 */
	private int anio;
	/**
	 * Nombre del director
	 */
	private String director;
	/**
	 * Nombres de actores que participan en la película
	 */
	private String reparto;
	/**
	 * Género al que pertenece
	 */
	private String genero;
	/**
	 * duración de la película (en minutos)
	 */
	private int duracion;
	/**
	 * Resumen de la película
	 */
	private String resumen;

	/**
	 * @param titulo
	 *            - Titulo de la pelicula en el mercado español
	 * @param tituloOriginal
	 *            - Título Original de la película
	 * @param anio
	 *            - Año de Estreno
	 * @param director
	 *            - Nombre del director
	 * @param reparto
	 *            - Nombres de actores que participan en la película
	 * @param genero
	 *            - Género al que pertenece
	 * @param duracion
	 *            - duración de la película (en minutos)
	 * @param resumen
	 *            - Resumen de la película
	 */
	public DVDCine(String titulo, String tituloOriginal, int anio, String director, String reparto, String genero,
			int duracion, String resumen) {

		this.titulo = titulo;
		this.tituloOriginal = tituloOriginal;
		this.anio = anio;
		this.director = director;
		this.reparto = reparto;
		this.genero = genero;
		this.duracion = duracion;
		this.resumen = resumen;

	}

	/**
	 * @return retorna una descripción completa de la película.
	 */
	public String muestraDVDCine() {

		//creamos la cadena de texto a devolver.
		String texto = (titulo != tituloOriginal) ? titulo + " (" + tituloOriginal + ")" : titulo;
		texto += " Dirigida por : " + director + "/n";
		texto += "Reparto : " + reparto + "/n";
		texto += "Género : " + genero + "/n";
		texto += "Duración : " + muestraDuracion() + "/n";
		if (tieneResumen()) {
			texto += "Resumen : " + resumen;
		}else {
			texto += "No tiene resumen";
		}
		
		//devolvemos la cadena montada.
		return texto;

	}

	/**
	 * @return Este método retorna cierto (true), si la película pertenece a este género cinematográfico.
	 */
	public boolean esThriller() {
		
		if (genero == "Thriller") {
			return true;
		} else {
			return false;
		}

	}
	
	/**
	 * @return Retorna cierto si la película tiene el resumen escrito.
	 */
	public boolean tieneResumen() {
		
		if (this.resumen.length()>0) {
			return true;
		}else {
			return false;
		}
	}
	
	/**
	 * @return Retorna la duración con el formato: "x min."
	 */
	public String muestraDuracion() {
		
		return duracion + " min.";
		
	}

}
