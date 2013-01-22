package net.icolino.ejemplos.clasesgenericas;

import java.util.List;
import java.util.ArrayList;

import pendiente.GenericoNatural;

public class Basico {

	public static void main (String []  args) {
		List<GenericoNatural<Double>> listaDecimales = 
				new ArrayList<GenericoNatural<Double>>();
		List<GenericoNatural<Long>> listaEnteros = 
				new ArrayList<GenericoNatural<Long>>();
		
		List<Long> lista = new ArrayList<Long>();
		int t = 50;
		int p = t * 5;
		List<Long> listaDoble = new ArrayList<Long>();
		List<String> listaCadena = new ArrayList<String>();
		// Rellenamos
		for (int i = 1; i <= t; i++) {
			lista.add(Math.round(Math.random() * p));
			listaDoble.add(Math.round(Math.random() * 10000));
			listaCadena.add(String.valueOf(Math.random() * 10000));
			listaDecimales.add(new GenericoNatural<Double>(Math.random()));
			listaEnteros.add(new GenericoNatural<Long>(Math.round(Math.random() * 10000)));
		}
		
		Persona per = new Persona("Ignacio", "Colino", "Cortizo");
		System.out.println(per);
		
		//System.out.println(listaDecimales);
		//System.out.println(listaDoble);
		//listaDoble = new Proba<Long>().quicksort(listaDoble);
		//System.out.println(listaDoble);
		System.out.println(listaCadena);
		listaCadena = new OrdenacionBurbuja<String>().ordenar(listaCadena);
		System.out.println(listaCadena);
		
	}
}
