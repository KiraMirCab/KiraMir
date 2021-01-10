package com.mycompany.jamazonreto;

public class Articulo {
    private String nombre;
    private double precio;
    public static final Articulo NOT_FOUND = new Articulo();

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
    
    
}
