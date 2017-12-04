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
    public double calcularPontosRelativos(){
        return forca * nivel;
    }
}
