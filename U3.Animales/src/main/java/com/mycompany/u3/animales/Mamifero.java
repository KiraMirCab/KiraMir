package com.mycompany.u3.animales;

public class Mamifero {

    protected double peso;
    protected String alimentacion;

    public void nace() {
        System.out.println("Mira como nazco.");
    }

    public void crece() {
        System.out.println("Mira como crezco.");
    }

    public void reproduce(Mamifero m) {
        System.out.println("Mira como me reproduzco con otro mamifero.");
    }

    public void muere() {
        System.out.println("Mira, estoy muriendo!!!!");
    }

}
