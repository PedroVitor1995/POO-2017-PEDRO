package model;

public abstract class Conta {

    protected double saldo;

    public Conta(){

    }
    public boolean depositar(double valor){
        if (valor > 0){
            this.saldo += valor;
            return true;
        }
        return false;
    }
    public boolean sacar(double valor){
        if (getSaldo() >= valor){
            this.saldo -= valor;
            return true;
        }
        return false;

    }
    public double getSaldo() {
        return this.saldo;
    }
    public abstract void atualizar(double taxa);
}
