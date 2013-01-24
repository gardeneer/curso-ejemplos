package net.icolino.ejemplos.excepciones;

public class GeneradorDeExcepciones {
	
	private enum ListaDeExcepciones {EXCEPCION, MI_EXCEPCION, EXCEPCION_PUNTERO_NULO, EXCEPCION_POR_LIMITE};
	
	public static void main(String [] args) {
		ListaDeExcepciones excepcion = ListaDeExcepciones.MI_EXCEPCION;
		bucleExterno:
		while (true) {
			while(true) {
				try {
					switch(excepcion) {
					case MI_EXCEPCION:
						throw new ExcepcionPersonalizada();
					case EXCEPCION_PUNTERO_NULO:
						String s = null;
						System.out.println(s.charAt(0));
						break;
					case EXCEPCION_POR_LIMITE:
						int array[] = new int[2];
						System.out.println(array[4]);
						/* Continúa en el caso siguiente*/
					default:
						System.out.println("Opción por defecto");
						break;
					case EXCEPCION:
						throw new Exception();
					}						
				} catch (ExcepcionPersonalizada ep) {
					System.out.println("Excepcion personalizada");
					excepcion = ListaDeExcepciones.EXCEPCION_PUNTERO_NULO;
				} catch (NullPointerException npe) {
					System.out.println("Puntero nulo");
					excepcion = ListaDeExcepciones.EXCEPCION_POR_LIMITE;
					break;
				} catch (IndexOutOfBoundsException ioobe) {
					System.out.println("Fuera de límites");
					excepcion = ListaDeExcepciones.EXCEPCION;
				} catch (Exception e) {
					System.out.println("Excepcion padre");
					break bucleExterno;
				} finally {
					System.out.println("Siempre se ejecuta");
				}
			}
		}
		
	}
}
