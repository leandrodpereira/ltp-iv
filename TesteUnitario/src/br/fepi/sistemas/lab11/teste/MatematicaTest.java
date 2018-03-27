package br.fepi.sistemas.lab11.teste;

import static org.junit.Assert.assertEquals;

import org.junit.Before;
import org.junit.Test;

import br.fepi.sistemas.lab11.Matematica;

public class MatematicaTest {

	Matematica m;

	@Before
	public void setUp() throws Exception {
		m = new Matematica();
	}

	@Test
	public void testMaior() {
		assertEquals(6, m.maior(5, 6));
	}

	@Test
	public void testSoma() {
		assertEquals(9.0, m.soma(4.5, 4.5),0);
	}

}
