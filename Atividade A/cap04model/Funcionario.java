package cap04model;

public class Funcionario {

    public String nome;
    public String departamentoOndeTrabalha;
    public double salario;
    public Data dataEntrada;
    public String RG;

    public void recebeAumento(double aumento){
        salario += aumento;
    }
    public double calculaGanhoAnual(){
        double salarioTotal = salario * 12;
        return  salarioTotal;
    }
    public void mostra(){
        System.out.println("Nome :" + nome);
        System.out.println("Departamento onde trabalha :" + departamentoOndeTrabalha);
        System.out.println("Salario :" + salario);
        /*System.out.println("Dia :" + dataEntrada.dia);
        System.out.println("Mes :" + dataEntrada.mes);
        System.out.println("Ano :" + dataEntrada.ano);*/
        System.out.println("Data de entrada: "+dataEntrada.formatada());
        System.out.println("RG :" + RG);
    }
}
