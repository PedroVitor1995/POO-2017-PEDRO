package app;

import model.Calculadora;
import model.CalculadoraCientifica;

public class TestaCalculadora {

    public static void main(String[] args) {

        Calculadora calculadora = new Calculadora(4,4);
        System.out.println(calculadora.somar());

        CalculadoraCientifica c2 = new CalculadoraCientifica(2,3);
        System.out.println(c2.dividir());
        System.out.println(c2.exponeciar(2,4));

    }
}
