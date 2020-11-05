
package com.mycompany.u2.e21.bombillacondicional;
import java.util.Scanner;

public class PruebaBombillaMenu {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        BombillaCondicional b = new BombillaCondicional();
        int opcion;
        
        do {
            System.out.println("MENU DE OPCIONES:");
            System.out.println("0 - SALIR");
            System.out.println("1 - Enciende");
            System.out.println("2 – Apaga");
            System.out.println("3 – Imprime estado");
            System.out.println("4 – Crea una nueva bombilla");
            System.out.println("Escoge una opción:");
            opcion = sc.nextInt();
            switch(opcion){
                case 0:
                    System.out.println("Adiós, guap@");
                    break;
                case 1:
                    b.encender();
                    break;
                case 2:
                    b.apagar();
                    break;
                case 3:
                    b.imprimeEstado();
                    break;
                case 4:
                    b = new BombillaCondicional();
                    break;
            }
        } while (opcion!=0);
        
    }
}
