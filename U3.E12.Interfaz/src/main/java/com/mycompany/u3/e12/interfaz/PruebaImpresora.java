package com.mycompany.u3.e12.interfaz;

public class PruebaImpresora {

    public static void main(String[] args) {

        Impresora i = new Impresora("HP", "Laserjet 2000");
        i.cargarBandeja(5);

        Documento d1 = new Documento();
        d1.setNumPaginasImpresion(4);
        Documento d2 = new Documento();
        d2.setNumPaginasImpresion(3);
        
        i.encender();
        i.imprimir(d1);
        System.out.println(i.getEstado());
        i.imprimir(d2);
        System.out.println(i.getEstado());
    }
}
