package com.mycompany.u2.e30.dado3por6;

public class PruebaDado {

    public static void main(String[] args) {
        Dado d = new Dado();
        
        int contador=0;
        while (contador <3){
            int tirada = d.tirada();
            System.out.println(tirada);
            if (tirada == 6)
                contador++;
           }
        System.out.println("Lo has conseguido!");
    }
}

