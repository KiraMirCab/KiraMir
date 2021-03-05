package com.mycompany.u5.extra.nombres;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;

public class NombresUnicos {

    List<String> lista;

    public NombresUnicos() {
        lista = new ArrayList();
    }

    public void agregaNombre(String nombre) throws NombreDuplicadoException {
        if (nombre != null) {
            Iterator<String> iter = lista.iterator();
            while (iter.hasNext()) {
                String elem = iter.next();
                if (elem.equalsIgnoreCase(nombre)) {
                    throw new NombreDuplicadoException("No se admiten nombres duplicados");
                }
            }
            lista.add(nombre);
        }
    }

    public void ordenaNombres() {
        Collections.sort(lista);
    }

    public void iprimeNombres() {
        Iterator<String> iter = lista.iterator();
        int i = 1;
        while (iter.hasNext()) {
            System.out.println(i + " " + iter.next());
        }
    }

    public boolean contiene(String nombre) {
        Iterator<String> iter = lista.iterator();
        while (iter.hasNext()) {
            String elem = iter.next();
            if (elem.equalsIgnoreCase(nombre)) {
                return true;
            }
        }
        return false;
    }
}
