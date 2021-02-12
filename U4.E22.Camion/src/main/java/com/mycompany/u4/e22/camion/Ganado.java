package com.mycompany.u4.e22.camion;

public class Ganado implements Pesable {
    private double peso;
    
    public void setPeso(double peso) {
        this.peso = peso;
    }
    
    @Override
    public double getPeso() {
        return this.peso;
    }

    public Ganado(double peso) {
        this.peso = peso;
    }
    
}
