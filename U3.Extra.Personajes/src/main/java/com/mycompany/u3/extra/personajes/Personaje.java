package com.mycompany.u3.extra.personajes;

public class Personaje {
    private String nombre;
    private int energiaMaxima, energiaActual, nivel;
    private boolean vivo;

    public Personaje() {
        vivo = true;
        nivel = 1;
        energiaMaxima = 10;
        energiaActual=energiaMaxima;
    }

    public Personaje(String nombre, int energiaMaxima) {
        vivo = true;
        nivel = 1;
        this.nombre = nombre;
        this.energiaMaxima = energiaMaxima;
        energiaActual=energiaMaxima;
    }

    public boolean isVivo() {
        return vivo;
    }
    
    public void come(){
        energiaActual++;
    }
    
    public void duerme(){
        energiaActual++;
    }
    
    public void atacaOponente (int energiaAtaque) {
        
    }
    
    public void recibeAtaque (int energiaAtaque) {
        energiaActual-=energiaAtaque;
    }
    
    public void muere(){
        vivo = false;
    }
}
