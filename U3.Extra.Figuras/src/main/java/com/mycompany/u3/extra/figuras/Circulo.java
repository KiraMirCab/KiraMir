package com.mycompany.u3.extra.figuras;

public class Circulo extends Figura {
    private double radio;

    public Circulo(double radio) {
        this.radio = radio;
    }
    
    @Override
    public double calculaSuperficie() {
        return radio * radio * Math.PI;
    }

    @Override
    public double calculaPerimetro() {
        return 2 * radio * Math.PI;
    }
    
    
}
