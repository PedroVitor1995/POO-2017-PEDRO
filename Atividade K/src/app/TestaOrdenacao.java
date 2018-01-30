package app;

import model.Conta;
import model.ContaPoupanca;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;


public class TestaOrdenacao {

    public static void main(String[] args) {


        List<ContaPoupanca> contas = new ArrayList<>();

        ContaPoupanca c1 = new ContaPoupanca();
        c1.setNumero(1973);
        contas.add(c1);

        ContaPoupanca c2 = new ContaPoupanca();
        c2.setNumero(1462);
        contas.add(c2);

        ContaPoupanca c3 = new ContaPoupanca();
        c3.setNumero(1854);
        contas.add(c3);

        Collections.sort(contas);

        for (int i = 0; i < contas.size(); i++) {
            Conta atual = contas.get(i); System.out.println("numero: " + atual.getNumero());
        }


    }
}
