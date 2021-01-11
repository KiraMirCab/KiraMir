package com.mycompany.ejercicio1;

public class PruebaCalentadores {
    public static void main(String[] args) {
        Radiador r = new Radiador();
        r.setPotenciaMax(1000);
        
        Secador s = new Secador();
        s.setPotenciaMax(1000);
        
        r.setPorcientoPotencia(0.8);
        System.out.println("La potencia actual del radiador apagado es de "+ r.calculaPotencia());
        r.encender();
        System.out.println("La potencia actual del radiador encendido es de "+ r.calculaPotencia());
        
        System.out.println("La potencia actual del secador apagado es de "+ s.calculaPotencia());
        s.encender();
        System.out.println("La potencia actual del secador encendido es de "+ s.calculaPotencia());
        s.activarResistencia1();
        System.out.println("La potencia actual del secador encendido y con una resistencia encendida es de "+ s.calculaPotencia());
        s.activarResistencia2();
        System.out.println("La potencia actual del secador encendido con las dos resistencias encendidas es de "+ s.calculaPotencia());
    }
}
