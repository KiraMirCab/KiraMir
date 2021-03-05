package com.mycompany.u5.e1.teclado;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Teclado {

    private Scanner sc;

    public Teclado() {
        sc = new Scanner(System.in);
    }

    public int leeEntero() {
        while (true)
            try {
            int result = sc.nextInt();
            return result;

        } catch (InputMismatchException ex) {
            System.out.println("Sólo se admiten números enteros");
            sc.nextLine();
        }
    }

    public int leeEntero(int minimo, int maximo) {
        int result;
        do {
            System.out.println("Introduzca un número entero entre " + minimo + " y " + maximo);
            result = leeEntero();
        } while (result < minimo || result > maximo);
        return result;
    }

    public int leeEnteroMax(int maximo) {
        int result = Integer.MAX_VALUE;

        while (result > maximo) {
            System.out.println("Introduzca un número entero hasta " + maximo + " inclusive");
            result = leeEntero();
        }
        return result;
    }

    public int leeEnteroMin(int minimo) {
        int result = Integer.MIN_VALUE;

        while (result < minimo) {
            System.out.println("Introduzca un número entero igual o mayor que " + minimo);
            result = leeEntero();
        }
        return result;
    }
}
