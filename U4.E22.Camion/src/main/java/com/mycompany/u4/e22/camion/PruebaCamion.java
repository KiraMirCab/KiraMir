package com.mycompany.u4.e22.camion;

public class PruebaCamion {
    public static void main(String[] args) {
        Madera madera = new Madera(5000);
        Ganado ganado = new Ganado(2000);
        
        Camion <Madera> camMadera = new Camion();
        Camion <Ganado> camGanado = new Camion();
        camMadera.cargar(madera);
        camGanado.cargar(ganado);
        
        System.out.print("Peso de la carga de madera: ");
        System.out.println(camMadera.getKilosCarga());
        
        System.out.print("Peso de la carga de ganado: ");
        System.out.println(camGanado.getKilosCarga());
        
    }
}
