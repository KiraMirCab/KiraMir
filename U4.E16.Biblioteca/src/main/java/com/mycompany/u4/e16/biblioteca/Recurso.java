package com.mycompany.u4.e16.biblioteca;

import java.util.HashSet;

import java.util.Set;

public class Recurso {
    private final String ISBN;
    private String titulo;
    private Set autores = new HashSet();
    private int numEjemplares;

    public Recurso(String ISBN, String titulo, Autor a, int numEjemplares) {
        this.ISBN = ISBN;
        this.titulo = titulo;
        autores.add(a);
        this.numEjemplares = numEjemplares;
    }

    @Override
    public String toString() {
        return "Recurso{" + "ISBN=" + ISBN + ", titulo=" + titulo + ", autores=" + autores + ", numEjemplares=" + numEjemplares + '}';
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public Set getAutores() {
        return autores;
    }

    public void meterAutor(Autor a) {
        autores.add(a);
    }

    public int getNumEjemplares() {
        return numEjemplares;
    }

    public void setNumEjemplares(int numEjemplares) {
        this.numEjemplares = numEjemplares;
    }

    public String getISBN() {
        return ISBN;
    }
    
    
}
