package com.mycompany.u3.e5.dispositivos.Dispositivo;

public class MemoriaRAM extends Dispositivo {

    private int[] array = new int[100];
    private int numOperacionesLect, numOperacionesEsc;

    public void escribir(int pos, int elem) {
        if (!this.isEncendido()) {
            System.out.println("El equipo está apagado");
        } else {
            array[pos] = elem;
            numOperacionesEsc++;
        }
    }

    public int leer(int pos) {
        if (!this.isEncendido()) {
            System.out.println("El equipo está apagado");
            return 0;
        }
        numOperacionesLect++;
        return array[pos];
    }

    @Override
    public void encender() {
        super.encender();
        numOperacionesLect = 0;
        numOperacionesEsc = 0;
    }
}
