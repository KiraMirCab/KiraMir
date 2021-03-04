package com.mycompany.u5.e2.tecladoampliado;

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
        int result = -1;
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

    public int convierteEnteroABase() {
        while (true)
            try {
                System.out.println("Indica la base: 2, 8, 16");
                int radix = Integer.parseInt(sc.nextLine());
              
        switch (radix) {

            case 2:
                System.out.println("Escribe un nuero con base 2");
                break;
            case 8:
                System.out.println("Escribe un nuero con base 8");
                break;
            case 16:
                System.out.println("Escribe un nuero con base 16");
                break;
            default:
                System.out.println("Solo se puede usar el método con base 2, 8 o 16");

        }
        
            String input = sc.nextLine();
            int result = Integer.parseInt(input, radix);
            return result;

        } catch (NumberFormatException ex) {
            System.out.println("Formato incorrecto");
        }
    }

}
