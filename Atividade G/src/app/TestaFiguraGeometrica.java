package app;

import model.FiguraGeometrica;
import model.Quadrado;

public class TestaFiguraGeometrica {

    public static void main(String[] args) {

        FiguraGeometrica f1 = new Quadrado(10);

        System.out.println(f1.calcularArea());
        System.out.println(f1.calcularPerimetro());


    }
}
