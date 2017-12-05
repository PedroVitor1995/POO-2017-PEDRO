package Questao05model;

public class Circulo {
	
	double raio;
	double diametro;
	double pi = 3.14;
	
	public double circuferencia(double raio,double diametro){
		double C = 2 * pi * raio;
		return C;
	}
	public double areaCirculo(double raio){
		double A = pi * raio * raio;
		return A;
	}
}
