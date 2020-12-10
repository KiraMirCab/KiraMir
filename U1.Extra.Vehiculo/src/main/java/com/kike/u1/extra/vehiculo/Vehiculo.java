package com.kike.u1.extra.vehiculo;

// CLASE
public class Vehiculo {
    // PROPIEDADES
    public int numRuedas;
    public double potencia;
    public double litrosEnDeposito;
    public double consumoPor100Km;
    public boolean arrancado;

    public Vehiculo (int numRuedas, double potencia, double litrosEnDeposito, double consumoPor100Km) {}
            
    public int getNumRuedas() {
        return numRuedas;
    }

    public void setNumRuedas(int numRuedas) {
        this.numRuedas = numRuedas;
    }

    public double getPotencia() {
        return potencia;
    }

    public void setPotencia(double potencia) {
        this.potencia = potencia;
    }

    public double getLitrosEnDeposito() {
        return litrosEnDeposito;
    }

    public void setLitrosEnDeposito(double litrosEnDeposito) {
        this.litrosEnDeposito = litrosEnDeposito;
    }

    public double getConsumoPor100Km() {
        return consumoPor100Km;
    }

    public void setConsumoPor100Km(double consumoPor100Km) {
        this.consumoPor100Km = consumoPor100Km;
    }
    
    public void reponerCombustible(double numLitrosRepuestos) {
        litrosEnDeposito = litrosEnDeposito + numLitrosRepuestos;
        // litrosEnDeposito += numLitrosRepuestos;
    }
    
    public void recorrerDistancia (double numKm) {
        litrosEnDeposito = litrosEnDeposito - numKm*consumoPor100Km/100;
    }
    
    public void arrancar() {
        arrancado = true;
    }
    
    public void apagar() {
        arrancado = false;
    }
    
    public double calculaKmHastaRepostaje() {
        return litrosEnDeposito*100/consumoPor100Km;
    } 
}
