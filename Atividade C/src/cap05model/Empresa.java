package cap05model;

/**
 * Created by aluno on 23/11/17.
 */
public class Empresa {

    String nome;
    String cnpj;
    public Funcionario[] empregados;
    int cont = 0;

    public void adiciona(Funcionario f) {
        this.empregados[cont] = f;
        cont++;
    }

    public int qtdFuncionarios() {
        return cont;
    }
    public String obterFuncionarios() {
        String status = "Funcionarios\n";
        for (int i = 0; i < qtdFuncionarios(); i++) {
            status += "Funcionario na posicao - " +i+"\n";
            status += empregados[i].nome + "\n";
            status += "Salario - "+empregados[i].salario +"\n";
        }
        return  status;
    }
}
