package com.mycompany.u4.e13.elgordo;

import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class ElGordo {
    public static void main(String[] args) {
        Set numVendidos = new HashSet();
        Scanner sc = new Scanner(System.in);
        int i;
        do {
            System.out.println("Se ha vendido el numero...");
            i = sc.nextInt();
            numVendidos.add(i);
        } while (i!=-1);
        
        System.out.println("El número del Gordo es...");
        int j = sc.nextInt();
        if (numVendidos.contains(j)) {
            System.out.println("Siiiiii! El Gordo se ha vendido aquí!!!");
        } else {
            System.out.println("Qué pena! A ver si la empresa tiene suerte el año que viene.");
        }   
    }
}
