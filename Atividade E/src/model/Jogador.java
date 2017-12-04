package model;

public class Jogador {

    public double forca;
    public int nivel;
    public double pontosAtuais;

    public Jogador(double forca,int nivel,double pontosAtuais) {
        this.forca = forca;
        this.nivel = nivel;
        this.pontosAtuais = pontosAtuais;
    }
    public void calcularPontosRelativos(){
        this.pontosAtuais += forca * nivel;
    }
    public void atacar(Jogador jogador){
        this.pontosAtuais -= jogador.pontosAtuais;
    }
    public double obterPontos(){
        return pontosAtuais;
    }
}
