package app;

import model.Animal;
import model.Peixe;

/**
 * Created by aluno on 30/11/17.
 */
public class TestaAnimal {

    public static void main(String[] args) {

        Animal a1 = new Peixe("Piranha",7);

        System.out.println(a1.getEspecie());
    }
}
