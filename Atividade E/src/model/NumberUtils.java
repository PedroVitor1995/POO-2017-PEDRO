package model;

public class NumberUtils {

    public int numero;

    public NumberUtils(int numero) {
        this.numero = numero;
    }
    public boolean isPair(){
        if(numero % 2 == 0){
            return true;
        }
        return false;
    }
    public boolean isOdd(){
       if(numero % 2 != 0){
           return false;
       }
       return true;
    }
    public boolean isPrime(){
        int divisores = 0;
        for (int i=1; i<=numero; i++){
            if(numero % i == 0){
                divisores += 1;
            }
        }
        if(divisores == 2){
            return true;
        }
        return false;
    }
    public String printCount(){
        String numeros = " ";
        for (int i=0; i<=numero; i++){
            numeros += i+" ";
        }
        return numeros;
    }
    public String printReverseCount(){
        String numeros = " ";
        for (int i=numero; i>=0; i--){
            numeros += i+" ";
        }
        return numeros;
    }

}
