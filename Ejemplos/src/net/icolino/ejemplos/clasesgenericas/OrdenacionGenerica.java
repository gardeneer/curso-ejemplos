package net.icolino.ejemplos.clasesgenericas;

import java.util.List;

/**
 * Esta interfaz define los metodos que debe implementar cualquier clase que desee ordenar elementos
 * @author Ignacio Colino
 * @param <T> Parámetro que hereda de comparable (necesario para poder crear algoritmos genéricos).
 */
public abstract class OrdenacionGenerica<T extends Comparable<T>> {

	/**
	 * Método que ordena una lista de elementos.
	 * @param lista lista de elementos de tipo T que se desean comparar
	 * @return una lista con los elementos dados ordenados
	 */
	public abstract List<T> ordenar(List<T> lista);
}
