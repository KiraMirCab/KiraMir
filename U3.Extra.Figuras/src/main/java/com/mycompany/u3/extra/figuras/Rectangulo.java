package com.mycompany.u3.extra.figuras;

public class Rectangulo extends Figura {
    private double base, altura;

    public Rectangulo(double base, double altura) {
        this.base = base;
        this.altura = altura;
    }

    @Override
    public double calculaSuperficie() {
        return  base * altura;
    }

    @Override
    public double calculaPerimetro() {
        return 2 * (base+altura);
    }
    
    
}
