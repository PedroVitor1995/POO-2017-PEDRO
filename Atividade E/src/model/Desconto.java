package model;

public class Desconto {

    public double valorOriginal;
    public double desconto;

    public Desconto() {
    }
    public double calcularDesconto(){
        double valorCalculado = valorOriginal * (1-desconto/100);
        return  valorCalculado;
    }
}
