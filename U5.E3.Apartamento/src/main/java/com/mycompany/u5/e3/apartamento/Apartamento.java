package com.mycompany.u5.e3.apartamento;

public class Apartamento {
    // su dirección postal, el número de habitaciones,
//el número de camas de las que dispone, si está actualmente ocupado o libre
    private String dirPostal;
    private int numHab, numCamas;
    private boolean ocupado;

    public Apartamento(String dirPostal, int numHab, int numCamas) {
        if (dirPostal == null) {
            throw new NullPointerException ("Que no me vale la dirección nula, tío");
        }
        if (numHab < 0 || numHab > 15 || numCamas < 0 || numCamas > 50) {
            throw new IllegalArgumentException ("Que no puede ser, hombre");
        }
        this.dirPostal = dirPostal;
        this.numHab = numHab;
        this.numCamas = numCamas;
       
    }

      public void ocupar () {
        if (ocupado) {
             throw new IllegalStateException("Ya está ocupado");
         }
          ocupado = true;
    }
    
     public void liberar () {
         if (!ocupado) {
             throw new IllegalStateException("Ya está libre");
         }
         ocupado = false;
    }
    
}
