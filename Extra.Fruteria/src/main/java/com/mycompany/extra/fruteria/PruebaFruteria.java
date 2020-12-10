package com.mycompany.extra.fruteria;

import java.util.Scanner;

public class PruebaFruteria {

    public static void main(String[] args) {
        Fruteria fru = new Fruteria();
        Scanner sc = new Scanner(System.in);
        fru.abreFruteria();

        Fruta platano = new Fruta();
        platano.setNombre("Platano");
        platano.setPrecioPorKg(1.25);
        fru.agregaFrutaDisponible(platano);

        Fruta fresa = new Fruta();
        fresa.setNombre("Fresa");
        fresa.setPrecioPorKg(2.85);
        fru.agregaFrutaDisponible(fresa);

        Fruta manzana = new Fruta();
        manzana.setNombre("Manzana");
        manzana.setPrecioPorKg(1.66);
        fru.agregaFrutaDisponible(manzana);

        Fruta mango = new Fruta();
        mango.setNombre("Mango");
        mango.setPrecioPorKg(4.05);
        fru.agregaFrutaDisponible(mango);

        System.out.println("MENU FRUTERIA");
        System.out.println("0 – Imprimir cierre de caja y cerrar el programa");
        System.out.println("1 – Mostrar fruta disponible");
        System.out.println("2 – Nuevo cliente");
        System.out.println("3 – Cliente solicita fruta");
        System.out.println("4 – Sacar el ticket al cliente");
        System.out.println("Marque el numero correspondiente:");
        int num = sc.nextInt();

        while (num != 0) {
            System.out.println("Marque el numero correspondiente:");
            num = sc.nextInt();
            switch (num) {
                case 0:
                    System.out.println("Total caja: " + fru.getTotalEnCaja() + " euros.");
                    break;
                case 1:
                    fru.mostrarFrutaDisponible();
                    break;
                case 2:
                    fru.nuevoCliente();
                    break;
                case 3:
                    System.out.println("Escriba el nombre de la fruta deseada:");
                    String limpieza = sc.nextLine();
                    String frutaDeseada = sc.nextLine();
                    System.out.println("Cuantos kilos quiere de esta fruta?");
                    double kilos = sc.nextDouble();
                    boolean hay = fru.clienteSolicitaFruta(frutaDeseada, kilos);
                    if (!hay) {
                        System.out.println("Lo siento, no nos queda");
                    }
                    break;
                case 4:
                    System.out.println("El total de su ticket es: " + fru.getTicketCliente() + " euros.");
                    break;
                default:
                    System.out.println("Número erroneo");
            }
        }
    }
}
