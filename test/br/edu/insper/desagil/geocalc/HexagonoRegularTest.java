package br.edu.insper.desagil.geocalc;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

class HexagonoRegularTest {
	private static final double DELTA = 0.01;

	@Test
	void test() {
		Poligono poligono = new HexagonoRegular(5);
		assertEquals(30.0, poligono.perimetro(), DELTA);
		assertEquals(64.95, poligono.area(), DELTA);
	}

}
