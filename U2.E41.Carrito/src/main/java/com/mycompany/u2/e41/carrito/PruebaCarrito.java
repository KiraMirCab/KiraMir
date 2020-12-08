package com.mycompany.u2.e41.carrito;

public class PruebaCarrito {
    public static void main(String[] args) {
        Carrito car = new Carrito();
        car.buscaArticuloPorId(4);
        
        car.inicializaCarrito(5);
        car.muestraArticulos();
        
        Articulo a = new Articulo();
        a.setIdArticulo(1);
        a.setNombre("Matamoscas");
        a.setPrecio(0.85);
       
        car.guardaArticulo(a);
        
        car.guardaArticulo(Articulo.NOT_FOUND);
        
        a = new Articulo();
        a.setIdArticulo(123);
        a.setNombre("Ratón");
        a.setPrecio(10);
        
        car.guardaArticulo(a);
        
        a = new Articulo();
        a.setIdArticulo(3);
        a.setNombre("Teclado");
        a.setPrecio(15);
        
        car.guardaArticulo(a);
       
        a = new Articulo();
        a.setIdArticulo(4);
        a.setNombre("Monitor");
        a.setPrecio(150);
        
        car.guardaArticulo(a);
        
        car.muestraArticulos();
        Articulo art = car.buscaArticuloPorId(8564);
        System.out.println("El nombre del articulo buscado es " + art.getNombre());
        
        
    }
}
