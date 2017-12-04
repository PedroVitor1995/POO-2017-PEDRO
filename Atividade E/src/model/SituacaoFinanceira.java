package model;

public class SituacaoFinanceira {

   public double valorCreditos;
   public double valorDebitos;

    public SituacaoFinanceira() {
    }

    public double saldo() {
        return valorCreditos - valorDebitos;
    }
}
