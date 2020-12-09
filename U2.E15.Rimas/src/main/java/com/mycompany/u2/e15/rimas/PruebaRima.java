
package com.mycompany.u2.e15.rimas;
import java.util.Scanner;

public class PruebaRima {
    public static void main(String[] args) {
        Scanner p = new Scanner(System.in);
        
        System.out.println("Escribe un número del 1 al 5");
        int num = p.nextInt();
        
        switch(num){
            case 1: 
                System.out.println("Serás muy feuno");
                break;
            case 2:
                System.out.println("Estás gordo como Porthós");
                break;
            case 3:
                System.out.println("Que gordito te ves");
                break;
            case 4:
                System.out.println("Eres guapo como el Señor Potato");
                break;
            case 5:
                System.out.println("Pareces un ornitorrinco");
                break;
            default: 
                System.out.println("No me sé ninguna rima para el número "+num);
        }
    }
}
