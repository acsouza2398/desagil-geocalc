package br.edu.insper.desagil.geocalc;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

class TrianguloRetanguloTest {
	private static final double DELTA = 0.01;

	@Test
	void test() {
		Poligono poligono = new TrianguloRetangulo(3, 4);
		assertEquals(12.0, poligono.perimetro(), DELTA);
		assertEquals(6.0, poligono.area(), DELTA);
	}

}
