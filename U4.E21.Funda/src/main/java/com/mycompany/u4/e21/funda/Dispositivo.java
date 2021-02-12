package com.mycompany.u4.e21.funda;

public abstract class Dispositivo {
    private String marca, modelo;
    private int tamanio;
    private boolean encendido;

    public Dispositivo(String marca, String modelo, int tamanio) {
        this.marca = marca;
        this.modelo = modelo;
        this.tamanio = tamanio;
    }

    @Override
    public String toString() {
        return "Dispositivo{" + "marca=" + marca + ", modelo=" + modelo + ", tamanio=" + tamanio + ", encendido=" + encendido + '}';
    }
    
    
}
