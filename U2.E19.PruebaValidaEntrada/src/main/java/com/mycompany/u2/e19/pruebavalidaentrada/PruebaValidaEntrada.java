package com.mycompany.u2.e19.pruebavalidaentrada;

import java.util.Scanner;

public class PruebaValidaEntrada {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int mayorCero;
        do {
            System.out.println("Dame un número entero mayor que cero");
            mayorCero = sc.nextInt();
            if (mayorCero <= 0) 
                System.out.println("El número debe ser mayor que cero");
        } while (mayorCero <= 0);

        int menorIgualCero;
        do {
            System.out.println("Dame un número entero menor o igual que cero");
            menorIgualCero = sc.nextInt();
            if (menorIgualCero > 0) 
                System.out.println("El número debe ser menor o igual que cero");
        } while (menorIgualCero > 0);

        double realRango;
        do {
            System.out.println("Dame un número real entre 1.3 y 19.8 ambos incluidos");
            realRango = sc.nextDouble();
            if (realRango < 1.3 || realRango > 19.8) 
                System.out.println("El número debe ser menor o igual que cero");            
        } while (realRango < 1.3 || realRango > 19.8);
        
        String siNo;
        String limpiaBuffer = sc.nextLine();
        do {
            System.out.println("Dame un carácter: S o N");
            siNo = sc.nextLine();
            if (!(siNo.equals("N") || siNo.equals("N"))) 
                System.out.println("El carácter solo puede ser S o N");            
        } while (!(siNo.equals("N") || siNo.equals("N")));
        
        System.out.println("Número entero mayor que cero: "+mayorCero);
        System.out.println("Número entero menor o igual que cero: " +menorIgualCero);
        System.out.println("Número real entre 1.3 y 19.8: "+realRango);
        System.out.println("S o N: " + siNo);
        
      
    }
}
