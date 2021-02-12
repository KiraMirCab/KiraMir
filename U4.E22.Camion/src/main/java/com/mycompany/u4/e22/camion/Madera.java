package com.mycompany.u4.e22.camion;

public class Madera implements Pesable {
    private double peso;

        
    @Override
    public double getPeso() {
        return this.peso;
    }

    public Madera(double peso) {
        this.peso = peso;
    }
    
    
}