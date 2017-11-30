package cap04app;

import cap04model.Conta;

public class TestaAlgunsMetodos {

    public static void main(String[] args){

        Conta minhaConta;
        minhaConta = new Conta();

        minhaConta.dono = "Duke";
        minhaConta.saldo = 1000.0;

        System.out.println("Saldo atual: " + minhaConta.saldo);

        minhaConta.saca(200);

        System.out.println("Saldo atual: " + minhaConta.saldo);

        minhaConta.deposita(500);

        System.out.println("Saldo atual: " + minhaConta.saldo);
    }
}
