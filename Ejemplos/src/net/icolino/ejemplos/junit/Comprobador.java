package net.icolino.ejemplos.junit;

import java.util.ArrayList;
import java.util.List;

import net.icolino.ejemplos.clasesgenericas.OrdenacionBurbuja;
import net.icolino.ejemplos.clasesgenericas.OrdenacionRapida;
import net.icolino.ejemplos.clasesgenericas.PersonaComparable; 

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.fail;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

public class Comprobador {

	private static List<PersonaComparable> personas;
	private static PersonaComparable p1;
	private static PersonaComparable p2;
	private static PersonaComparable p3;
	private static PersonaComparable p4;
	private static PersonaComparable pControl;
	
	@BeforeClass
	public static void setUpClass() throws Exception {
		personas = new ArrayList<PersonaComparable>();
		p1 = new PersonaComparable("Ignacio", "Colino", "Cortizo");
		p2 = new PersonaComparable("Ignacio", "Cortizo", "Colino");
		p3 = new PersonaComparable("Ignacio", "Colino", "Colino");
		p4 = new PersonaComparable("Ignacio", "Cortizo", "Cortizo");
		pControl = new PersonaComparable("Aaaaa", "Aaaa", "Aaa");
	}
	
	@Before
	public void setUp() {
		personas.add(p1);
		personas.add(p2);
		personas.add(p3);
		personas.add(p4);
		personas.add(pControl);
	}
	
	@Test
	public void pruebaOrdenacionRapida() {
		personas = new OrdenacionRapida<PersonaComparable>().ordenar(personas);
		assertEquals("Resultado", personas.get(0).compareTo(pControl), 0);
	}
	
	@Test
	public void pruebaOrdenacionBurbuja() {
		personas = new OrdenacionBurbuja<PersonaComparable>().ordenar(personas);
		assertEquals("Resultado", personas.get(0).compareTo(pControl), 0);
	}
	
	@Test
	public void pruebaQueFalla() {
		fail("Esta prueba falla deliberadamente");
	}
	
	@After
	public void tearDown() throws Exception {
		personas.clear();
	}
	
	@AfterClass
	public static void tearDownClass() throws Exception {
		// Código ejecutado después del último método
	}
	
}
