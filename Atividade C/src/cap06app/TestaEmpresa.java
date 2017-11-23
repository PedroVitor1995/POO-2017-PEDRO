package cap06app;

import cap06model.Empresa;
import cap06model.Funcionario;

/**
 * Created by aluno on 23/11/17.
 */
public class TestaEmpresa {

    public static void main(String[] args) {

        Empresa empresa = new Empresa();
        empresa.empregados = new Funcionario[10];

        Funcionario f = new Funcionario();
        for (int i=0; i<5; i++){
            f.setNome("Funcionario_"+i);
            f.setSalario(1000 + i * 100);
            empresa.adiciona(f);
        }

        System.out.println(empresa.obterFuncionarios());

    }
}
