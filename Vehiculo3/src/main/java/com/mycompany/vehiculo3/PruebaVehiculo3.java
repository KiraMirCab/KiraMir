
package com.mycompany.vehiculo3;

public class PruebaVehiculo3 {
    public static void main(String[] args) {
        Vehiculo3 v1 = new Vehiculo3();
        
        v1.setNumRuedas(4);
        v1.setPotencia(100);
        v1.setConsumoPor100Km(6);
        v1.reponerCombustible(30);      
        v1.arrancar();
        v1.recorrerDistancia(100);
        v1.apagar();
        v1.arrancar();
        v1.recorrerDistancia(200);
        
        System.out.println("El vehículo tiene "+v1.getNumRuedas()+" ruedas.");
        System.out.println("La potencia es de "+v1.getPotencia()+" caballos.");
        System.out.println("El consumo es de "+v1.getConsumoPor100Km()+" por 100km.");
        System.out.println("Litros en depósito actualmetne: "+v1.getLitrosEnDeposito());
        System.out.println("Número de km hasta repostaje: "+v1.calculaKmHastaRepostaje());
        
    }
}
