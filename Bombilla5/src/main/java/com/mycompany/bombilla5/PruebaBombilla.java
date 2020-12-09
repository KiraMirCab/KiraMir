
package com.mycompany.bombilla5;


public class PruebaBombilla {
    public static void main(String[] args) {
       Bombilla b = new Bombilla();
//       int numVeces;
       b.encender();
       b.apagar();
       b.encender();
       b.apagar();
//       numVeces = b.obtieneNumVecesEncendida();
        System.out.println("Encendida "+b.obtieneNumVecesEncendida()+" veces");
    }
}
