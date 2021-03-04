package com.mycompany.prueba25feb;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

public class Articulos {

    Map<Integer, Articulo> diccionario;

    public Articulos() {
        diccionario = new HashMap<>();
    }

    public void agregaArticulo(Articulo a) {
        diccionario.put(a.getCodigo(), a);
    }

    public boolean contieneArticulo(Articulo a) {
        return diccionario.containsValue(a);
    }

    public List<Articulo> obtieneArticuloPorNombre(String nombre) {
        List<Articulo> aDevolver = new ArrayList<>();
        Iterator<Articulo> iter = diccionario.values().iterator();
        while (iter.hasNext()) {
            Articulo a = iter.next();
            if (a.getNombre().equals(nombre)) {
                aDevolver.add(a);
            }
        }
        return aDevolver;
    }

    public boolean borraArticulo(Articulo a) {
        return diccionario.remove(a.getCodigo(), a);
    }

    public void imprimeArticulos() {
        if (diccionario.isEmpty()) {
            System.out.println("No hay artículos que mostrar");
        } else {
            Iterator<Articulo> iter = diccionario.values().iterator();
            while (iter.hasNext()) {
                System.out.println(iter.next());
            }
        }
    }

    public double calculaTotalArticulo() {
        double total = 0;
        Iterator<Articulo> iter = diccionario.values().iterator();
        while (iter.hasNext()) {
            total += iter.next().getPrecio();
        }
        return total;
    }

    public List<Articulo> toList() {
        List<Articulo> aDevolver = new ArrayList<>();
        Iterator<Articulo> iter = diccionario.values().iterator();
        while (iter.hasNext()) {
            aDevolver.add(iter.next());
        }
        Collections.sort(aDevolver);
        return aDevolver;
    }

}
