package Questao02Model;

public class Circulo {

    double raio;
    double pi = 3.14;
    Ponto Centro;

    public Circulo(double raio,Ponto ponto){
        if(raio <= 0){
            this.raio = 1;
        }else{
            this.raio = raio;
        }
        this.Centro = ponto;
    }
    public double obterCircuferencia(){
        double C = 2 * pi * raio;
        return C;
    }
    public double obterAreaCirculo(){
        double A = pi * raio * raio;
        return  A;
    }
    public void movimentarCirculo(int x,int y){
        Centro.X = x;
        Centro.Y = y;
    }
    public void aumetarRaio(double valor){
        raio += valor;
    }
    public void diminuirRaio(double valor){
        raio -= valor;
    }
}
