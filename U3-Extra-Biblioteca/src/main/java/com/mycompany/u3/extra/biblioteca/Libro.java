package com.mycompany.u3.extra.biblioteca;

public class Libro extends Recurso {

    private int numProrrogas = 0;

    public Libro(String titulo, String categoria) {
        super(titulo, categoria);
        this.limiteDias = 15;
    }

    public void proroga() {
        if (numProrrogas < 3) {
            limiteDias += 15;
            numProrrogas++;
        } else {
            System.out.println("Ups! No se puede hacer más prórrogas. Hay que devolver el libro.");
        }

    }
}
