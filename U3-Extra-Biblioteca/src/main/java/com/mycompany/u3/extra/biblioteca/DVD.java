package com.mycompany.u3.extra.biblioteca;

public class DVD extends Recurso {

    public DVD(String titulo, String categoria) {
        super(titulo, categoria);
        this.limiteDias = 7;
    }
}
