package Questao02App;

import Questao02Model.Circulo;
import Questao02Model.Ponto;

import javax.swing.*;

public class TestaCirculo {

    public static void main(String [] args){

        Ponto p1 = new Ponto(3,1);
        Circulo c1 = new Circulo(1,p1);
        Ponto p2 = new Ponto(2,4);

        JOptionPane.showMessageDialog(null,c1.obterAreaCirculo());
        c1.movimentarCirculo(1,2);
        c1.aumetarRaio(2);
        JOptionPane.showMessageDialog(null,c1.obterAreaCirculo());
        c1.diminuirRaio(1);
        JOptionPane.showMessageDialog(null,c1.obterAreaCirculo());

    }
}
