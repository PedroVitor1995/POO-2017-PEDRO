package cap06model;

/**
 * Created by aluno on 23/11/17.
 */
public class Funcionario {

    private String nome;
    private double salario;

    public Funcionario() {

    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public double getSalario() {
        return salario;
    }

    public void setSalario(double salario) {
        this.salario = salario;
    }

    public void recebeAumento(double aumento){
        salario += aumento;
    }
    public double calculaGanhoAnual(){
        double valorTotal;
        valorTotal = this.salario * 12;
        return  valorTotal;
    }
}
