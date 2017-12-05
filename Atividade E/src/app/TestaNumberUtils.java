package app;

import model.NumberUtils;

public class TestaNumberUtils {

    public static void main(String[] args) {

        NumberUtils numberUtils = new NumberUtils(5);

        System.out.println(numberUtils.isPair());
        System.out.println(numberUtils.isOdd());
        System.out.println(numberUtils.printCount());
        System.out.println(numberUtils.printReverseCount());
        System.out.println(numberUtils.isPrime());
    }
}
