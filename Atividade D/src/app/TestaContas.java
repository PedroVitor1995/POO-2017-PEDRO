package app;

import model.Conta;
import model.ContaCorrente;
import model.ContaPoupanca;

/**
 * Created by aluno on 30/11/17.
 */
public class TestaContas {

    public static void main(String[] args) {

        Conta c = new Conta();
//        ContaCorrente cc = new ContaCorrente();
//        ContaPoupanca cp = new ContaPoupanca();
        Conta cc = new ContaCorrente();
        Conta cp = new ContaPoupanca();

        c.deposita(1000);
        cc.deposita(1000);
        cp.deposita(1000);

        c.atualiza(0.01);
        cc.atualiza(0.01);
        cp.atualiza(0.01);

        System.out.println(c.getSaldo());
        System.out.println(cc.getSaldo());
        System.out.println(cp.getSaldo());

    }
}

