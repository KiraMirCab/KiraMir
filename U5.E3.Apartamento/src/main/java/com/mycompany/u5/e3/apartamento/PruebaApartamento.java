package com.mycompany.u5.e3.apartamento;

public class PruebaApartamento {

    public static void main(String[] args) {
        
        try {
            Apartamento a = new Apartamento("Calle Bananas 25", 3, 6);
            a.liberar();
        } catch (IllegalStateException ex) {
            System.out.println(ex);
        }

        try {
            Apartamento a1 = new Apartamento(null, 3, 6);
        } catch (NullPointerException ex) {
            System.out.println(ex);
        }
        
        try {
            Apartamento a2 = new Apartamento("Calle Bananas 25", 58, 6);
        } catch (IllegalArgumentException ex) {
            System.out.println(ex);
        }

        try {
          Apartamento a = new Apartamento("Calle Bananas 25", 3, 6);
          a.ocupar();
          a.ocupar();
        } catch (IllegalStateException ex) {
            System.out.println(ex);
        }
    }
}
