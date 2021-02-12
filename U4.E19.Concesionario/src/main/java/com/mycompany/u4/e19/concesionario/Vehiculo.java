package com.mycompany.u4.e19.concesionario;

import java.util.Objects;

public class Vehiculo {
    private final String marca, modelo, matricula;
    private int anio;
    private double precio;

    public Vehiculo(String marca, String modelo, String matricula, int anio, double precio) {
        this.marca = marca;
        this.modelo = modelo;
        this.matricula = matricula;
        this.anio = anio;
        this.precio = precio;
    }

    public double getPrecio() {
        return precio;
    }

    public void setPrecio(double precio) {
        this.precio = precio;
    }
    
    
    @Override
    public int hashCode() {
        int hash = 7;
        hash = 71 * hash + Objects.hashCode(this.marca);
        hash = 71 * hash + Objects.hashCode(this.modelo);
        hash = 71 * hash + Objects.hashCode(this.matricula);
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
        final Vehiculo other = (Vehiculo) obj;
        if (!marca.equals(other.marca)) {
            return false;
        }
        if (!modelo.equals(other.modelo)) {
            return false;
        }
        if (!matricula.equals(other.matricula)) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "Marca: " + marca + ", Modelo: " + modelo + ", Matricula: " + matricula + ", Año de fabricación: " + anio + ", Precio: " + precio + ".\n";
    }
    
    
}
