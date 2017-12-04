package app;

import model.Soma;

public class TestaSoma {

    public static void main(String[] args) {

        Soma soma = new Soma();
        soma.numero1 = 100;
        soma.numero2 = 300;

        System.out.println(soma.calcularSoma());

    }
}
