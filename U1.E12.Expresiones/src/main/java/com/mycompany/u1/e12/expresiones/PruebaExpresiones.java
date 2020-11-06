
package com.mycompany.u1.e12.expresiones;
import java.util.Scanner;

public class PruebaExpresiones {
    
    public static void main(String[] args) {
        
        Scanner sc = new Scanner (System.in);
        
        double a, b, c, d;
        
        System.out.println("Dame el número a ");
        a = sc.nextInt();
        
        System.out.println("Dame el número b ");
        b = sc.nextInt();
        
        System.out.println("Dame el número c ");
        c = sc.nextInt();
        
        System.out.println("Dame el número d ");
        d = sc.nextInt();
        
        System.out.println((a+b*38)/(c*d));
        
        System.out.println(a+(30-b)/(c+d));
        
        System.out.println(b*a*((a+b)/(b/d)));
        
        System.out.println(((a+5)/b)/(c/(4+d)));
        
        
    }
}
