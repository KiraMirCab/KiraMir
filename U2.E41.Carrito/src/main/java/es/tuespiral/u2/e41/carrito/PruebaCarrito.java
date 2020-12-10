package es.tuespiral.u2.e41.carrito;

import java.util.Scanner;

public class PruebaCarrito {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Carrito car = new Carrito();
        car.inicializaCarrito(5);
        
        Articulo a = new Articulo();
        a.setIdArticulo(12312);
        a.setNombre("Reloj");
        a.setPrecio(12);
        
        car.guardaArticulo(Articulo.NOT_FOUND);
        
        a = new Articulo();
        a.setIdArticulo(0);
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
        
        
        
        System.out.println("El número de artículo en el carro es: "+car.getNumArticulos());
        System.out.println("El importe total del carro es: "+car.getPrecioTotalCarrito());
        System.out.println("Los artículos del carro actualmente son:");
        car.muestraArticulos();
        
        // PEDIR AL USUARIO QUÉ BUSCAMOS
        System.out.println("Dime qué identificador de artículo buscas: ");
        int idBuscado = sc.nextInt();
                
        Articulo elem = car.buscaArticuloPorId(idBuscado);
        if (elem == Articulo.NOT_FOUND) {
            System.out.println("Artículo no encontrado");
        }
        else {
            System.out.println("Id="+elem.getIdArticulo()+", nombre="+
                    elem.getNombre()+", precio="+elem.getPrecio()+"€");
        }
        
        
    }
}
