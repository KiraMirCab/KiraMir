package es.tuespiral.u2.e41.carrito;

public class Carrito {

    public Articulo[] carrito;
    public int numArticulos; // Cuenta cuántos artículos hay en el carro
    // Indica la siguiente posición libre del array

    public boolean inicializado;

//+ inicializaCarrito (numPosiciones: entero)
    public void inicializaCarrito(int numPosiciones) {
        carrito = new Articulo[numPosiciones];
        numArticulos = 0;
        inicializado = true;
    }

//+ getNumArticulos () devuelve entero
    public int getNumArticulos() {
        return numArticulos;
    }

//+ guardaArticulo (nuevoArtic: Articulo)
    public void guardaArticulo(Articulo nuevoArtic) {
        if (inicializado == false) {
            System.out.println("Error: carrito no inicializado");
        } else {
            if (numArticulos >= carrito.length) {
                System.out.println("Error: el carrito está lleno");
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

//+ muestraArticulos ()
    public void muestraArticulos() {
        if (inicializado == false) {
            System.out.println("Error: carrito no inicializado");
        } else {
            if (numArticulos == 0) {
                System.out.println("No hay artículos en el carro");
            } else {
                for (int i=0; i<carrito.length; i++) {
                    Articulo elem = carrito[i];
                    System.out.println("Id=" + elem.getIdArticulo() + ", nombre="
                            + elem.getNombre() + ", precio=" + elem.getPrecio()+"€");
                }                
            }
        }
    }

//+ getPrecioTotalCarrito () devuelve real
    public double getPrecioTotalCarrito() {
        double result = 0;
        double total = 0;
        
        if (inicializado == false) {
            System.out.println("Error: carrito no inicializado");
        } else {
            if (numArticulos != 0) {
                for (int i=0; i<numArticulos; i++) {
                    Articulo elem = carrito[i];
                    total = total + elem.getPrecio();
                }
                result = total;
            }
        }
        return result;
    }

//+ buscaArticuloPorId (idABuscar: entero) devuelve Articulo
    public void muestraArticulos(int numInicial, int numFinal) {
    }
    
    public Articulo buscaArticuloPorId(int idABuscar) {
        if (inicializado == false) {
            System.out.println("Error: carrito no inicializado");
            return Articulo.NOT_FOUND;
        } else {
            if (numArticulos == 0) {
                return Articulo.NOT_FOUND;
            } else {
                for (int i=0; i<numArticulos; i++) {
                    Articulo elem = carrito[i];
                    if (elem.getIdArticulo() == idABuscar) {
                        return elem;
                    }
                }
                return Articulo.NOT_FOUND;
            }
        }
    }

}
