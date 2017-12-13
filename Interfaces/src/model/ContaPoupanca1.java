package model;

public class ContaPoupanca1 implements Conta1{

    private double saldo;

    public ContaPoupanca1() {
    }

    @Override
    public double getSaldo() {
        return this.saldo;
    }

    @Override
    public boolean depositar(double valor) {
        if (valor > 0){
            this.saldo += valor;
            return true;
        }
        return false;
    }

    @Override
    public boolean sacar(double valor) {
        if (getSaldo() >= valor){
            this.saldo -= valor;
            return true;
        }
        return false;
    }

    @Override
    public void atualizar(double taxaSelic) {
        this.saldo += this.saldo * taxaSelic * 3;
    }
}
