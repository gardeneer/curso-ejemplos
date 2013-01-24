package net.icolino.ejemplos.clasesgenericas;

import java.util.List;
import java.util.ArrayList;

/**
 * Clase que prueba los algoritmos de ordenación genéricos
 * @author Ignacio Colino Cortizo
 */
public class Prueba {

	public static void main (String []  args) {
		System.out.println("Comparando una lista de números");
		List<Long> numeros = new ArrayList<Long>();
		int t = 50;
		int p = t * 5;
		for (int i = 1; i <= t; i++) {
			numeros.add(Math.round(Math.random() * p));
		}
		System.out.println("Lista creada");
		System.out.println(numeros);
		numeros = new OrdenacionRapida<Long>().ordenar(numeros);
		System.out.println("Lista ordenada");
		System.out.println(numeros);
		
		System.out.println("Lista de personas comparables");

		List<PersonaComparable> personas = new ArrayList<PersonaComparable>();
		
		personas.add(new PersonaComparable("Ignacio", "Colino", "Cortizo"));
		personas.add(new PersonaComparable("Ignacio", "Cortizo", "Colino"));
		personas.add(new PersonaComparable("Ignacio", "Colino", "Colino"));
		personas.add(new PersonaComparable("Ignacio", "Cortizo", "Cortizo"));

		System.out.println("Lista creada");
		System.out.println(personas);
		personas = new OrdenacionRapida<PersonaComparable>().ordenar(personas);
		System.out.println("Lista ordenada");
		System.out.println(personas);
	}
}
