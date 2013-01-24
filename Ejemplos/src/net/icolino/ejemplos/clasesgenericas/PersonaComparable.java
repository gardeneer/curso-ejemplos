package net.icolino.ejemplos.clasesgenericas;

/**
 * Clase basada en persona pero que le añade la firma de Comparable para que pueda ser usada por
 * los algoritmos de ordenación ya existentes
 * @author Ignacio Colino Cortizo
 *
 */
public class PersonaComparable extends Persona implements Comparable<PersonaComparable> {

	/**
	 * Constructor que inicializa los parámetros a través de un constructor de la clase padre
	 * @param nombre nombre de la persona
	 * @param primerApellido primer apellido de la persona
	 * @param segundoApellido segundo apellido de la persona
	 */
	public PersonaComparable(String nombre, String primerApellido, String segundoApellido) {
		super(nombre, primerApellido, segundoApellido);
	}
	
	@Override
	public int compareTo(PersonaComparable p) {
		// Se ordena primero por segundo apellido, luego por nombre y por último, primer apellido
		int resultado = this.getSegundoApellido().compareTo(p.getSegundoApellido()); 
		if (resultado != 0) {
			return resultado;
		}
		resultado = this.getNombre().compareTo(p.getNombre());
		if (resultado != 0) {
			return resultado;
		}
		return this.getPrimerApellido().compareTo(p.getPrimerApellido());
	}
}
