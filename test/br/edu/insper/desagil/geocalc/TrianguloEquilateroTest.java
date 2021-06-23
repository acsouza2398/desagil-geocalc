package br.edu.insper.desagil.geocalc;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

class TrianguloEquilateroTest {
	private static final double DELTA = 0.01;

	@Test
	void test() {
		Poligono poligono = new TrianguloEquilatero(5);
		assertEquals(15.0, poligono.perimetro(), DELTA);
		assertEquals(10.83, poligono.area(), DELTA);
	}

}
