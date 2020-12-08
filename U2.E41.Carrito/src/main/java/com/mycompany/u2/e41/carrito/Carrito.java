package com.mycompany.u2.e41.carrito;

public class Carrito {

    public Articulo[] carrito;
    public int numArticulos;
    public boolean inicializado;

    public void inicializaCarrito(int numPosiciones) {
        carrito = new Articulo[numPosiciones];
        inicializado = true;
    }

    public int getNumArticulos() {
        return numArticulos;
    }

    public void guardaArticulo(Articulo nuevoArtic) {

        if (!inicializado) {
            System.out.println("Error: carrito aún no inicializado");
        } else {
            if (numArticulos == carrito.length) {
                System.out.println("Error: carrito lleno");
            } else {
                if (nuevoArtic == Articulo.NOT_FOUND) {
                    System.out.println("Error: no se puede guardar la marca de NO ENCONTRADO");
                } else {
                    carrito[numArticulos] = nuevoArtic;
                    numArticulos++;
                }
            }

        }
    }

    public void muestraArticulos() {
        System.out.println(carrito.length);
        if (!inicializado) {
            System.out.println("Error: carrito aún no inicializado");
        } else {
            if (numArticulos == 0) {
                System.out.println("No hay artículos en el carrito");
            } else {
                for (int i=0; i<numArticulos; i++) {
                    System.out.println("Id = " + carrito[i].getIdArticulo() + ", nombre = " + carrito[i].getNombre()
                            + ", precio = " + carrito[i].getPrecio() + "€");
                    
                }
            }
        }
    }

    public Articulo buscaArticuloPorId(int idABuscar) {
        if (!inicializado) {
            System.out.println("Error: carrito aún no inicializado");
            return Articulo.NOT_FOUND;
        } else {
            for (int i=0;i<numArticulos;i++) {
                if (carrito[i].getIdArticulo() == idABuscar) {
                    return carrito[i];
                }
            }
            return Articulo.NOT_FOUND;
        }
    }

    public double getPrecioTotalCarrito() {

        if (!inicializado) {
            System.out.println("Error: carrito aún no inicializado");
            return -1.0;
        } else {

            if (numArticulos == 0) {
                return 0.0;
            } else {
                double suma = 0;
                for (Articulo articulo : carrito) {
                    suma += articulo.getPrecio();
                }
                return suma;
            }

        }

    }
}

