package com.mycompany.u3.e5.dispositivos.Dispositivo;

public class TarjetaVideo extends Dispositivo {

    private int numOperacionesNum, numOperacionesText;

    public void mostrarNumeros(int elem) {
        if (!this.isEncendido()) {
            System.out.println("El equipo está apagado");
        } else {
            System.out.println(elem);
        }
    }

    public void mostrarTextos(String texto) {
        if (!this.isEncendido()) {
            System.out.println("El equipo está apagado");
        } else {
            System.out.println(texto);
        }
    }

    @Override
    public void encender() {
        super.encender();
        numOperacionesNum = 0;
        numOperacionesText = 0;
    }
}
