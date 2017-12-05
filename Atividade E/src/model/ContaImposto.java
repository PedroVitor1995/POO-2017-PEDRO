package model;

public class ContaImposto {

    private double saldo;
    private int numero;

    public ContaImposto(double saldo,int numero) {
        this.saldo = saldo;
        this.numero = numero;
    }

    public double getSaldo() {
        return saldo;
    }
}
