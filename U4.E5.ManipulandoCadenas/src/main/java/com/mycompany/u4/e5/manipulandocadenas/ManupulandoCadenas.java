package com.mycompany.u4.e5.manipulandocadenas;

import java.util.*;

public class ManupulandoCadenas {

    public static void main(String[] args) {
        List cadenas = new ArrayList();
        cadenas.add("Vertical");
        cadenas.add("Horizontal");
        cadenas.add("Izquierda");
        cadenas.add("Derecha");
        cadenas.add("Adelante");
        cadenas.add("Atras");
        cadenas.add("Curvo");
        cadenas.add("Recto");
        cadenas.add("Arriba");
        cadenas.add("Abajo");

        System.out.println("Todo en mayúsculas:");
        Iterator iter = cadenas.iterator();
        while (iter.hasNext()) {
            String elem = (String) iter.next();
            System.out.println(elem.toUpperCase());
        }

        System.out.println("-----------------------");
        System.out.println("Ordenado alfabéticamente:");

        Collections.sort(cadenas);
        iter = cadenas.iterator();
        while (iter.hasNext()) {
            String elem = (String) iter.next();
            System.out.println(elem);
        }

        System.out.println("-----------------------");
        System.out.println("Empieza por la A:");

        iter = cadenas.iterator();
        while (iter.hasNext()) {
            String elem = (String) iter.next();
            if (elem.startsWith("A")) {
                System.out.println(elem);
            }
        }

        System.out.println("-----------------------");
        System.out.println("Termina con la o:");

        iter = cadenas.iterator();
        while (iter.hasNext()) {
            String elem = (String) iter.next();
            if (elem.endsWith("o")) {
                System.out.println(elem);
            }
        }

        System.out.println("-----------------------");
        System.out.println("Contiene la e:");

        iter = cadenas.iterator();
        while (iter.hasNext()) {
            String elem = (String) iter.next();
            if (elem.contains("e")) {
                System.out.println(elem);
            }
        }

        System.out.println("-----------------------");
        System.out.println("Tiene 5 letras:");

        iter = cadenas.iterator();
        while (iter.hasNext()) {
            String elem = (String) iter.next();
            if (elem.length() == 5) {
                System.out.println(elem);
            }
        }
        System.out.println("-----------------------");
        System.out.println("Tiene más de 5 letras y que empiecen por A");

        iter = cadenas.iterator();
        while (iter.hasNext()) {
            String elem = (String) iter.next();
            if (elem.length() > 5 && elem.startsWith("A")) {
                System.out.println(elem);
            }
        }

    }

}
