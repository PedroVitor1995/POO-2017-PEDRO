package model;

public class ContaCorrente2 implements ContaTributavel {

    private double saldo;

    public ContaCorrente2(){
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
        this.saldo += this.saldo * taxaSelic * 2;
    }

    @Override
    public double calculaTributos() {
        return this.getSaldo() * 0.01;
    }
}
