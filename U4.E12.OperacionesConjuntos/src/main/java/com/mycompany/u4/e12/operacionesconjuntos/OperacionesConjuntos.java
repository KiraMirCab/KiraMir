package com.mycompany.u4.e12.operacionesconjuntos;

import java.util.*;

public class OperacionesConjuntos {

    public static void main(String[] args) {
        Set buscaPolicia = new HashSet();
        buscaPolicia.add("12345678A");
        buscaPolicia.add("12345678B");
        buscaPolicia.add("12345678C");
        buscaPolicia.add("12345678D");

        Set buscaGuardia = new HashSet();
        buscaGuardia.add("12345678E");
        buscaGuardia.add("12345678F");
        buscaGuardia.add("12345678G");
        buscaGuardia.add("12345678D");

        System.out.println("Todos los dnis buscados por la Policía o por la Guardia Civil: ");
        Set buscadosPoG = new HashSet(buscaPolicia);
        buscadosPoG.addAll(buscaGuardia);
        System.out.println(buscadosPoG);

        System.out.println("Todos los dnis buscados por la Policía y por la Guardia Civil: ");
        Set buscadosPyG = new HashSet(buscaPolicia);
        buscadosPyG.retainAll(buscaGuardia);
        System.out.println(buscadosPyG);

        System.out.println("Todos los dnis buscados por la Policía, pero no por la Guardia Civil: ");
        Set buscadosPnoG = new HashSet(buscaPolicia);
        buscadosPnoG.removeAll(buscaGuardia);
        System.out.println(buscadosPnoG);

        System.out.println("Todos los dnis buscados por la Guardia Civil, pero no por la Policía");
        Set buscadosGnoP = new HashSet(buscaGuardia);
        buscadosGnoP.removeAll(buscaPolicia);
        System.out.println(buscadosGnoP);

    }
}
