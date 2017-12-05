package model;

public class Senha {

    private String valor;

    public Senha(String valor) {
        this.valor = valor;
    }
    public boolean isIgual(String valor){
        if(this.valor.equals(valor)){
            return true;
        }
        return false;
    }
    public boolean isIgualTrim(String valor){
        if(this.valor.equals(valor.trim())){
            return true;
        }
        return false;
    }
    public boolean tamanhoSeguro(){
        if(this.valor.length() >= 6){
            return true;
        }
        return false;
    }
}
