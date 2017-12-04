package app;

import model.Jogador;

public class TestaJogador {

    public static void main(String[] args) {

        Jogador jogador1 = new Jogador(100,1,1000);
        System.out.println(jogador1.obterPontos());
        jogador1.calcularPontosRelativos();
        System.out.println(jogador1.obterPontos());
        Jogador jogador2 = new Jogador(90,2,8000);
        System.out.println(jogador2.obterPontos());
        jogador2.calcularPontosRelativos();
        System.out.println(jogador2.obterPontos());
        jogador1.atacar(jogador2);

        System.out.println(jogador1.obterPontos());
        System.out.println(jogador2.obterPontos());
    }
}
