package model;

public class Horista extends Diarista{

    public Horista() {

    }

    @Override
    public double calcSalario() {
        return calcSalario() / 24;
    }
}
