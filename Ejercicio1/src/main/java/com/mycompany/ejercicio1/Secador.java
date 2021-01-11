package com.mycompany.ejercicio1;

public class Secador extends Calentador {

    private boolean resistencia1, resistencia2;

    public boolean estadoResistencia1() {
        return resistencia1;
    }

    public boolean estadoResistencia2() {
        return resistencia2;
    }

    public void activarResistencia1() {
        resistencia1 = true;
    }

    public void activarResistencia2() {
        resistencia2 = true;
    }

    public void desactivarResistencia1() {
        resistencia1 = false;
    }

    public void desactivarResistencia2() {
        resistencia2 = false;
    }

    @Override
    public double calculaPotencia() {
        if (estadoCalentador()) {
            if (resistencia1 && resistencia2) {
                return getPotenciaMax();
            } else {
                if (resistencia1 || resistencia2) {
                    return getPotenciaMax() * 0.5;
                }
            }
        }
        return 0;
    }

}
