package net.icolino.ejemplos.clasesgenericas;

import java.util.ArrayList;
import java.util.List;

public class OrdenacionRapida<T extends Comparable<T>> extends OrdenacionGenerica<T> {

	public List<T> ordenar(List<T> lista) {
		int total = lista.size();
		List<T> sublista1;
		List<T> sublista2;
		if (total > 1) {
			int pivote = (int)Math.floor(total/2);
			sublista1 = ordenar(lista.subList(0, pivote));
			sublista2 = ordenar(lista.subList(pivote, total));
		} else {
			return lista;
		}
		List<T> aux = new ArrayList<T>();
		int i = 0;
		int j = 0;
		while ((i < sublista1.size()) && (j < sublista2.size())) {
			if (sublista1.get(i).compareTo(sublista2.get(j)) <= 0) {
				aux.add(sublista1.get(i++));
			} else {
				aux.add(sublista2.get(j++));
			}
		}
		while (i < sublista1.size()) {
			aux.add(sublista1.get(i++));
		}
		while (j < sublista2.size()) {
			aux.add(sublista2.get(j++));
		}
		return aux;	
	}
}
