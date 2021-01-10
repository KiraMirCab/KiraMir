package com.mycompany.u3.extra.biblioteca;

public class CD extends Recurso {

    public CD(String titulo, String categoria) {
        super(titulo, categoria);
        this.limiteDias = 7;
    }
}
