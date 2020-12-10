package com.mycompany.u3.extra;

public class PruebaConjuntoPersona {
    public static void main(String[] args) {
        Persona p1 = new Persona("Javi", "El furioso");
        Persona p2 = new Persona("Kike", "El bueno", 40);
        Persona p3 = new Persona ("David", "El colega", 28);
        
        ConjuntoPersona cp = new ConjuntoPersona(6);
        cp.agrega(p1);
        cp.agrega(p2);
        cp.agrega(p3);
        cp.agrega(p3);
        Persona p4 = new Persona ("David", "El colega", 21);
        cp.agrega(p4);
        System.out.println(cp);
    }
}
