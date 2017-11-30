package model;

/**
 * Created by aluno on 30/11/17.
 */
public class Horista extends Diarista{

    public Horista() {

    }

    @Override
    public double calcSalario() {
        return calcSalario() / 24;
    }
}
