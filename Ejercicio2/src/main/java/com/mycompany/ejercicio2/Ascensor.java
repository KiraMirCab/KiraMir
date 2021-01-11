package com.mycompany.ejercicio2;

import java.util.Objects;

public class Ascensor {

    private String marca, modelo;
    private int plantasEdificio, plantaActual;

    public Ascensor(String marca, String modelo) {
        this.marca = marca;
        this.modelo = modelo;
        plantasEdificio = 10;
    }

    public Ascensor(String marca, String modelo, int plantasEdificio) {
        this.marca = marca;
        this.modelo = modelo;
        this.plantasEdificio = plantasEdificio;
    }

    public void sube(int plantaDestino) {
        if (plantaDestino <= plantasEdificio && plantaDestino >= 0) {
            if (plantaDestino < plantaActual) {
                System.out.println("Mejor usa el botón de bajar.");
            } else {
                plantaActual = plantaDestino;
                System.out.println("Has llegado a la planta " + plantaDestino);
            }
        } else {
            System.out.println("Error, prueba otra planta");
        }
    }

    public void sube() {
        int plantaDestino = plantaActual + 1;
        sube(plantaDestino);
    }

    public void baja(int plantaDestino) {
        if (plantaDestino <= plantasEdificio && plantaDestino >= 0) {
            if (plantaDestino > plantaActual) {
                System.out.println("Mejor usa el botón de subir.");
            } else {
                plantaActual = plantaDestino;
                System.out.println("Has llegado a la planta " + plantaDestino);
            }
        } else {
            System.out.println("Error, prueba otra planta");
        }
    }

    public void baja() {
        int plantaDestino = plantaActual - 1;
        baja(plantaDestino);
    }

    @Override
    public String toString() {
        return "Ascensor{" + "marca=" + marca + ", modelo=" + modelo + ", plantasEdificio=" + plantasEdificio + ", plantaActual=" + plantaActual + '}';
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        final Ascensor other = (Ascensor) obj;
        if (!Objects.equals(this.marca, other.marca)) {
            return false;
        }
        if (!Objects.equals(this.modelo, other.modelo)) {
            return false;
        }
        return true;
    }

}
