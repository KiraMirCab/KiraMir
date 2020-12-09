package com.mycompany.u2.e38.traduccion;

public class PruebaTraduccion {
    public static void main(String[] args) {
        Traduccion[] array = new Traduccion[5];
        array[0] = new Traduccion();
        array[0].setEnglish("To break down");
        array[0].setSpanish("Averiar");
        
        array[1] = new Traduccion();
        array[1].setEnglish("To fix");
        array[1].setSpanish("Arreglar");
        
        array[2] = new Traduccion();
        array[2].setEnglish("To reboot");
        array[2].setSpanish("Reiniciar");
        
        array[3] = new Traduccion();
        array[3].setEnglish("To work");
        array[3].setSpanish("Funcionar");
        
        array[4] = new Traduccion();
        array[4].setEnglish("To type");
        array[4].setSpanish("Teclear");
        
        System.out.println(array[4]);
        for (Traduccion elem: array) {
            System.out.println(elem.getSpanish()+" en español se traduce por "+elem.getEnglish());
        }
    }
}
