package com.mycompany.u2.e40.articulos;

import java.util.Scanner;

public class PruebaArticulo {

    public static void main(String[] args) {
        Articulo[] arr = new Articulo[5];

        arr[0] = new Articulo();
        arr[1] = new Articulo();
        arr[2] = new Articulo();
        arr[3] = new Articulo();
        arr[4] = new Articulo();

        arr[0].setIdArticulo(1);
        arr[1].setIdArticulo(2);
        arr[2].setIdArticulo(3);
        arr[3].setIdArticulo(4);
        arr[4].setIdArticulo(5);

        arr[0].setNombre("Pepino");
        arr[1].setNombre("Tomate");
        arr[2].setNombre("Lechuga");
        arr[3].setNombre("Aguacate");
        arr[4].setNombre("Patata");

        arr[0].setPrecio(2.5);
        arr[1].setPrecio(3.5);
        arr[2].setPrecio(1.56);
        arr[3].setPrecio(8.51);
        arr[4].setPrecio(2.13);

        Scanner sc = new Scanner(System.in);
        System.out.println("Que articulo buscamos? (del 1 al 5)");
        int idBuscado = sc.nextInt();
        
        int pos = -1;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i].getIdArticulo() == idBuscado) {
                System.out.println("Articulo con ID " + arr[i].getIdArticulo() + " es " + arr[i].getNombre()
                        + " y su precio es " + arr[i].getPrecio() + " euros.");
                pos = i;
                break;
            }

        }
        if (pos == -1) {
            System.out.println("Articulo no encontrado");
        }
    }
}
