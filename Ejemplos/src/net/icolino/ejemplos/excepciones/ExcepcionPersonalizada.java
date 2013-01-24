package net.icolino.ejemplos.excepciones;

/**
 * Excepción personalizada. Hereda de Exception y el constructor llama al de la clase padre
 * @author Ignacio Colino Cortizo
 */
public class ExcepcionPersonalizada extends Exception {
	
	public ExcepcionPersonalizada() {
		super("Esta es una excepción personalizada");
	}

}
