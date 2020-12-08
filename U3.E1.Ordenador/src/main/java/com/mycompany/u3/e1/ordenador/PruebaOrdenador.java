package com.mycompany.u3.e1.ordenador;

public class PruebaOrdenador {
    public static void main(String[] args) {
        Ordenador o1 = new Ordenador();
        Ordenador o2 = new Ordenador("Samsung", "E25");
        Ordenador o3 = new Ordenador("Asus", "Jo5674", 1999);
        
        o1.imprimeEstado();
        o2.imprimeEstado();
        o3.imprimeEstado();
    }
}
