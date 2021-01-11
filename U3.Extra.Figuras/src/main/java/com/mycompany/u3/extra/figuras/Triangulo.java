package com.mycompany.u3.extra.figuras;

 
public class Triangulo extends Figura {
    private double lado1, lado2, lado3;

    public Triangulo(double lado1, double lado2, double lado3) {
        this.lado1 = lado1;
        this.lado2 = lado2;
        this.lado3 = lado3;
    }

    @Override
    public double calculaSuperficie() {
        double s = calculaPerimetro()/2;
        return Math.sqrt(s*(s-lado1)*(s-lado2)*(s-lado3));
    }

    @Override
    public double calculaPerimetro() {
        return lado1+lado2+lado3;
    }
    
    
}
