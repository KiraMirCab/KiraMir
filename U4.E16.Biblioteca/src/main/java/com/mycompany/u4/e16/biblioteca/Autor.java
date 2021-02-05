package com.mycompany.u4.e16.biblioteca;

import java.util.Objects;

public class Autor {
    private final String NOMBRE, APELLIDOS, NACIONALIDAD;

    public Autor(String NOMBRE, String APELLIDOS, String nacionalidad) {
        this.NOMBRE = NOMBRE;
        this.APELLIDOS = APELLIDOS;
        this.NACIONALIDAD = nacionalidad;
    }

    public String getNOMBRE() {
        return NOMBRE;
    }

    public String getAPELLIDOS() {
        return APELLIDOS;
    }

    public String getNACIONALIDAD() {
        return NACIONALIDAD;
    }

    
    @Override
    public String toString() {
        return "Autor: " + "nombre: " + NOMBRE + ", apellidos: " + APELLIDOS + ", nacionalidad: " + NACIONALIDAD;
    }

    @Override
    public int hashCode() {
        int hash = 7;
        hash = 73 * hash + Objects.hashCode(this.NOMBRE);
        hash = 73 * hash + Objects.hashCode(this.APELLIDOS);
        hash = 73 * hash + Objects.hashCode(this.NACIONALIDAD);
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
        final Autor other = (Autor) obj;
        if (!Objects.equals(this.NOMBRE, other.NOMBRE)) {
            return false;
        }
        if (!Objects.equals(this.APELLIDOS, other.APELLIDOS)) {
            return false;
        }
        if (!Objects.equals(this.NACIONALIDAD, other.NACIONALIDAD)) {
            return false;
        }
        return true;
    }

    
    
    
}
