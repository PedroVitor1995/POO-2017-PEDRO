package app;

import model.SituacaoFinanceira;

public class TestaSituacaoFinanceira {

    public static void main(String[] args) {

        SituacaoFinanceira situacaoFinanceira = new SituacaoFinanceira();
        situacaoFinanceira.valorCreditos = 1000;
        situacaoFinanceira.valorDebitos = 300;
        System.out.println(situacaoFinanceira.saldo());
    }
}
