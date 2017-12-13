package app;

import model.ContaCorrente;
import model.Tributavel;

public class TestaTributavel {

    public static void main(String[] args) {

        ContaCorrente cc = new ContaCorrente();
        cc.depositar(1000);
        System.out.println(cc.calculaTributos());

        Tributavel t = cc;
        System.out.println(t.calculaTributos());

    }
}
