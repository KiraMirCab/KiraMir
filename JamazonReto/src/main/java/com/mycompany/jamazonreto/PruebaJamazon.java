package com.mycompany.jamazonreto;

import java.util.Scanner;

public class PruebaJamazon {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Carrito c = new Carrito();
        c.inicializarCarrito();
        int i;
        
        do {
            System.out.println("MENU DE OPCIONES");
            System.out.println("0 - Salir");
            System.out.println("1 - Mostrar el contenido del carrito");
            System.out.println("2 - Mostrar el importe total del carrito");
            System.out.println("3 - Añadir un articulo al carrito");
            System.out.println("4 - Finalizar compra y pagar");
            System.out.println("Elige una opción:");

            i = sc.nextInt();
            
            switch (i) {
                case 0:
                    break;
                case 1:
                    c.mostrarCarrito();
                    break;
                case 2:
                    System.out.println("Tienes "+c.getContador()+" artículos con un importe total de "+c.calcularImporteTotal()+" euros");
                    break;
                case 3:
                    Articulo a = new Articulo();
                    System.out.println("Dime el nombre del articulo (Ejemplo: Pendrive):");
                    String limpieza = sc.nextLine();
                    String nombre = sc.nextLine();
                    a.setNombre(nombre);
                    System.out.println("Dime el precio del articulo (Ejemplo: 9.99):");
                    double precio = sc.nextDouble();
                    a.setPrecio(precio);
                    c.aniadirArticulo(a);
                    break;
                case 4:
                    System.out.println("Vas a comprar "+c.getContador()+" artículos por un importe total de "+c.calcularImporteTotal()+"euros");
                    System.out.println("¿Estás seguro? (responde S para Sí y N para no)");
                    String limpieza2 = sc.nextLine();
                    String respuesta = sc.nextLine();
                    if (respuesta.equalsIgnoreCase("S")) {
                        System.out.println("Hemos cargado "+c.calcularImporteTotal()+"euros a tu cuenta");
                        System.out.println("En los próximos días recibirás tu compra");
                        c.inicializarCarrito();
                        System.out.println("El carrito vuelve a estar vacío");
                    }
                    break;
                default:
                    System.out.println("Número incorrecto. Intenta de nuevo");
                    break;
            }

        } while (i != 0);

    }
}
