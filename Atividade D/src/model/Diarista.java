package model;

/**
 * Created by aluno on 30/11/17.
 */
public class Diarista extends Empregado {

    @Override
    public double calcSalario() {
        return calcSalario() / 30;
    }
}
