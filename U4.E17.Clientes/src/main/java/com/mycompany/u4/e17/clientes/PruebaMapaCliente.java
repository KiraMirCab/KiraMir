package com.mycompany.u4.e17.clientes;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

public class PruebaMapaCliente {
    public static void main(String[] args) {
        Map clientes = new HashMap();
        Cliente c1 = new Cliente(28374648, "Juan", "Malvado");
        Cliente c2 = new Cliente(8546, "Antonia", "Patato");
        Cliente c3 = new Cliente(987456, "Ángela", "Buboni");
        
        clientes.put(c1.getIdCliente(), c1);
        clientes.put(c2.getIdCliente(), c2);
        clientes.put(c3.getIdCliente(), c3);
        
        Set claves = clientes.keySet();
        Iterator iter = claves.iterator();
        while (iter.hasNext()) {
        int idCliente = (int)iter.next();
            System.out.println(clientes.get(idCliente));
        }
        
        clientes.remove(8546);
        
        c3 = (Cliente) clientes.get(28374648);
        c3.setNombre("Manuel");
        clientes.put(c3.getIdCliente(), c3);
        
        iter = claves.iterator();
        while (iter.hasNext()) {
        int idCliente = (int)iter.next();
            System.out.println(clientes.get(idCliente));
        }
        
        
    }
}
