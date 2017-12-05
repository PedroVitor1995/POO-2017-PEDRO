package model;

public class Hora {

    private int hora,minutos,segundos;

    public Hora(int hora, int minutos, int segundos) {
        this.hora = hora;
        this.minutos = minutos;
        this.segundos = segundos;

    }

    public int getHora() {
        return hora;
    }

    public int getMinutos() {
        return minutos;
    }

    public int getSegundos() {
        return segundos;
    }
    public String imprimirHora(){
        return getHora()+":"+getMinutos()+":"+getSegundos();
    }
}
