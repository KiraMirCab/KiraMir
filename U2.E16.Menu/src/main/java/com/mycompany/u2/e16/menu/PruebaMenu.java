package com.mycompany.u2.e16.menu;

import java.util.Scanner;

public class PruebaMenu {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Escribe un numero");
        double num = sc.nextDouble();
        System.out.println("MENU DE POTENCIAS");
        System.out.println("1 – Calcular el cuadrado");
        System.out.println("2 – Calcular el cubo");
        System.out.println("3 – Calcular la raíz cuadrada");
        System.out.println("Escoja una opción:");
        int seleccion = sc.nextInt();

        switch (seleccion) {
            case 1:
                System.out.println(Math.pow(num, 2));
                break;
            case 2:
                System.out.println(Math.pow(num, 3));
                break;
            case 3:
                System.out.println(Math.pow(num, 0.5));
                break;
            default:
                System.out.println("Opción incorrecta");
        }
    }
}
