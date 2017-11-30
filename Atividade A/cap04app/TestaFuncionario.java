package cap04app;

import cap04model.Data;
import cap04model.Funcionario;

public class TestaFuncionario {

    public static void main(String [] args){

        Funcionario f1 = new Funcionario();
        f1.nome = "Pedro";
        f1.salario = 1000;
        f1.recebeAumento(100);

        Data data = new Data();
        data.dia = 2;
        data.mes = 12;
        data.ano = 1995;

        f1.dataEntrada = data;

        Funcionario f2 = new Funcionario();
        f2.nome = "Pedro";
        f2.salario = 1000;
        f2.recebeAumento(100);

        Funcionario f3 = new Funcionario();
        f3 = f2;

        System.out.println("salario atual:" + f1.salario);
        System.out.println("ganho anual:" + f1.calculaGanhoAnual());

        f1.mostra();

        if(f1 == f2){
            System.out.println("iguais");
        }else{
            System.out.println("diferentes");
        }

        if(f2 == f3){
            System.out.println("iguais");
        }else{
            System.out.println("diferentes");
        }

    }
}
