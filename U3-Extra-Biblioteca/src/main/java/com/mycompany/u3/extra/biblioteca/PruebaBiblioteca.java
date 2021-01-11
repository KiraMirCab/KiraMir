package com.mycompany.u3.extra.biblioteca;

public class PruebaBiblioteca {
    public static void main(String[] args) {
        Socio s1 = new Socio("Antonio", 123589);
        Libro l1 = new Libro("Quijote", "novela española");
        
        l1.prestar(s1);
        l1.proroga();
        l1.proroga();
        l1.proroga();
        l1.proroga();
        l1.devolver(70);
        
        DVD d1 = new DVD("Cictzen Kane", "cine americano");
        
        d1.prestar(s1);
        d1.devolver(8);
        
        CD c1 = new CD ("Black Holes and Revelations: MUSE", "rock británico");
        
        c1.prestar(s1);
        c1.devolver(3);
    }
}
