package model;

public class Triangulo {

    private int lado1,lado2,lado3;

    public Triangulo(int lado1,int lado2,int lado3) {
        this.lado1 = lado1;
        this.lado2 = lado2;
        this.lado3 = lado3;
    }
    public boolean ehRetangulo(){
        if((lado2 - lado3) < lado1 && lado1 < (lado2 + lado2)){
            return true;
        }
        return false;
    }
}
