package app;

import model.ContaTributavel;
import model.ContaCorrente2;

public class TestaConta {

    public static void main(String[] args) {

        ContaTributavel c1 = new ContaCorrente2();
        c1.depositar(10000);
        System.out.println(c1.getSaldo());
    }
}
