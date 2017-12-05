package app;

import model.Carro;

public class TestaCarro {

    public static void main(String[] args) {

        Carro c1 = new Carro("oue303",6716467,"Fusca","2010");
        Carro c2 = new Carro("try564",45421567,"Opala","1990");

        System.out.println(c1.clonado(c2));
    }
}
