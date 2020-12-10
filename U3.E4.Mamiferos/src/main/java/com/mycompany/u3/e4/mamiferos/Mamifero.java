package com.mycompany.u3.e4.mamiferos;

public class Mamifero {
    private String nombre;
    private int anioNacimietno;

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getAnioNacimietno() {
        return anioNacimietno;
    }

    public void setAnioNacimietno(int anioNacimietno) {
        this.anioNacimietno = anioNacimietno;
    }
    
    public void haceRuido(){
        System.out.println("No sé qué ruido hago. Puedo ser muchas cosas");
    }
}
