package cap06model;

import cap06model.Funcionario;

/**
 * Created by aluno on 23/11/17.
 */
public class Empresa {

    private String nome;
    private String cnpj;
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
            status += empregados[i].getNome() + "\n";
            status += "Salario - "+empregados[i].getSalario() +"\n";
        }
        return  status;
    }
}
