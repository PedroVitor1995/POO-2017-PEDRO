package app;

import model.Saudacao;

public class TestaSaudacao {

    public static void main(String[] args) {


        Saudacao saudacao = new Saudacao();
        saudacao.texto = "Bom dia";
        saudacao.destinatario = "João";

        System.out.println(saudacao.obterSaudacao());
    }
}
