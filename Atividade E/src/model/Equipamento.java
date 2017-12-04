package model;

public class Equipamento {

    public boolean ligado;

    public Equipamento() {
    }
    public boolean ligar(){
        return true;
    }
    public boolean desligar(){
        return false;
    }
    public void inverte(){
        if(ligado = true){
            desligar();
        }else{
            ligar();
        }
    }
    public boolean estaLigado(){
        return ligado;
    }
}
