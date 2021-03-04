package com.mycompany.u5.e1.teclado;

public class PruebaTeclado {
    public static void main(String[] args) {
        Teclado t = new Teclado();
        t.leeEntero();
        t.leeEntero(1, 20);
        t.leeEnteroMax(50);
        t.leeEnteroMin(-25);
    }
}
