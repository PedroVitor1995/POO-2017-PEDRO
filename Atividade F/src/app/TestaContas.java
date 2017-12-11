package app;

import model.Conta;
import model.ContaCorrente;
import model.ContaPoupanca;

public class TestaContas {

    public static void main(String[] args) {


//        ContaCorrente cc = new ContaCorrente();
//        ContaPoupanca cp = new ContaPoupanca();
        Conta cc = new ContaCorrente();
        Conta cp = new ContaPoupanca();


        cc.depositar(1000);
        cp.depositar(1000);


        cc.atualizar(0.01);
        cp.atualizar(0.01);


        System.out.println(cc.getSaldo());
        System.out.println(cp.getSaldo());

    }
}

