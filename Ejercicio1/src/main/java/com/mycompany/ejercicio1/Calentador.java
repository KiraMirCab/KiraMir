package com.mycompany.ejercicio1;

public class Calentador {
    private double potenciaMax;
    private boolean encendido;

    public double getPotenciaMax() {
        return potenciaMax;
    }

    public void setPotenciaMax(double potenciaMax) {
        this.potenciaMax = potenciaMax;
    }
    
    public void encender() {
        encendido=true;
    }
    
    public void apagar() {
        encendido=false;
    }

    public boolean estadoCalentador() {
        return encendido;
    }
    
    public double calculaPotencia() {
        if (encendido) {
            return potenciaMax;
        } else {
            return 0;
        }
    }
}
