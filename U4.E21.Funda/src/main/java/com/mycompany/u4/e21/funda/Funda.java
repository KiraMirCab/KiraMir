package com.mycompany.u4.e21.funda;

public class Funda <T> {
    private T contenido;
    
    public void guardar(T objeto) {
        contenido = objeto;
    }
    
    public T saca() {
        T aux = contenido;
        contenido = null;
        return aux;
    }
    
    public boolean isVacia() {
        return contenido == null;
    }
}
