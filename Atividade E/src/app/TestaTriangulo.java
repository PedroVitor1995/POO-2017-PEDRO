package app;

import model.Triangulo;

public class TestaTriangulo {

    public static void main(String[] args) {

        Triangulo triangulo = new Triangulo(2,2,3);

        System.out.println(triangulo.ehRetangulo());
    }
}
