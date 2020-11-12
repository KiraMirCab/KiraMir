
package com.mycompany.u2.e26.multi9usuario;
import java.util.Scanner;

public class PruebaTablaMulti9Usuario {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Escribe un nuemro entero para ver su tabla de multiplicacion:");
        int num = sc.nextInt();
        
        for (int i = 0; i <= 10; i++) {
            System.out.println(i+" x "+num+" = "+(i*num));
        }
        
//        int i = 0;
//        
//        while(i<=10) {
//            System.out.println(i+" x "+num+" = "+(i*num));
//            i++;
//        }
    }
}
