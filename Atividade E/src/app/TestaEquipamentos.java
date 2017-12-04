package app;

import model.Equipamento;

public class TestaEquipamentos {

    public static void main(String[] args) {

        Equipamento equipamento = new Equipamento();
        equipamento.ligado = true;
        Equipamento equipamento1 = new Equipamento();
        equipamento1.ligado = false;
        System.out.println(equipamento.estaLigado());
        System.out.println(equipamento1.estaLigado());
        equipamento.inverte();
        equipamento1.inverte();
        System.out.println(equipamento.estaLigado());
        System.out.println(equipamento1.estaLigado());
    }
}
