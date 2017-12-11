package model;

public class ContaCorrente extends Conta {

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
}
