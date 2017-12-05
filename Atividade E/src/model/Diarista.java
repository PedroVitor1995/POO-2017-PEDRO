package model;

public class Diarista extends Empregado {

    @Override
    public double calcSalario() {
        return calcSalario() / 30;
    }
}
