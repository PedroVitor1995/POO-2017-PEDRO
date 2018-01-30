package model;

public abstract class Conta {

    protected double saldo;
    protected int numero;

    public Conta(){

    }
    public int getNumero() {
        return numero;
    }

    public void setNumero(int numero) {
        this.numero = numero;
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
