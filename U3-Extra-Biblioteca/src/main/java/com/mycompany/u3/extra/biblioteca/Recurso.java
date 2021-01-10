package com.mycompany.u3.extra.biblioteca;

public abstract class Recurso {

    protected String titulo, categoria;
    protected boolean disponible = true;
    protected int limiteDias;
    protected Socio prestadoA;

    public void prestar(Socio s) {
        if (disponible) {
            prestadoA = s;
            disponible = false;
        } else {
            System.out.println("Lo sentimos, el libro/CD/DVD no está disponible ahora mismo");
        }
    }

    public void devolver(int diasTranscurridos) {
        if (diasTranscurridos <= limiteDias) {
            System.out.println("Gracias por devolver el libro/CD/DVD a tiempo!");
        } else {
            System.out.println("Ay! Ay! Ay! Llevas " + (diasTranscurridos - limiteDias) + " días de retraso! Te espera una multa descomunal!");
        }
        disponible = true;
//        prestadoA = null;
    }

    public Recurso(String titulo, String categoria) {
        this.titulo = titulo;
        this.categoria = categoria;
    }

   

}
