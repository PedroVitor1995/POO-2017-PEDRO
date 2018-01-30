package model;

public class ContaPoupanca  extends Conta implements Comparable<ContaPoupanca>{
    @Override
    public void atualizar(double taxa) {

    }

    @Override
    public int compareTo(ContaPoupanca o) {
        if(this.getNumero() < o.getNumero()){
            return -1;
        }
        if(this.getNumero() > o.getNumero()){
            return 1;
        }
        return 0;
    }
}
