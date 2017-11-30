package model;

public class Banco {

    private String nome;
    public Conta[] contas;
    private static int cont = 0;

    public Banco(String nome){
        this.nome = nome;
    }

    public String getNome() {
        return nome;
    }

    public void adicionarContas(Conta c){
        contas[cont] = c;
        cont +=1;
    }
    public Conta pegaConta(int x){
        return contas[x];
    }
    public int pegaTotalDeContas(){
        return cont;
    }
    public String obterTotalDeContas(){
        return "Total de contas: "+pegaTotalDeContas();
    }
}
