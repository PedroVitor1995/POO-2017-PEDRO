package model;

public class ImpostoDeRenda {

    private float rendaBruta;

    public ImpostoDeRenda(float rendaBruta) {
        this.rendaBruta = rendaBruta;
    }

    public float calcularImposto(){
        float imposto;
        if(rendaBruta >=0 && rendaBruta <= 1000){
            imposto = (rendaBruta * 5) / 100;
        }else{
            imposto = (rendaBruta * 10) / 100;
        }
        return imposto;
    }
    public float calculaRendaLiquida(){
        return rendaBruta - calcularImposto();
    }
}
