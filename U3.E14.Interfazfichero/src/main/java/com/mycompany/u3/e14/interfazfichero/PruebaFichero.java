package com.mycompany.u3.e14.interfazfichero;

public class PruebaFichero {

    public static void main(String[] args) {
        InterfazFichero f = new Fichero();
        f.setNombre("Lista de compra");
        f.agregaContenido("1. Patatata, 2. Tomate, 3. Zanahoria, 4. Salchichas...");
        f.abrir();
        f.agregaContenido("1. Patatata, 2. Tomate, 3. Zanahoria, 4. Salchichas...");
        System.out.println("El tamaño del fichero es: " + f.getTamanioEnBytes() + " bytes");
        f.setCodificacion("UTF-16");
        f.borraContenido();
        f.agregaContenido("Blu-bli-bla");
        System.out.println("El tamaño del fichero es: " + f.getTamanioEnBytes() + " bytes");
        f.borraContenido();
        f.setCodificacion("patata");
        f.agregaContenido("Blu-bli-bla");
        System.out.println("El tamaño del fichero es: " + f.getTamanioEnBytes() + " bytes");
    }
}
