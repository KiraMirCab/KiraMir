
package com.mycompany.vehiculo3;

public class Vehiculo3 {
    public int numRuedas;
    public double potencia;
    public double litrosEnDeposito;
    public double consumoPor100Km;
    public boolean arrancado;
    public double kmRecorridos;

    public void setNumRuedas(int nuevoNumRuedas) {
        numRuedas = nuevoNumRuedas;
    }

    public void setPotencia(double nuevaPotencia) {
        potencia = nuevaPotencia;
    }

    public void setConsumoPor100Km(double nuevoConsumoPor100Km) {
        consumoPor100Km = nuevoConsumoPor100Km;
    }

    public void reponerCombustible(double numLitrosRepuesto) {
        litrosEnDeposito = litrosEnDeposito + numLitrosRepuesto;
    }

    public void recorrerDistancia(double numKm) {
        litrosEnDeposito = litrosEnDeposito - consumoPor100Km * numKm/100;
        kmRecorridos = kmRecorridos + numKm;
    }

    public void arrancar() {
        arrancado = true;
    }

    public void apagar() {
        arrancado = false;
    }
    
    public int getNumRuedas(){
        return numRuedas;
    }
    
    public double getPotencia(){
        return potencia;
    }
    
    public double getConsumoPor100Km(){
        return consumoPor100Km;
    }
    
    public double getLitrosEnDeposito(){
        return litrosEnDeposito;
    }
    
    public double calculaKmHastaRepostaje(){
        return litrosEnDeposito/(consumoPor100Km/100);
    }
}
