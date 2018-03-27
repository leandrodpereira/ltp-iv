package br.fepi.sistemas.lab11.teste;

import static org.junit.Assert.assertEquals;

import org.junit.Before;
import org.junit.Test;

import br.fepi.sistemas.lab11b.EquacaoPell;

public class EquacaoPellTest {

	EquacaoPell ep;
	
	@Before
	public void setUp() throws Exception {
		ep = new EquacaoPell();
	}

	@Test
	public void testRaizInteira() {
		assertEquals(4, ep.raizInteira(16));
	}

}
