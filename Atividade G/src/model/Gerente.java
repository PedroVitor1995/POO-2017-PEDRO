package model;

public class Gerente extends Funcionario{

    @Override
    double getBonificacao() {
        return this.salario * 0.10 ;
    }
}
