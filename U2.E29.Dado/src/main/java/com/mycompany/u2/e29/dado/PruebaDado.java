package com.mycompany.u2.e29.dado;

import java.util.Scanner;

public class PruebaDado {

    public static void main(String[] args) {
        Dado d = new Dado();
        Scanner sc = new Scanner(System.in);

        System.out.println("Qué número te gustaría que saliera del dado del 1 al 6?");
        int num = sc.nextInt();

        while (num < 1 || num > 6) {
            System.out.println("Numero incorrecto");
            System.out.println("Escribe un numero entero entre 1 y 6");
            num = sc.nextInt();
        }
        
         int tirada = d.tirada(); 
           while (tirada != num){
            System.out.println(tirada);
            tirada = d.tirada();
        }
        System.out.println("Lo has conseguido!");
    }
}

