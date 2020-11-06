package com.mycompany.u2.e12bombillacondicional;




public class Bombilla {

    public String marca;
    public int potencia, numVecesEncendida;
    public boolean encendida;

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public void imprimeMarca() {
        System.out.println(marca);
    }

    public void setPotencia(int potencia) {
        this.potencia = potencia;
    }

    public void imprimePotencia() {
        System.out.println(potencia);
    }

    public void encender() {
        numVecesEncendida++;
        if (encendida) {
            System.out.println("La bombilla ya estaba encendida");
        }
                
        encendida = true;
    }

    public void apagar() {
        if (!encendida) {
            System.out.println("La bombilla ya estaba apagada");
        }
        encendida = false;
    }

    public void imprimeEstado() {
        System.out.println(encendida);
    }

    public int getNumVecesEncendida() {
        return numVecesEncendida;
    }

}



