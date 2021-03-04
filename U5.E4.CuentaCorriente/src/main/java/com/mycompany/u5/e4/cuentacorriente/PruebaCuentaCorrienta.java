package com.mycompany.u5.e4.cuentacorriente;

public class PruebaCuentaCorrienta {
    public static void main(String[] args) {
        try {
            CuentaCorriente c = new CuentaCorriente(0, 1235456945682365L, "oliiii");
        } catch (IllegalArgumentException ex) {
            System.out.println(ex);
        }
        
        try {
            CuentaCorriente c = new CuentaCorriente(0, 1235456945682365L, "5846874");
        } catch (IllegalArgumentException ex) {
            System.out.println(ex);
        }
        
        try {
            CuentaCorriente c = new CuentaCorriente(0, 1235456945682365L, "543");
        } catch (IllegalArgumentException ex) {
            System.out.println(ex);
        }
        
        try {
            CuentaCorriente c = new CuentaCorriente(0, 1235456945682365L, "3568");
            c.ingresa(-2500.0);
        } catch (IllegalArgumentException ex) {
            System.out.println(ex);
        }
        
        try {
            CuentaCorriente c = new CuentaCorriente(0, 1235456945682365L, "3568");
            c.ingresa(2500.0);
            c.abona(0);
        } catch (IllegalArgumentException ex) {
            System.out.println(ex);
        }
        
    }
}
