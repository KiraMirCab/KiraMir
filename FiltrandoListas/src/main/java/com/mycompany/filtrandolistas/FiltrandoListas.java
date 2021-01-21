package com.mycompany.filtrandolistas;

import java.util.*;

public class FiltrandoListas {

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

        Collections.sort(cadenas);
        ImprimeLista(cadenas);

        System.out.println("-----------------");
        System.out.println("Quitamos las palabras que terminan en o:");
        Iterator iter = cadenas.iterator();
        while (iter.hasNext()) {
            String elem = (String) iter.next();
            if (elem.endsWith("o")) {
                iter.remove();
            }
        }
        
        ImprimeLista(cadenas);
        
        System.out.println("-----------------");
        System.out.println("Quitamos las palabras que contengan la t:");
        iter = cadenas.iterator();
        while (iter.hasNext()) {
            String elem = (String) iter.next();
            if (elem.contains("t")) {
                iter.remove();
            }
        }
        
        ImprimeLista(cadenas);
        
         System.out.println("-----------------");
        System.out.println("Quitamos las palabras que contengan la a y tengan mas de 5 letras:");
        iter = cadenas.iterator();
        while (iter.hasNext()) {
            String elem = (String) iter.next();
            if (elem.contains("a") && elem.length()>5) {
                iter.remove();
            }
        }
        
        ImprimeLista(cadenas);
    }

    private static void ImprimeLista(List cadenas) {
        Iterator iter = cadenas.iterator();
        while (iter.hasNext()) {
            System.out.println(iter.next().toString());
        }
    }

}
