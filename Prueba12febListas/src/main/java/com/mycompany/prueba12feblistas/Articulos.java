package com.mycompany.prueba12feblistas;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;

public class Articulos {

    private List listaArt;

    public Articulos() {
        listaArt = new ArrayList();
    }

    public void agregaArticulo(Articulo a) {
        listaArt.add(a);
    }

    public boolean contieneArticulo(Articulo a) {
        return listaArt.contains(a);
    }

    public boolean borraArticulo(Articulo a) {
        return listaArt.remove(a);
    }

    public void imprimeArticulos() {
        if (!listaArt.isEmpty()) {
            Iterator iter = listaArt.iterator();
            while (iter.hasNext()) {
                System.out.println(iter.next());
            }
        } else {
            System.out.println("No hay artículos que mostrar");
        }
    }

    public void ordenaArticulos() {
        Collections.sort(listaArt);
    }

    public double calculaTotalArticulo() {
        double suma = 0.0;
        Articulo elem;
        Iterator iter = listaArt.iterator();
        while (iter.hasNext()) {
            elem = (Articulo) iter.next();
            suma += elem.getPrecio();
        }
        return suma;
    }

}
