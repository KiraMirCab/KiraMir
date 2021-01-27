package com.mycompany.u4.e11.pruebaconjuntos;

import java.util.*;

public class PruebaConjuntos {

    public static void main(String[] args) {
        Set candidatos = new HashSet();
        candidatos.add("Juan");
        candidatos.add("Ana");
        candidatos.add("Pedro");
        candidatos.add("Rosa");
        candidatos.add("María");

        System.out.println("Está vacío: " + candidatos.isEmpty());
        System.out.println("Número de elementos en el conjunto: " + candidatos.size());
        System.out.println("Está Pedro? " + candidatos.contains("Pedro"));

        System.out.println("Ahora imprimimos todos los elementos de la lista con un iterador:");
        Iterator iter = candidatos.iterator();
        while (iter.hasNext()) {
            System.out.println(iter.next());
        }

        Set seleccionados = new HashSet();
        iter = candidatos.iterator();
        while (iter.hasNext()) {
            String elem = (String) iter.next();
            if (elem.contains("a")) {
                seleccionados.add(elem);
            }
        }
        
        System.out.println("Ahora imprimimos todos los elementos de la lista 'seleccionados' con la letra a");
        iter = seleccionados.iterator();
        while (iter.hasNext()) {
            System.out.println(iter.next());
        }
    }
}
