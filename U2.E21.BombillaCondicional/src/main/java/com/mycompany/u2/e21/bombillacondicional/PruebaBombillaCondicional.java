
package com.mycompany.u2.e21.bombillacondicional;

public class PruebaBombillaCondicional {
    public static void main(String[] args) {
        BombillaCondicional b = new BombillaCondicional();
        
        b.setPotencia(100);
        b.setMarca("Phillips");
//        b.imprimeEstado();
        b.encender(); // 1
        b.apagar();
        b.encender(); // 2
        b.apagar();
        b.encender();// 3
        b.apagar();
        b.encender();// 4
        b.apagar();
        b.encender();// 5
        b.encender();// 1
        b.apagar();
        b.apagar();
        b.encender();// 6
        b.apagar();
        b.encender();// 7
        b.apagar();
        b.encender();// 8
        b.apagar();
        b.encender();// 9
        b.apagar();
        b.encender();// 10
        System.out.println("La bombilla se ha encendido "+b.getNumVecesEncendida()+" veces");
        b.apagar();
        b.encender();
        b.imprimeEstado();
    }
}
