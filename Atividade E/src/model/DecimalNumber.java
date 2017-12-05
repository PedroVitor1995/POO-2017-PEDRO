package model;

public class DecimalNumber {

    public double numero;

    public DecimalNumber(double numero) {
        this.numero = numero;
    }
    public int obterParteInteira(){
        return (int) numero;
    }
    public double obterParteDecimal(){
        return numero - (int)numero;
    }
}
