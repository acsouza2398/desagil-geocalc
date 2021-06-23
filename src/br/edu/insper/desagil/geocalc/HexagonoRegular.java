package br.edu.insper.desagil.geocalc;

public class HexagonoRegular extends Poligono {
	private int lado;

	public HexagonoRegular(int lado) {
		this.lado = lado;
	}

	public double perimetro() {
		return 2 * super.perimetro();
	}

	public double area() {
		return 6 * super.area();
	}

}
