package com.mycompany.u4.e16.biblioteca;

import java.util.*;

public class Recurso {
    private final String ISBN;
    private final String TITULO;
    private List autores = new ArrayList();
    private int numEjemplares;

    public Recurso(String ISBN, String titulo, Autor a, int numEjemplares) {
        this.ISBN = ISBN;
        this.TITULO = titulo;
        autores.add(a);
        this.numEjemplares = numEjemplares;
    }

    @Override
    public String toString() {
        return "Recurso: " + "ISBN: " + ISBN + ", titulo: " + TITULO + ", autores: " + autores + ", numero de ejemplares: " + numEjemplares;
    }

    public String getTitulo() {
        return TITULO;
    }

    public List getAutores() {
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

    @Override
    public int hashCode() {
        int hash = 7;
        hash = 79 * hash + Objects.hashCode(this.ISBN);
        hash = 79 * hash + Objects.hashCode(this.TITULO);
        return hash;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        final Recurso other = (Recurso) obj;
        if (!Objects.equals(this.ISBN, other.ISBN)) {
            return false;
        }
        if (!Objects.equals(this.TITULO, other.TITULO)) {
            return false;
        }
        return true;
    }
    
    
}
