package com.mycompany.u4.e7.persona;
import java.util.*;

public class PruebaPersona {
    public static void main(String[] args) {
        List lista = new ArrayList();
        lista.add(new Persona("Juan","24568308E",32));
        lista.add(new Persona("Rosa","2837464J",18));
        lista.add(new Persona("Pepito","93829368J",80));
        lista.add(new Persona("Lester","230958H",61));
        
        System.out.println(lista);
        
        Collections.sort(lista);
        System.out.println(lista);
    }
}
