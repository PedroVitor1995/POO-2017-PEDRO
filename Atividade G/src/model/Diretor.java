package model;

public class Diretor extends Funcionario{

    @Override
    double getBonificacao() {
        return salario * 0.15;
    }
}
