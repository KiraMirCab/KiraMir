package com.mycompany.u3.e2.futbol;

import com.mycompany.u3.e2.futbol.jugadores.Futbolista;

public class PruebaFutbolista {
    public static void main(String[] args) {
        Futbolista f1 = new Futbolista("Aleksandr", "Kerzhakov");
        f1.marcaGol();
        f1.marcaGol(9);
        f1.golAnulado();
        f1.golAnulado(2);
        System.out.println("Numero total de goles: " + f1.getNumGoles());
    }
}
