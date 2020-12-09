package com.mycompany.u2.e13.bombillacondicional2;




public class PruebaBombilla {
    public static void main(String[] args) {
     
        Bombilla b = new Bombilla();
        
        b.setMarca("Phillips");
        b.setPotencia(100);
        b.encender();
        b.apagar();
        b.apagar();
        b.encender();
        b.encender();
        b.apagar();
        b.encender();
        b.apagar();
        b.encender();
        b.apagar();
        b.encender();
        b.apagar();
        b.encender();
        b.apagar();
        b.encender();
        b.apagar();
        b.encender();
        b.apagar();
        b.encender();
        b.apagar();
        b.encender();
        b.apagar();
        b.encender();
        b.apagar();
        b.imprimeEstado();
        System.out.println("La bombilla se ha encendido "+b.getNumVecesEncendida()+" veces");

    }
}
