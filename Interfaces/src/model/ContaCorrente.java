package model;

public class ContaCorrente extends Conta implements Tributavel {

    public ContaCorrente() {

    }

    @Override
    public void atualizar(double taxa) {
        this.saldo += this.saldo * taxa * 2;
    }

    @Override
    public boolean depositar(double valor) {
        return super.depositar(valor);
    }

    @Override
    public double calculaTributos() {
        return this.getSaldo() * 0.01;
    }
}
