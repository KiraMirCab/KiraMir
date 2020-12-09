package com.mycompany.practice;

public class TablasMultiplicar {

    public static void main(String[] args) {
        for (int num = 1; num <= 10; num++) {
            System.out.println("La tabla del " + num + " es:");
            
            for (int cont = 0; cont <= 10; cont++) {
                System.out.println(num + " x " + cont + " = " + (num * cont));
            }
        }
    }
}
