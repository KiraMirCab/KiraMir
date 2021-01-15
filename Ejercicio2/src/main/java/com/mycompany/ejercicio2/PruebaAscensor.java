package com.mycompany.ejercicio2;

public class PruebaAscensor {

    public static void main(String[] args) {
        Ascensor a1 = new Ascensor("Schindler", "21H13Q");
        Ascensor a2 = new Ascensor("Schindler", "21H13Q", 22);

        a1.sube();
        a1.sube(22);
        a1.sube(9);
        a1.sube(5);
        a1.baja();
        a1.baja(1);

        System.out.println("---------------------------");
        
        a2.sube();
        a2.baja();
        a2.sube(30);
        a2.sube(22);
        a2.sube();
        a2.baja(20);
        a2.sube(12);
        
        System.out.println("---------------------------");
         
        System.out.println(a1);
        System.out.println(a2);

        if (a1.equals(a2)) {
            System.out.println("Pero si son iguales!!! Aunque están en edificios y plantas distintas ^.^");
        }

    }
}
