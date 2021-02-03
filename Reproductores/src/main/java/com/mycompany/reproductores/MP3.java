package com.mycompany.reproductores;

public class MP3 extends Reproductor {

    private int numCancionesEnMemoria, numCancionActual;

    public int getNumCancionesEnMemoria() {
        return numCancionesEnMemoria;
    }

    public void setNumCancionesEnMemoria(int num) {
        if (num >= 0) {
            this.numCancionesEnMemoria = num;
        }
    }

    public void setNumCancionActual(int num) {
        if (num <= numCancionesEnMemoria) {
            this.numCancionActual = num;
        } else {
            System.out.println("El número de la canción no existe en la lista");
        }
    }

    public void siguienteCancion() {
        if (numCancionActual == numCancionesEnMemoria) {
            numCancionActual = 1;
        } else {
            numCancionActual++;
        }
    }

    public void anteriorCancion() {
        if (numCancionActual == 1) {
            numCancionActual = numCancionesEnMemoria;
        } else {
            numCancionActual--;
        }
    }

    @Override
    public void play() {
        if (!isEncendido()) {
            System.out.println("Hay que encender el reproductor MP3 primero");
        } else {
            System.out.println("Reproduciendo audio " + numCancionActual + " de " + numCancionesEnMemoria + " disponibles.");
        }
    }

    @Override
    public void stop() {
        if (!isEncendido()) {
            System.out.println("Hay que encender el reproductor MP3");
        } else {
            System.out.println("Reproducción detenida...");
        }
    }

    public int getNumCancionActual() {
        return numCancionActual;
    }

}
