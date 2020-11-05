package com.mycompany.u1.e11.pruebascanner;

import java.util.Scanner;

public class PruebaScanner {

    public static void main(String[] args) {

        Scanner Scanner = new Scanner(System.in);
        String nombre, prApellido;
        int numero, numero2;

        System.out.println("Díme tu nombre: ");
        nombre = Scanner.nextLine();

        System.out.println("Díme tu primer apellido: ");
        prApellido = Scanner.nextLine();

        System.out.println("Dime un número entero: ");
        numero = Scanner.nextInt();

        System.out.println("Dime otro número entero: ");
        numero2 = Scanner.nextInt();

        System.out.println("Tu nombre y apellido es " + nombre + " " + prApellido);

        System.out.println("Los números leídos son " + numero + " y " + 
                            numero2 + ". Su suma es " + (numero + numero2) + 
                            " y su producto es " + (numero * numero2));

    }
}
