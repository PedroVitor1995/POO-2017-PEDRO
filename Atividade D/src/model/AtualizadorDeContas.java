package model;

public class AtualizadorDeContas {

    private double saldoTotal = 0;
    private double selic;

    public AtualizadorDeContas(double selic){
        this.selic = selic;
    }
    public String roda(Conta c){
        String saldo = "Saldo anterior: "+c.getSaldo();
        c.atualiza(selic);
        saldo += "\nSaldo atual: "+c.getSaldo();
        saldoTotal += c.getSaldo();
        return saldo;
    }
    public double getSaldoTotal() {
        return this.saldoTotal;
    }
    public String obterSaldoTotal(){
        return "Saldo total: "+getSaldoTotal();
    }

}
