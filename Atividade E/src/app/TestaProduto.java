package app;

import model.Produto;

public class TestaProduto {

    public static void main(String[] args) {

        Produto produto1 = new Produto(1,"arroz",2.0,2);
        System.out.println(produto1);
        produto1.reajusta(2);
        System.out.println(produto1);
        produto1.baixar(1);
        System.out.println(produto1);
    }
}
