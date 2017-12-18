package app;

import model.AreaCalculavel;
import model.Circulo;
import model.Retangulo;

public class Teste {

    public static void main(String[] args) {

        AreaCalculavel a = new Retangulo(3,2);
        System.out.println(a.calcularArea());
        AreaCalculavel a1 = new Circulo(3);
        System.out.println(a1.calcularArea());
    }
}
