package model;

/**
 * Created by aluno on 30/11/17.
 */
public class Bovino extends Animal {

    float producaLeite;

    public Bovino(String especie,float producaLeite) {
        super(especie);
        this.producaLeite = producaLeite;
    }

    public float getProducaLeite() {
        return producaLeite;
    }

    public void setProducaLeite(float producaLeite) {
        this.producaLeite = producaLeite;
    }
}
