package model;

public class Conta {

    protected double saldo;

    public void deposita(double valor){
        if(valor < 0){
            //throw new IllegalArgumentException();
            //throw new IllegalArgumentException("Você tentou depositar um valor negativo");
            throw new ValorInvalidoException(valor);
        }else{
            //this.saldo += valor;
            this.saldo += valor - 0.10;

        }
    }
}
