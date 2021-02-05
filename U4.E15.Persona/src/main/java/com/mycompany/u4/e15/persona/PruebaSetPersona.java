package com.mycompany.u4.e15.persona;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class PruebaSetPersona {
    public static void main(String[] args) {
        Persona p1 = new Persona("Y4133131E", "Kira", "Mironova", "694-654-345", "Calle blublu", 30, true, false);
        Persona p2 = new Persona("23654878J", "Alma", "Garcia de la Obra", "694-654-345", "Calle blublu", 31, false, false);
        Persona p3 = new Persona("Y4133131E", "Luis Ignacio", "Martinez", "694-654-345", "Calle blublu", 21, false, false);
        
        System.out.println("El codigo hash de p1 es " +p1.hashCode());
        System.out.println("El codigo hash de p2 es " +p2.hashCode());
        System.out.println("El codigo hash de p3 es " +p3.hashCode());
        
        Set personas = new HashSet();
        personas.add(p1);
        personas.add(p2);
        personas.add(p3);
        
        Iterator iter = personas.iterator();
        
        while (iter.hasNext())
            System.out.println(iter.next());
        
    }
}
