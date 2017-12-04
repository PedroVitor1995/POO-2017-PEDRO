package model;

public class Produto {

    public int codigo;
    public String descricao;
    public double valor;
    public int quantidade;
    public int quantidadeMinima;

    public Produto(int codigo,String descricao,double valor,int quantidade) {
        this.codigo = codigo;
        this.descricao = descricao;
        this.valor = valor;
        this.quantidade = quantidade;
    }
    public void baixar(){
        quantidade--;
    }
    public void repor(){
        quantidade++;
    }
    public void baixar(int quantidadeMinima){
        if(quantidade >= quantidadeMinima){
            quantidade--;
        }
    }
    public void reajusta(double taxa){
        valor += ((valor*taxa)/100);
    }

    @Override
    public String toString() {
        return "Produto{" +
                "codigo=" + codigo +
                ", descricao='" + descricao + '\'' +
                ", valor=" + valor +
                ", quantidade=" + quantidade +
                '}';
    }
}
