package Questao03B;

public class ContaBancaria {
	
	int numero;
	double saldo;
	Titular titular;
	
	public ContaBancaria(int numero, double valor, Titular titular) {
		this.numero = numero;
		this.saldo = valor;
		this.titular = titular;
	}
	public double obterSaldo(double valor){
		return valor;
	}
	public boolean sacar(double valor){
		if(valor <= obterSaldo(valor)){
			saldo -= valor;
			return true;
		}
		return false;
	}
}
