package net.icolino.ejemplos.clasesgenericas;

import java.util.List;


public abstract class OrdenacionGenerica<T extends Comparable<T>> {

	public abstract List<T> ordenar(List<T> lista);
}
