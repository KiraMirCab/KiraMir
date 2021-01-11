package com.mycompany.jamazonreto;

public class Carrito {

    private Articulo[] arr;
    private int contador = 0;

    public void inicializarCarrito() {
        arr = new Articulo[5];
        contador = 0;
    }

    public void aniadirArticulo(Articulo a) {
        if (contador >= arr.length) {
                System.out.println("Error: no caben más articulos en el carrito");
            } else {
                if (a == Articulo.NOT_FOUND) {
                    System.out.println("Error: no se puede guardar la marca de NO ENCONTRADO");
                } else {
                    arr[contador] = a;
                    contador++;
                }
            }
    }

    public void mostrarCarrito() {
        System.out.println("Tienes " + contador + " elementos en le carrito");
        for (int i = 0; i < contador; i++) {
            System.out.println("Artículo: " + arr[i].getNombre() + ". Precio: " + arr[i].getPrecio() + " euros");
        }
    }

    public double calcularImporteTotal() {
        double total = 0;
        for (int i = 0; i < contador; i++) {
            total += arr[i].getPrecio();
        }
        return total;
    }

    public int getContador() {
        return contador;
    }

}
