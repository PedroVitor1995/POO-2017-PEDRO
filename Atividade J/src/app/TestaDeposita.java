package app;

import model.Conta;
import model.ContaPoupanca;
import model.ValorInvalidoException;

public class TestaDeposita {

    public static void main(String[] args) {

        Conta cp = new ContaPoupanca();
        try {
            cp.deposita(-100);
        }catch (ValorInvalidoException e){
            //System.out.println("Você tentou depositar um valor inválido");
            System.out.println(e.getMessage());
        }
    }
}
