package es.tuespiral.u5.p2.ficherocheckedexception;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class PruebaFicheroThrowsCheckedException {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String linea = "";
        String nombre = "";
        List<String> texto = new ArrayList();

        System.out.println("Escribe texto. Para terminar escribe 'END':");

        do {
            linea = sc.nextLine();
            if (!linea.equalsIgnoreCase("END")) {
                texto.add(linea);
            }
        } while (!linea.equalsIgnoreCase("END"));

        System.out.println("Dime el nombre del fichero donde la guardo:");
        nombre = sc.nextLine();
        
        Fichero fich = new Fichero(nombre);
        fich.abreEscribeCierra(texto);
        
//        try {
//            Fichero fich = new Fichero(nombre);
//            fich.abrir();
//            fich.escribeTexto(texto);
//            fich.cerrar();
//
//        } catch (IOException ex) {
//            System.out.println("Ha surgido un problema al abrir o escribir las frases en el fichero");
//
//        }
    }
}
