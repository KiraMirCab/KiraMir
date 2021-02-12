package com.mycompany.prueba12feblistas;

public class Articulo implements Comparable {

    private String nombre;
    private double precio;

    public Articulo(String nombre, double precio) {
        this.nombre = nombre;
        this.precio = precio;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public double getPrecio() {
        return precio;
    }

    public void setPrecio(double precio) {
        this.precio = precio;
    }

    @Override
    public String toString() {
        return "Nombre: " + nombre + ", precio: " + precio;
    }

    @Override
    public int compareTo(Object o) {
        Articulo art = (Articulo) o;
        if (this.getPrecio() > art.getPrecio()) {
            return 1;
        } else {
            if (this.getPrecio() == art.getPrecio()) {
                return 0;
            }
            return -1;
        }
    }
}
