package com.mycompany.prueba_flotacamion;

public class PruebaFlota {
    public static void main(String[] args) {
        Flota f = new Flota();
        f.altaCamion(new Camion("56478M", false, true, 1500));
        f.altaCamion(new Camion("65478K", true, true, 1500));
        f.altaCamion(new Camion("97565H", true, true, 0));
        f.altaCamion(new Camion("89756G", true, true, 500));
        f.altaCamion(new Camion("54123M", true, false, 1500));
        
        f.imprimeFlota();
        System.out.println("---------------------");
        f.ponerFlotaenRuta();
    }
}
