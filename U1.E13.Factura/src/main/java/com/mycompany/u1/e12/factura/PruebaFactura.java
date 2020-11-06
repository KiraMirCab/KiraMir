package com.mycompany.u1.e12.factura;

import java.util.Scanner;

public class PruebaFactura {

    public static void main(String[] args) {

        final double IVA = 21;
        double precio;
        int numPen;

        Scanner sc = new Scanner(System.in);

        System.out.println("Dime el precio de un pen-drive");
        precio = sc.nextDouble();

        System.out.println("Dime el número de pen-drives que\n"
                + "quieres comprar");
        numPen = sc.nextInt();

        System.out.println("FACTURA JAMAZON");
        System.out.println("Precio unitario: " + precio + " €");
        System.out.println("Número artículos: " + numPen);

        double subtotal = precio * numPen;
        System.out.println("Subtotal: " + subtotal + " €");
        System.out.println("--------------------------");
        System.out.println("Total (IVA incluido): " + subtotal * (IVA / 100 + 1) + " €");
    }
}
