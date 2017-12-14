package model;

public class Triangulo extends FiguraGeometrica{

    private int altura;

    public Triangulo(int lado,int altura){
        super(lado);
        this.altura = altura;
    }

    @Override
    public double calcularArea() {
        return lado * altura / 2;
    }

    @Override
    public double calcularPerimetro() {
        return 0;
    }
}
