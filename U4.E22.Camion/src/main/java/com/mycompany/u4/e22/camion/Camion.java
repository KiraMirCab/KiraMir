package com.mycompany.u4.e22.camion;

public class Camion<T> {

    private T carga;

    public void cargar(T objeto) {
        carga = objeto;
    }

    public T descargar(T objeto) {
        T aux = carga;
        carga = null;
        return aux;
    }

    public boolean isCargado() {
        return carga == null;
    }

    public double getKilosCarga() {
        if (carga != null) {
            Pesable p = (Pesable) carga;
            return p.getPeso();
        } else {
            return 0.0;
        }
    }
}
