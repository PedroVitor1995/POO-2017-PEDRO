package model;

public class ContaPoupanca extends Conta {

    public ContaPoupanca() {

    }

    @Override
    public void atualizar(double taxa) {
        this.saldo += this.saldo * taxa * 3;
    }
}
