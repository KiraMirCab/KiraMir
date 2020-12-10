package com.kike.u1.extra.vehiculo;

public class PruebaPersonaCoche {
    public static void main(String[] args) {
        Vehiculo volvo = new Vehiculo(4, 100, 15, 6);
        Vehiculo toyota = new Vehiculo(4, 150, 10, 4);
        
        Persona juan = new Persona("Juan", "T734563E");
        
        juan.comprarCoche(volvo);
        juan.comprarCoche(toyota);
        
        juan.arrancarCoche(volvo);
        juan.reponerCombustible(volvo, 50);
        juan.recorrerDistancia(volvo, 200);
        juan.apagarCoche(volvo);
        System.out.println("Litros en deposito del Volvo: " + volvo.getLitrosEnDeposito());
        
        juan.recorrerDistancia(toyota, 5);
        System.out.println("Litros en deposito del Toyota: " + toyota.getLitrosEnDeposito());
        
        Vehiculo skoda = new Vehiculo(4, 90, 6, 5);
        Vehiculo mercedes = new Vehiculo(4, 150, 50, 15);
        
        juan.comprarCoche(skoda);
        juan.comprarCoche(mercedes);
        
    }
}
