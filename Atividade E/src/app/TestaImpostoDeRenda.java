package app;

import model.ImpostoDeRenda;

public class TestaImpostoDeRenda {

    public static void main(String[] args) {

        ImpostoDeRenda imp1 = new ImpostoDeRenda(2000);
        System.out.println(imp1.calcularImposto());
        System.out.println(imp1.calculaRendaLiquida());
    }
}
