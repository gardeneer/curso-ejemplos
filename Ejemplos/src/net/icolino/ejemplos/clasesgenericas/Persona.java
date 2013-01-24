package net.icolino.ejemplos.clasesgenericas;

/**
 * Clase que define las características básicas de una persona
 * @author Ignacio Colino Cortizo
 */
public class Persona {

	/**
	 * Nombre de la Persona
	 */
	private String nombre;
	
	/**
	 * Primer apellido de la persona
	 */
	private String primerApellido;
	
	/**
	 * Segundo apellido de la persona
	 */
	private String segundoApellido;
	
	/**
	 * Constructor que inicializa todos los atributos del objeto
	 * @param nombre nombre de la persona
	 * @param primerApellido primer apellido de la persona
	 * @param segundoApellido segundo apellido de la persona
	 */
	public Persona(String nombre, String primerApellido, String segundoApellido) {
		this.nombre = nombre;
		this.primerApellido = primerApellido;
		this.segundoApellido = segundoApellido;
	}
	
	/**
	 * Constructor vacío que llama al constructor completo con parámetros definidos.
	 */
	public Persona() {
		this("José", "Blanco", "Blanco");
	}
	
	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getPrimerApellido() {
		return primerApellido;
	}

	public void setPrimerApellido(String primerApellido) {
		this.primerApellido = primerApellido;
	}

	public String getSegundoApellido() {
		return segundoApellido;
	}

	public void setSegundoApellido(String segundoApellido) {
		this.segundoApellido = segundoApellido;
	}

	@Override
	public String toString() {
		return String.format("Persona: %s %s %s", nombre, primerApellido, segundoApellido);
	}
}
