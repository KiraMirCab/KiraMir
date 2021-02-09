package com.mycompany.u4.e19.clientepedido;

import java.util.*;


public class Cliente {
    public static void main(String[] args) {
        Set <Pedido> pedidos = new HashSet<>();
        Iterator <Pedido> iter = pedidos.iterator();
        
        List <Articulo> articulos = new ArrayList<>();
        Iterator <Articulo> iter = articulos.iterator();
        while (iter.hasNext()){
            Articulo ar = iter.next();
            System.out.println(ar);
        }
        
        Map <String, Articulo> diccionario = new HashMap<>();
        Iterator <String> iter = diccionario.keySet().iterator();
        while (iter.hasNext()){
            System.out.println(iter.next());
        }
    }
}
