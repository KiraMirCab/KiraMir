package com.mycompany.prueba25feb;

public class PruebaArticulos {
    public static void main(String[] args) {
        Articulo a1 = new Articulo(1, "Libro tonto", 5.10);
        Articulo a2 = new Articulo(2, "Libro bonito", 4.40);
        Articulo a3 = new Articulo(3, "Libro tonto", 7.10);
        Articulo a4 = new Articulo(4, "Libro fantastico", 12.00);
        Articulos tienda = new Articulos();
        tienda.imprimeArticulos();
        System.out.println("La tienda contiene el 'Libro fantastico'? " + tienda.contieneArticulo(a4));
        System.out.println("Borramos el Libro fantastico que todavia no esta en la tienda: " + tienda.borraArticulo(a4));
        System.out.println("El total de los articulos en la tienda vacia es: " + tienda.calculaTotalArticulo());
        System.out.println("Intentamos buscar el 'Libro tonto' por el nombre en una tienda vacia: " + tienda.obtieneArticuloPorNombre("Libro tonto"));
        System.out.println("Lista de articulos ordenada con la tienda vacia: " + tienda.toList());
        
        tienda.agregaArticulo(a1);
        tienda.agregaArticulo(a2);
        tienda.agregaArticulo(a3);
        tienda.agregaArticulo(a4);
        
        System.out.println("-----------------------------");
        System.out.println("La tienda contiene el Libro fantastico? " + tienda.contieneArticulo(a4));
        System.out.println("Borramos el 'Libro fantastico': " + tienda.borraArticulo(a4));
        System.out.println("Comprobamos que ya no esta en la tienda: ");
        tienda.imprimeArticulos();
        System.out.println("El total de los articulos en la tienda es: " + tienda.calculaTotalArticulo());
        System.out.println("Buscamos el 'Libro tonto' por el nombre y mostramos la lista con los dos 'Libros Tontos': " + tienda.obtieneArticuloPorNombre("Libro tonto"));
        System.out.println("Lista de articulos ordenada ascendientemente: " + tienda.toList());
    }
}
