package com.mycompany.u4.e21.funda;

public class PruebaFundas {

    public static void main(String[] args) {
        Funda<Smartphone> f1 = new Funda();
        Funda<Tablet> f2 = new Funda();
        Smartphone s = new Smartphone("Samsung", "Galaxy 8", 6);
        Tablet t = new Tablet("Huawei”", "P10", 12);
        f1.guardar(s);
        f2.guardar(t);
        System.out.println(f1.isVacia());
        f1.saca();
        System.out.println(f1.isVacia());

    }
}
