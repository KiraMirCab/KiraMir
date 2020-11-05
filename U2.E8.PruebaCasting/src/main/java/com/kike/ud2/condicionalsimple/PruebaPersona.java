package com.kike.ud2.condicionalsimple;

import java.util.Scanner;

public class PruebaPersona {

    public static void main(String[] args) {
        Persona p = new Persona();
        Scanner sc = new Scanner(System.in);

        System.out.println("Introduce la altura: ");
        p.setAltura(sc.nextInt());

        System.out.println("Introduce la edad: ");
        p.setEdad(sc.nextInt());

        p.setEstaCasado(false);

        if (p.getEdad() >= 18 && p.getEdad() <= 30 && p.isEstaCasado() == false
                || p.getEdad() > 30 && p.getEdad() < 40 && p.isEstaCasado() == false && p.getAltura() > 190
                || p.getEdad() >= 40 && p.isEstaCasado() == true) {
            System.out.println("Has conseguido el papel");
        }
    }
}
