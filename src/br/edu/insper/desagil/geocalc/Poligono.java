package br.edu.insper.desagil.geocalc;

public class Poligono {
	private int lado;
	
	public double perimetro() {
		return 3 * this.lado;
	};

	public double area() {
		double meio = this.lado / 2.0;

		double altura = Math.sqrt(this.lado * this.lado - meio * meio);

		return this.lado * altura / 2;
	};
	
};
	
