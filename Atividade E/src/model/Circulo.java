package model;

public class Circulo {

    public double raio;
    private  double pi = 3.14;

    public Circulo() {

    }
    public double calcularArea(){
        return pi * (raio * raio);
    }
    public double calcularPerimetro(){
        return 2 * pi * raio;
    }
}
