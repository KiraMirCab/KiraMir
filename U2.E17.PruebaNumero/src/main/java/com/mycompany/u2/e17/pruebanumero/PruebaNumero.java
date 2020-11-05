package com.mycompany.u2.e17.pruebanumero;

import java.util.Scanner;

public class PruebaNumero {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Dime el primer número entero:");
        int num1 = sc.nextInt();
        System.out.println("Dime el segundo número entero:");
        int num2 = sc.nextInt();
        System.out.println("Dime el operador a aplicar( suma ‘+’, resta ‘-‘, multiplicación ‘*’ y división ‘/’):");
        String saltoDeLinea = sc.nextLine();//limpia el buffer
        String operador = sc.nextLine();
        switch (operador) {
            case "+":
                System.out.println("El resultado de " + num1 + operador + num2 + " es " + (num1 + num2));
                break;
            case "-":
                System.out.println("El resultado de " + num1 + operador + num2 + " es " + (num1 - num2));
                break;
            case "*":
                System.out.println("El resultado de " + num1 + operador + num2 + " es " + (num1 * num2));
                break;
            case "/":
                System.out.println("El resultado de " + num1 + operador + num2 + " es " + (num1 / num2));
                //La división será entera, ya que los dos números son enteros
                break;
            default:
                System.out.println("Operador no válido");
                break;
        }

    }
}
