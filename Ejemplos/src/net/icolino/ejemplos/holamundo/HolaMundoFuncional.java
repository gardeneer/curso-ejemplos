package net.icolino.ejemplos.holamundo;

public class HolaMundoFuncional {
	public static void main(String ... argumentos) {
		HolaMundoFuncional.imprimir("Hola");
		HolaMundoFuncional.imprimir("Mundo", "Funcional");
	}
	
	private static void imprimir(String ... cadenas) {
		for(String s: cadenas) {
			System.out.print(s);
		}
	}

	private static void imprimir(String cadena) {
		System.out.printf("->%s", cadena);
	}
	
}
