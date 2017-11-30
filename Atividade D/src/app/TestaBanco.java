package app;

import model.Banco;
import model.Conta;
import model.ContaCorrente;
import model.ContaPoupanca;

/**
 * Created by aluno on 30/11/17.
 */
public class TestaBanco {

    public static void main(String[] args) {

        Banco banco = new Banco("Banco Premium");
        banco.contas = new Conta[10];

        Conta c = new Conta();
        c.deposita(1000);
        banco.adicionarContas(c);

        Conta c1 = new Conta();
        c1.deposita(2000);
        banco.adicionarContas(c1);

        Conta cc = new ContaCorrente();
        cc.deposita(3000000);
        banco.adicionarContas(cc);

        Conta cp = new ContaPoupanca();
        cp.deposita(5000);
        banco.adicionarContas(cp);

        System.out.println(banco.getNome());
        System.out.println(banco.obterTotalDeContas());
        System.out.println(banco.pegaConta(3).getSaldo());


    }
}
