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
<<<<<<< HEAD
                || (p.getEdad() >= 40 || p.isEstaCasado() == true)) {
=======
                || p.getEdad() >= 40 && p.isEstaCasado() == true) {
>>>>>>> d96ea690ae0db09b32bba308280b8e55be171dd5
            System.out.println("Has conseguido el papel");
        }
    }
}
