package model;

public interface Conta1 {

    double getSaldo();
    boolean depositar(double valor);
    boolean sacar(double valor);
    void atualizar(double taxaSelic);

}
