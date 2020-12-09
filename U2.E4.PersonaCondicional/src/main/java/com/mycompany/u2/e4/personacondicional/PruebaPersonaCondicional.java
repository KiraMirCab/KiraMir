
package com.mycompany.u2.e4.personacondicional;
import java.util.Scanner;

public class PruebaPersonaCondicional {
    public static void main(String[] args) {
        PersonaCondicional p = new PersonaCondicional();
        Scanner sc = new Scanner(System.in);
        
        System.out.println("Edad:");
        p.setEdad(sc.nextInt());
        System.out.println("Altura:");
        p.setAltura(sc.nextInt());
        System.out.println("Casado?");
        p.setEstaCasado(sc.nextBoolean());
        
        if(p.getEdad()>=18) {
            System.out.println("Ya eres un señor/a");
        }
        if(p.getAltura()>=185){
            System.out.println("Eres alto/a");
        }
        if(p.isEstaCasado()== false) {
            System.out.println("No está casado");
        }
        
    }
}
