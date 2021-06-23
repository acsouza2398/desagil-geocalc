package br.edu.insper.desagil.geocalc;

public class TrianguloRetangulo extends Triangulo {
	private int cateto1;
	private int cateto2;

	public TrianguloRetangulo(int cateto1, int cateto2) {
		this.cateto1 = cateto1;
		this.cateto2 = cateto2;
	}

	@Override
	public double perimetro() {
		double hipotenusa = Math.sqrt(this.cateto1 * this.cateto1 + this.cateto2 * this.cateto2);
		return hipotenusa + this.cateto1 + this.cateto2;
	}

	@Override
	public double area() {
		return this.cateto1 * this.cateto2 / 2;
	}
}
