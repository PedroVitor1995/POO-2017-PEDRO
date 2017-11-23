package cap05app;

import cap05model.Empresa;
import cap05model.Funcionario;

/**
 * Created by aluno on 23/11/17.
 */
public class TestaEmpresa {

    public static void main(String[] args) {

        Empresa empresa = new Empresa();
        empresa.empregados = new Funcionario[10];

        Funcionario f = new Funcionario();
        for (int i=0; i<5; i++){
            f.nome = "Funcionario_"+i;
            f.salario = 1000 + i * 100;
            empresa.adiciona(f);
        }
        Funcionario f1 = new Funcionario();
        f1.nome = "Funcionario_1";
        f1.salario = 100;
        System.out.println(empresa.obterFuncionarios());

    }
}
