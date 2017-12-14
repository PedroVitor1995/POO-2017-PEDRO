package model;

public abstract class FiguraGeometrica {

    protected int lado;

    public FiguraGeometrica(int lado) {
        this.lado = lado;
    }

    public abstract double calcularArea();
    public abstract double calcularPerimetro();
}
