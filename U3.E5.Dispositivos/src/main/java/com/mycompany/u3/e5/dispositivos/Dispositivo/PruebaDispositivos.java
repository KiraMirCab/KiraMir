package com.mycompany.u3.e5.dispositivos.Dispositivo;

public class PruebaDispositivos {
    public static void main(String[] args) {
        Procesador p = new Procesador("Intel", "icore 7");
        MemoriaRAM m = new MemoriaRAM("Kingston", "HyperX Fury");
        TarjetaVideo t = new TarjetaVideo("MSI", "GeForce");
        
        p.apagar();
        p.multiplicar(5, 7);
        p.encender();
        System.out.println("Miltiplico 8 y 9: "+ p.multiplicar(8, 9));
        System.out.println("Divido 9 entre 3: "+p.dividir(9, 3));
        System.out.println("Numero de operaciones: "+p.getNumOperaciones());
        p.apagar();
        System.out.println(p);
        
        m.encender();
        m.escribir(50, 10);
        
        
        
    }
}
