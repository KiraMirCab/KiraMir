package com.mycompany.reproductores;

public abstract class Reproductor {

    private boolean encendido;

    public boolean isEncendido() {
        return encendido;
    }

    public void encender() {
        if (!encendido) {
            encendido = true;
        } else {
            System.out.println("El dispositivo ya estaba encendido");
        }

    }

    public void apagar() {
        if (encendido) {
            encendido = false;
        } else {
            System.out.println("El dispositivo ya estaba apagado");
        }
    }

    public abstract void play();

    public abstract void stop();

}
