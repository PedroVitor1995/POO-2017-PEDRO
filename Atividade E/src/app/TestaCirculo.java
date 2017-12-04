package app;

import model.Circulo;

public class TestaCirculo {

    public static void main(String[] args) {

        Circulo circulo = new Circulo();

        circulo.raio = 5;

        System.out.println(circulo.calcularArea());
        System.out.println(circulo.calcularPerimetro());
    }
}
