package com.mycompany.extra.casting;

public class Persona {
    public int edad;
    public String nombre;
    public boolean sabeCantar, sabeBailar;
    public static final Persona NOT_FOUND = new Persona();

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public boolean isSabeCantar() {
        return sabeCantar;
    }

    public void setSabeCantar(boolean sabeCantar) {
        this.sabeCantar = sabeCantar;
    }

    public boolean isSabeBailar() {
        return sabeBailar;
    }

    public void setSabeBailar(boolean sabeBailar) {
        this.sabeBailar = sabeBailar;
    }
    
    

}
