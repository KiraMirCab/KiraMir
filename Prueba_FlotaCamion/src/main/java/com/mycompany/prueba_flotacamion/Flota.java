package com.mycompany.prueba_flotacamion;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;
import java.util.logging.Level;
import java.util.logging.Logger;

public class Flota {

    private Set<Camion> flota;

    public Flota() {
        flota = new HashSet();
    }
    
    public void altaCamion(Camion c) {
        flota.add(c);
    }
    
    public boolean contieneCamion(Camion c) {
        return flota.contains(c);
    }
    
    public boolean bajaCamion (Camion c) {
        return flota.remove(c);
    }
    
    public void imprimeFlota() {
        int i = 1;
        Iterator <Camion> iter = flota.iterator();
        while (iter.hasNext()) {
            System.out.println(i + " - " + iter.next());
            i++;
        }
    }
    
    public void ponerFlotaenRuta() {
        Iterator <Camion> iter = flota.iterator();
        while (iter.hasNext()) {
           Camion c = iter.next();
            try {
                c.realizaRuta();
                System.out.println("En ruta: " + c);
            } catch (RevisionPendienteException ex) {
                System.out.println("Pendiente revision: " + c);
            } catch (DepositoIncompletoException ex) {
                System.out.println("Deposito Incompleto: " + c);
            }
        }
    }
}
