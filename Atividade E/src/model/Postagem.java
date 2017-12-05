package model;

public class Postagem {

    private int id;
    private String texto;
    private int qtdCurtidas;

    public Postagem(int id,String texto) {
        this.id = id;
        this.texto = texto;
        this.qtdCurtidas = 0;
    }

    public void curtir(){
        qtdCurtidas++;
    }

    @Override
    public String toString() {
        return "Postagem{" +
                "id=" + id +
                ", texto='" + texto + '\'' +
                ", qtdCurtidas=" + qtdCurtidas +
                '}';
    }
}
