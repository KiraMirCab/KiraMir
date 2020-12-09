package com.mycompany.u2.e39.numerosaleatorios;

import java.util.Scanner;

public class NumerosAleatorios {
    public static void main(String[] args) {
        int[] arr = new int[2000];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = (int) (Math.random()*1001);
           }
        
        Scanner sc = new Scanner(System.in);
        System.out.println("Que numero entre 0 y 1001 buscamos?");
        int numBuscado = sc.nextInt();
        int pos = -1;
        
        for (int i = 0; i < arr.length; i++) {
            if  (numBuscado == arr[i]){
                System.out.println("El nunero buscado está en la posicion "+i+". El contenido de esta posición es "+arr[i]);
                pos = i;
                break;
            }
        }
        if (pos == -1) 
            System.out.println("Numero no encontrado");
    }
}
