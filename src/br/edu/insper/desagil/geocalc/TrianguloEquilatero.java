package br.edu.insper.desagil.geocalc;

public class TrianguloEquilatero extends Triangulo {
	private int lado;

	public TrianguloEquilatero(int lado) {
		this.lado = lado;
	}

	@Override
	public double perimetro() {
		return 3 * this.lado;
	}

	@Override
	public double area() {
		double meio = this.lado / 2.0;

		double altura = Math.sqrt(this.lado * this.lado - meio * meio);

		return this.lado * altura / 2;
	}
}
