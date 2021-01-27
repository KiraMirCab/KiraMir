package com.mycompany.u4.e3.pruebalistas;
import java.util.*;

public class PruebaListas {
    public static void main(String[] args) {
        List meses = Arrays.asList("Enero", "Febrero", "Marzo", "Abril", "Mayo", "Junio", "Julio", "Agosto", "Septiembre", "Octubre", "Noviembre", "Diciembre");
        if (meses.isEmpty()) {
            System.out.println("No hay elementos");
        } else {
            System.out.println("Hay cosillas");
        }
        
        System.out.println("El numero de elementos es " + meses.size());
        System.out.println("Contiene Henero?" + meses.contains("Henero"));
        
        Iterator iter = meses.iterator();

        
    }
}
