package app;

import model.Senha;

public class TestaSenha {

    public static void main(String[] args) {

        Senha senha = new Senha("67yu56t");
        System.out.println(senha.isIgual("67yu56t"));
        System.out.println(senha.isIgualTrim("67yu56t "));
        System.out.println(senha.tamanhoSeguro());
    }
}
