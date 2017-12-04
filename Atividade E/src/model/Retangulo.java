package model;

public class Retangulo {

    public double l1;
    public double l2;

    public Retangulo() {

    }
    public double calcularArea(){
        return l1*l1;
    }
    public double calcularPerimetro(){
        return (l1*l2) / 2;
    }
}
