package com.kike.u1.extra.vehiculo;

public class PruebaVehiculo2 {
    public static void main(String[] args) {
        Vehiculo v1;   
        v1 = new Vehiculo();

        v1.setNumRuedas(4);
        v1.setPotencia(100);
        v1.setConsumoPor100Km(6);
        v1.setLitrosEnDeposito(0);
        
        v1.reponerCombustible(30);
        v1.arrancar();
        v1.recorrerDistancia(100);
        v1.apagar();
        v1.arrancar();
        v1.recorrerDistancia(200);

        System.out.println("El numero de ruedas es: "+v1.getNumRuedas());
        System.out.println("La potencia es: "+v1.getPotencia());
        System.out.println("El consumo cada 100 km es: "+v1.getConsumoPor100Km());
        System.out.println("Los litros en deposito son: "+v1.getLitrosEnDeposito());
        System.out.println("La autonomía es de: "+v1.calculaKmHastaRepostaje()+" km");
    }
}
