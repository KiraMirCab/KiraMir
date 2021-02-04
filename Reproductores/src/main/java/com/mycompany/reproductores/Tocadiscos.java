package com.mycompany.reproductores;

public class Tocadiscos extends Reproductor {

    public void girar() {
        System.out.println("El plato está girando");
    }

    public void posicionarAguja() {
        System.out.println("La aguja está sobre el disco");
    }

    @Override
    public void play() {
        if (!isEncendido()) {
            System.out.println("Hay que encender el tocadiscos primero");
        } else {
            girar();
            posicionarAguja();
            System.out.println("Reproduciendo audio...");
        }
    }

    @Override
    public void stop() {
        if (!isEncendido()) {
            System.out.println("Hay que encender el tocadiscos y darle al play primero");
        } else {         
        System.out.println("Reproducción detenida...");
        }
    }

}
