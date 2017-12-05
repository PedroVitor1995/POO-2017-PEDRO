package model;

public class Jogador {

    private double forca;
    private int nivel;
    private double pontosAtuais;
    private int vidas;

    public Jogador(double forca,int nivel,double pontosAtuais) {
        this.forca = forca;
        this.nivel = nivel;
        this.pontosAtuais = pontosAtuais;
        this.vidas = 5;
    }

    public int getVidas() {
        return vidas;
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
    public boolean isLimiteMaxVidas(){
        if(vidas == 5){
            return true;
        }
        return false;
    }
    public boolean isLimiteMinVidas (){
        if(vidas == 0){
            return true;
        }
        return false;
    }
    public void aumentarVidas(){
        if(isLimiteMaxVidas() == false){
            this.vidas++;
        }
    }
    public void diminuirVidas(){
        if(isLimiteMinVidas() == false){
            this.vidas--;
        }
    }
    public void doarVida(Jogador jogador){
        if (jogador.isLimiteMinVidas() == false){
            jogador.diminuirVidas();
            aumentarVidas();
        }
    }
}
