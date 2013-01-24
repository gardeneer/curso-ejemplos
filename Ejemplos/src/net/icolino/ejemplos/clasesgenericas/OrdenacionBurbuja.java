package net.icolino.ejemplos.clasesgenericas;

import java.util.List;

/**
 * Clase que implementa el algoritmo de ordenación de Burbuja
 * @author Ignacio Colino Cortizo
 * @param <T> tipo de parámetro que extiende a comparable
 */
public class OrdenacionBurbuja<T extends Comparable<T>> extends OrdenacionGenerica<T> {

	@Override
	public List<T> ordenar(List<T> lista) {
		int total = lista.size();
		for (int i = 1; i < total; i++) {
			for (int j = 0; j < (total - i); j++) {
				if ((lista.get(j).compareTo(lista.get(j + 1))) > 0) {
					T aux = lista.get(j);
					lista.set(j, lista.get(j + 1));
					lista.set(j + 1, aux);
				}
			}
		}
		return lista;
	}
}
