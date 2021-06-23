package br.edu.insper.desagil.geocalc;

public class HexagonoRegular extends Poligono {
	private int lado;

	public HexagonoRegular(int lado) {
		this.lado = lado;
	}

	@Override
	public double perimetro() {
		return 6 * this.lado;
	}

	@Override
	public double area() {
		double meio = this.lado / 2.0;

		double altura = Math.sqrt(this.lado * this.lado - meio * meio);

		return 6 * this.lado * altura / 2;
	}
}
