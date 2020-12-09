package com.mycompany.u2.e31.candadonumerico;

import java.util.Scanner;

public class PruebaCandado {

    public static void main(String[] args) {
        Candado can = new Candado();
        Scanner sc = new Scanner(System.in);

        System.out.println("Ecriba una numero entero entre 0 y 9999 para establecer el numero secreto");
        can.setNumSecreto(sc.nextInt());

        while (can.numSecreto < 0 || can.numSecreto > 9999) {
            System.out.println("Numero incorrecto");
            System.out.println("Ecriba una numero entero entre 0 y 9999");
            can.setNumSecreto(sc.nextInt());
        }

        int num = 1;
        while (!can.intentaAbrir(num)) {
            System.out.println("Probando con el numero " + num + ": no se abre");
            num++;
        }
        System.out.println("Probando con el numero " + num + ": SE ABRIO");
    }

}
