package model;

/**
 * Created by aluno on 30/11/17.
 */
public class Peixe extends Animal {

    int profundidade;

    public Peixe(String especie, int profundidade) {
        super(especie);
        this.profundidade = profundidade;
    }

    public int getProfundidade() {
        return profundidade;
    }

    public void setProfundidade(int profundidade) {
        this.profundidade = profundidade;
    }
}
