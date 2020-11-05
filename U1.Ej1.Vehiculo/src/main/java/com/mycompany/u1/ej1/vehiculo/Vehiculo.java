
package com.mycompany.u1.ej1.vehiculo;


public class Vehiculo {
    public int numRuedas;
    public double potencia;
    public double litrosEnDeposito;
    public double consumoPorKm;
    public boolean arrancado;
    public double kmRecorridos;

    public void setNumRuedas(int numRuedas) {
        this.numRuedas = numRuedas;
    }

    public void setPotencia(double potencia) {
        this.potencia = potencia;
    }

    public void setConsumoPorKm(double consumoPorKm) {
        this.consumoPorKm = consumoPorKm;
    }
    
    public void reponerCombustible(double numLitrosRepuesto) {
        litrosEnDeposito += numLitrosRepuesto;
    }
    
    public void recorrerDistancia (double numKm) {
        litrosEnDeposito = litrosEnDeposito - consumoPorKm*kmRecorridos;
        kmRecorridos += numKm;
    }
    
    public void arrancar() {
        arrancado = true;
    }
    
    public void apagar() {
        arrancado = false;
    }
    
    public void imprimeNumRuedas(){
        System.out.println("Numero de rueas es " + numRuedas);
    }
public void imprimePotencia(){
    System.out.println("La potencia es " + potencia);
    }
public void imprimeConsumoPorKm(){
    System.out.println("El consumo es " + consumoPorKm);
    }
public void imprimeLitrosEnDeposito(){
    System.out.println("Litros en deposito " + litrosEnDeposito);
    }
public void imprimeKmRecorridos(){
    System.out.println("Km recorridos: " + kmRecorridos);
    }

}
