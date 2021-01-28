package com.mycompany.u4.e14.conjuntotelefonos;

import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class ConjuntoTelefonos {
    public static void main(String[] args) {
        Set permitidos = new HashSet();
        Set prohibidos = new HashSet();
        Scanner sc = new Scanner(System.in);
        int numero;
        do {
            System.out.println("introduzca el numero permitido: ");
            numero = sc.nextInt();
            permitidos.add(numero);
        } while (numero>0);
        
        do {
            System.out.println("introduzca el numero prohibido: ");
            numero = sc.nextInt();
            prohibidos.add(numero);
        } while (numero>0);
        
        for (int i = 0; i < 3; i++) {
            System.out.println("De qué numero le están llamando?");
            numero = sc.nextInt();
            if (permitidos.contains(numero)) {
                System.out.println("El "+numero+" está PERMITIDO, puedes atender la llamada");
            } else {
                if (prohibidos.contains(numero)) {
                    System.out.println("El "+numero+" está PROHIBIDO, cuelga");
                } else {
                    System.out.println("El "+numero+" no es un número conocido, haz lo que creas");
                }
            }
        }
        
    }
}
