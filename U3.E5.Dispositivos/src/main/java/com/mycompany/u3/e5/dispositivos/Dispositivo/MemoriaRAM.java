package com.mycompany.u3.e5.dispositivos.Dispositivo;

public class MemoriaRAM extends Dispositivo {
    private final int TAM = 100;
    private int[] array = new int[TAM];
    private int numOperacionesLect, numOperacionesEsc;

    public MemoriaRAM(String marca, String modelo) {
        super(marca, modelo);
    }

    
    public void escribir(int pos, int elem) {
        if (!isEncendido()) {
            System.out.println("El equipo está apagado");
        } else {
            if (pos >= 0 && pos < TAM) {
                array[pos] = elem;
                numOperacionesEsc++;
            } else
                System.out.println("Error: posicion incorrecta");            
        }
    }

    public int leer(int pos) {
        if (!isEncendido()) {
            System.out.println("El equipo está apagado");
            return 0;
        }
        if (pos >= 0 && pos < TAM) {
        return array[pos];    
        } else{
            System.out.println("Error: posicion incorrecta");
            return 0;
        }

    }

    @Override
    public void encender() {
        super.encender();
        numOperacionesLect = 0;
        numOperacionesEsc = 0;
        
        array = new int[TAM];
        
        
    }

    @Override
    public String toString() {
        return super.toString()+"MemoriaRAM{" + "numOperacionesLect=" + numOperacionesLect + ", numOperacionesEsc=" + numOperacionesEsc + '}';
    }
    
    public void resetContadores(){
    numOperacionesLect = numOperacionesEsc = 0;
    };

}
