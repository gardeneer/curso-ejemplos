package net.icolino.ejemplos.clasesgenericas;

public class PersonaComparable extends Persona implements Comparable<PersonaComparable> {

	public PersonaComparable(String nombre, String primerApellido, String segundoApellido) {
		super(nombre, primerApellido, segundoApellido);
	}
	
	@Override
	public int compareTo(PersonaComparable p) {
		// TODO Auto-generated method stub
		return 0;
	}
}
