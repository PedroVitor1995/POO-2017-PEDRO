package app;

import model.AtualizadorDeContas;
import model.Conta;
import model.ContaCorrente;
import model.ContaPoupanca;

/**
 * Created by aluno on 30/11/17.
 */
public class TestaAtualizadorDeContas {

    public static void main(String[] args) {

        Conta c = new Conta();
        Conta cc = new ContaCorrente();
        Conta cp = new ContaPoupanca();

        c.deposita(1000);
        cc.deposita(1000);
        cp.deposita(1000);

        AtualizadorDeContas adc = new AtualizadorDeContas(0.01);


        System.out.println(adc.roda(c));
        System.out.println(adc.roda(cc));
        System.out.println(adc.roda(cp));

        System.out.println(adc.obterSaldoTotal());
    }
}
