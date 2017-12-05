package app;

import model.DecimalNumber;

public class TestaDecimalNumber {

    public static void main(String[] args) {

        DecimalNumber decimalNumber = new DecimalNumber(120.79);

        System.out.println(decimalNumber.obterParteInteira());
        System.out.println(decimalNumber.obterParteDecimal());
    }
}
