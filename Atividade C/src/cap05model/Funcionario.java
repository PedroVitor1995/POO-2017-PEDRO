package cap05model;

/**
 * Created by aluno on 23/11/17.
 */
public class Funcionario {

    public String nome;
    public double salario;

    public void recebeAumento(double aumento){
        salario += aumento;
    }
    public double calculaGanhoAnual(){
        double valorTotal;
        valorTotal = this.salario * 12;
        return  valorTotal;
    }
}
