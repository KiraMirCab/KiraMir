package com.mycompany.u3.animales;

public class PruebaMamiferos {
    public static void main(String[] args) {
        Tigre pupi = new Tigre();
        Gato fluffy = new Gato();
        pupi.alimentacion="carne";
        pupi.peso=50;
        pupi.habitat="zoo";
        pupi.diasSinCazar=125;
        pupi.ruge();
        pupi.crece();
        pupi.reproduce(fluffy);
        pupi.salta();
        pupi.muere();
        
    }
}
