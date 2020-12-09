package com.mycompany.u2.e41.carrito;

public class Articulo {
    public int idArticulo;
    public String nombre;
    public double precio;
    public static final Articulo NOT_FOUND = new Articulo();

    public int getIdArticulo() {
        return idArticulo;
    }

    public void setIdArticulo(int idArticulo) {
        this.idArticulo = idArticulo;
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

    
}
