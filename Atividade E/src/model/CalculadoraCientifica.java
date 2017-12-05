package model;

public class CalculadoraCientifica extends Calculadora {

    public CalculadoraCientifica(int numero1, int numero2) {
        super(numero1, numero2);
    }
    public double exponeciar(int numero1, int numero2){
        return Math.pow(numero1,numero2);
    }
}
