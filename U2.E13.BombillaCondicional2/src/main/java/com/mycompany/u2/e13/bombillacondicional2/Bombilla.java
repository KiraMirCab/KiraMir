package com.mycompany.u2.e13.bombillacondicional2;

public class Bombilla {

    public String marca;
    public int potencia, numVecesEncendida;
    public boolean encendida, fundida;

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
        if (fundida) {
            System.out.println("La bombilla está fundida y no se puede encender");

        } else {
            numVecesEncendida++;
            if (numVecesEncendida == 10) {
                fundida = true;
                encendida = false;
            } else {
                if (encendida) {
                    System.out.println("La bombilla ya estaba encendida");
                } else {
                    encendida = true;
                }

            }
        }
    }

    public void apagar() {
        if (fundida) {
            System.out.println("La bombilla está fundida y no se puede apagar");
        } else {
            if (!encendida) {
                System.out.println("La bombilla ya estaba apagada");
            }
            encendida = false;
        }
    }

    public void imprimeEstado() {
        if (fundida) {
            System.out.println("La bombilla está fundida");
        } else {
            System.out.println("Está encendida:" + encendida);
        }

    }

    public int getNumVecesEncendida() {
        return numVecesEncendida;
    }

}
