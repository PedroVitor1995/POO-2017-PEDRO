package model;

public class GerenciadorDeImpostoDeRenda {

    private double total;

    public String adicionar(Tributavel t){
        this.total += t.calculaTributos();
        return "Adicionando tributavel: "+t;
    }

    public double getTotal() {
        return this.total;
    }
}
