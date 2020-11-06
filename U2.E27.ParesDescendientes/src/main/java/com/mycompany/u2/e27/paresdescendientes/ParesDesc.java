package com.mycompany.u2.e27.paresdescendientes;

import java.util.Scanner;

public class ParesDesc {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num;

        do {
            System.out.println("Escribe un numero entero entre 0 y 100");
            num = sc.nextInt();
            if (num < 0 || num > 100) {
                System.out.println("Numero incorrecto");
            }
        } while (num < 0 || num > 100);

        while (num >= 0) {
            if (num % 2 == 0) {
                System.out.println(num);
            }
            num--;
        }

    }
}
