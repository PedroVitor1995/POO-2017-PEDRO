package app;

import model.ContaCorrente;
import model.GerenciadorDeImpostoDeRenda;
import model.SeguroDeVida;

public class TestaGerenciadorDeImpostoDeRenda {

    public static void main(String[] args) {

        GerenciadorDeImpostoDeRenda gerenciador = new GerenciadorDeImpostoDeRenda();
        SeguroDeVida sv = new SeguroDeVida(); gerenciador.adicionar(sv);
        ContaCorrente cc = new ContaCorrente(); cc.depositar(1000); gerenciador.adicionar(cc);
        System.out.println(gerenciador.getTotal());
    }
}
