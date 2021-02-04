package com.mycompany.u4.e16.biblioteca;
import java.util.*;

public class PruebaRecursos {
    public static void main(String[] args) {
        Set recursos = new HashSet();
        
        Autor kf = new Autor("Ken", "Follet", "britanico");
        Recurso l1 = new Recurso("9788401328510", "Los pilares de la tierra", kf, 10);
        recursos.add(l1);
        
        Autor iF = new Autor("Ildefonso", "Falcones", "español");
        Recurso l2 = new Recurso("9788499088044", "La catedral del mar", iF, 8);
        recursos.add(l2);
        
        Autor hfl = new Autor("Howard Phillips", "Lovecraft", "estadounidense");
        Autor ad = new Autor("Alexandre", "Dumas", "francés");
        Recurso l3 = new Recurso("9788417244712", "Los mejores cuentos para leer a media noche", hfl, 3);
        l3.meterAutor(ad);
        recursos.add(l3);
        
        Iterator iter = recursos.iterator();
        while (iter.hasNext()) {
            System.out.println(iter.next());
        }
    }
}
