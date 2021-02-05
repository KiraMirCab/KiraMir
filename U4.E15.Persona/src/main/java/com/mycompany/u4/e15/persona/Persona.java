package com.mycompany.u4.e15.persona;

import java.util.Objects;

public class Persona {
    private String DNI, nombre, apellidos, numTelefono, direccion;
    private int edad;
    private boolean casada, tieneTrabajo;

    public String getDNI() {
        return DNI;
    }

    public void setDNI(String DNI) {
        this.DNI = DNI;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellidos() {
        return apellidos;
    }

    public void setApellidos(String apellidos) {
        this.apellidos = apellidos;
    }

    public String getNumTelefono() {
        return numTelefono;
    }

    public void setNumTelefono(String numTelefono) {
        this.numTelefono = numTelefono;
    }

    public String getDireccion() {
        return direccion;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public boolean isCasada() {
        return casada;
    }

    public void setCasada(boolean casada) {
        this.casada = casada;
    }

    public boolean isTieneTrabajo() {
        return tieneTrabajo;
    }

    public void setTieneTrabajo(boolean tieneTrabajo) {
        this.tieneTrabajo = tieneTrabajo;
    }

    @Override
    public String toString() {
        return "Persona{" + "DNI=" + DNI + ", nombre=" + nombre + ", apellidos=" + apellidos + ", numTelefono=" + numTelefono + ", direccion=" + direccion + ", edad=" + edad + ", casada=" + casada + ", tieneTrabajo=" + tieneTrabajo + '}';
    }

    public Persona(String DNI, String nombre, String apellidos, String numTelefono, String direccion, int edad, boolean casada, boolean tieneTrabajo) {
        this.DNI = DNI;
        this.nombre = nombre;
        this.apellidos = apellidos;
        this.numTelefono = numTelefono;
        this.direccion = direccion;
        this.edad = edad;
        this.casada = casada;
        this.tieneTrabajo = tieneTrabajo;
    }

    @Override
    public int hashCode() {
        int hash = 5;
        hash = 29 * hash + Objects.hashCode(this.DNI);
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
        final Persona other = (Persona) obj;
        if (!Objects.equals(this.DNI, other.DNI)) {
            return false;
        }
        return true;
    }
    
    
    
}
