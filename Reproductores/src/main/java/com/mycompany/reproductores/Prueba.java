package com.mycompany.reproductores;

public class Prueba {
    public static void main(String[] args) {
        MP3 m = new MP3();
        m.encender();
        m.setNumCancionesEnMemoria(54);
        m.setNumCancionActual(58);
        m.setNumCancionActual(54);
        m.siguienteCancion();
        System.out.println(m.getNumCancionActual());
        m.anteriorCancion();
        System.out.println(m.getNumCancionActual());
        System.out.println(m.isEncendido());
        m.encender();
        m.play();
        m.stop();
        m.stop();
    }
}
