package app;

import model.Desconto;

public class TestaDesconto {

    public static void main(String[] args) {

        Desconto desconto = new Desconto();
        desconto.valorOriginal = 120;
        desconto.desconto = 10;

        System.out.println(desconto.calcularDesconto());
    }
}
