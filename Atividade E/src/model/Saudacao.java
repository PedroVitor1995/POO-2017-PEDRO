package model;

public class Saudacao {

    public String texto;
    public String destinatario;

    public Saudacao() {
    }

    public String obterSaudacao(){
        return texto + ","+ destinatario;
    }
}
