
package com.mycompany.cajacompleja;


public class CajaCompleja {
    public double importeCliente;
    public int numArticulosCliente;
    public int numClientesAtendidos;
    public double importeTotalCaja;
    public int numArticulosVendidos;
    
    public void abrirCaja() {
        numArticulosCliente = 0;
        numArticulosCliente = 0;
        numClientesAtendidos = 0;
        numArticulosVendidos = 0;
        importeTotalCaja = 0;   
    }

    public void nuevoCliente() {
        importeCliente = 0;
        numArticulosCliente = 0;
        numClientesAtendidos = numClientesAtendidos + 1;
    }

    public void registrarArticulo(double precio) {
        numArticulosCliente = numArticulosCliente + 1;
        importeCliente = importeCliente + precio;
        importeTotalCaja = importeTotalCaja + precio;
        numArticulosVendidos = numArticulosVendidos + 1;
    }
    
    public void anularArticulo(double precio) {
        numArticulosCliente = numArticulosCliente - 1;
        numArticulosVendidos = numArticulosVendidos -1;
        importeCliente = importeCliente - precio;
        importeTotalCaja = importeTotalCaja - precio;
    }

    public void imprimirTicketCliente() {
        System.out.println("El cliente ha comprado " + numArticulosCliente + " artículos por un precio total de " + importeCliente + " euros.");
    }
    public void imprimeCierreCaja() {
        System.out.println("Se han vendido un total de " + numArticulosVendidos + " artículos por un precio total de " + importeTotalCaja + " euros.");
    }
}



