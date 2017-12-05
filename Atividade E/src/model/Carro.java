package model;

public class Carro {

    private String placa;
    private long chassi;
    private String modelo;
    private String ano;

    public Carro(String placa,long chassi,String modelo,String ano) {
        this.placa = placa;
        this.chassi = chassi;
        this.modelo = modelo;
        this.ano = ano;
    }
    public boolean clonado(Carro c) {
        if(this.chassi == c.chassi){
            return true;
        }
        return false;
    }
}
