package app;

import model.Retangulo;

public class TestaRetangulo {

    public static void main(String[] args) {

        Retangulo retangulo = new Retangulo();
        retangulo.l1 = 10;
        retangulo.l2 = 20;
        System.out.println(retangulo.calcularArea());
        System.out.println(retangulo.calcularPerimetro());
    }
}
