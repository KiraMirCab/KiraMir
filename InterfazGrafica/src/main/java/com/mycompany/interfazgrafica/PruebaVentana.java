package com.mycompany.interfazgrafica;


public class PruebaVentana {
    public static void main(String[] args) {
        Ventana v = new Ventana(200, 300, 50, 60);
        v.setPosX(40);
        System.out.println("La posiciín X es " + v.getPosX());
        v.setPosY(50);
        System.out.println("La posiciín X es " + v.getPosY());
        v.setContenido("Esta ventana mola mogollón");
        System.out.println("El contenido es " + v.getContenido());
        v.ocultar();
        System.out.println(v);
        v.mostrar();
        System.out.println(v);
        v.setAltura(526);
        v.setAnchura(421);
        System.out.println(v);
        v.setDimension(14, 5);
        System.out.println(v);
    }
}
