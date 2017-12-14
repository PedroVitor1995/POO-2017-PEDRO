package model;

public class Quadrado extends FiguraGeometrica{

    public Quadrado(int lado) {
        super(lado);
    }

    @Override
    public double calcularArea() {
        return lado * lado;
    }

    @Override
    public double calcularPerimetro() {
        return lado * 4;
    }
}
