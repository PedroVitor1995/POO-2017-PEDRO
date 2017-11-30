package cap04model;

public class Conta {

    public int numero;
    public String dono;
    public double saldo;
    public double limite;

    public void saca(double quantidade){
        double novoSaldo = this.saldo - quantidade;
        this.saldo = novoSaldo;
    }
    /*boolean saca(double valor){
        if(this.saldo < valor){
            return false;
        }else{
            this.saldo = this.saldo - valor;
            return true;
        }
    }*/
    public void deposita(double quantidade){
        this.saldo += quantidade;
    }
    void tranfere(Conta destino,double valor){
        this.saldo -= valor;
        destino.saldo += valor;
    }
}
