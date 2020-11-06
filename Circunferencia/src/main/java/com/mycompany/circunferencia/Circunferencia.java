
package com.mycompany.circunferencia;

public class Circunferencia {
    public double radio;
    
    public void setRadio(double nuevoRadio){
        radio = nuevoRadio;
    }
    
    public double calculaPerimetro() {
        return radio*2*Math.PI;
    }
    
    public double calculaSuperficie() {
        return Math.pow(radio, 2) * Math.PI;
    }
}
