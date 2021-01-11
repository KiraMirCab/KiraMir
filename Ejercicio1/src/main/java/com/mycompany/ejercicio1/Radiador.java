package com.mycompany.ejercicio1;

public class Radiador extends Calentador {
    private double porcientoPotencia;

    public double getPorcientoPotencia() {
        return porcientoPotencia;
    }

    public void setPorcientoPotencia(double porcientoPotencia) {
        this.porcientoPotencia = porcientoPotencia;
    }

    @Override
    public double calculaPotencia() {
        if (estadoCalentador()) {
            return getPotenciaMax()*porcientoPotencia;
        } else {
            return 0;
        }
    }
    
    
}
