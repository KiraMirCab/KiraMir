package com.mycompany.prueba12feblistas;

public class PruebaArticulos {

    public static void main(String[] args) {
        Articulos tienda = new Articulos();
        Articulo a1 = new Articulo("Batidora", 19.99);
        Articulo a2 = new Articulo("Sarten", 14.99);
        Articulo a3 = new Articulo("Espumadera", 5.99);

        tienda.agregaArticulo(a1);
        tienda.agregaArticulo(a2);
        tienda.agregaArticulo(a3);
        
        tienda.imprimeArticulos();
        System.out.println("--------------------");
        
        System.out.println("Ordenamos la tienda segun el precio de los articulos:");
        tienda.ordenaArticulos();
        tienda.imprimeArticulos();
        System.out.println("--------------------");
        
        System.out.println("El precio total de los articulos es: ");
        System.out.println(tienda.calculaTotalArticulo());
        System.out.println("--------------------");

        System.out.println("La tienda tiene Batidora?");
        if (tienda.contieneArticulo(a1)) {
            System.out.println("Si, la tiene. La borramos.");
            tienda.borraArticulo(a1);
        }
        System.out.println("--------------------");
        System.out.println("Los articulos que quedan son: ");
        tienda.imprimeArticulos();

    }

}
