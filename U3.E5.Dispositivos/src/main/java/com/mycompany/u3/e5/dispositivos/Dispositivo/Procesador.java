package com.mycompany.u3.e5.dispositivos.Dispositivo;

public class Procesador extends Dispositivo {

    private int numOperaciones;

    public int sumar(int num1, int num2) {
        if (!isEncendido()) {
            System.out.println("El equipo está apagado");
            return 0;
        }
        numOperaciones++;
        return num1 + num2;
    }

    public int restar(int num1, int num2) {
        if (!isEncendido()) {
            System.out.println("El equipo está apagado");
            return 0;
        }
        numOperaciones++;
        return num1 - num2;
    }

    public int multiplicar(int num1, int num2) {
        if (!isEncendido()) {
            System.out.println("El equipo está apagado");
            return 0;
        }
        numOperaciones++;
        return num1 * num2;
    }

    public int dividir(int num1, int num2) {
        if (!isEncendido()) {
            System.out.println("El equipo está apagado");
            return 0;
        }
        numOperaciones++;
        return num1 / num2;
    }

    @Override
    public void encender() {
        super.encender();
        numOperaciones = 0;
    }

    public int getNumOperaciones() {
        return numOperaciones;
    }

    @Override
    public String toString() {
        return super.toString()+"Procesador{" + "numOperaciones=" + numOperaciones + '}';
    }
    
    
}
