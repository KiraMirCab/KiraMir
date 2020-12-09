package com.mycompany.cajaregistradora;

public class PruebaCajaRegistradora {

    public static void main(String[] args) {
        CajaRegistradora caja;
        caja = new CajaRegistradora();

        caja.abrirCaja();
        caja.nuevoCliente();
        caja.registrarArticulo(12.95);
        caja.registrarArticulo(2.48);
        caja.registrarArticulo(20.06);
        caja.imprimirTicketCliente();

        caja.nuevoCliente();
        caja.registrarArticulo(5.95);
        caja.registrarArticulo(2.48);
        caja.registrarArticulo(2.48);
        caja.registrarArticulo(7.88);
        caja.imprimirTicketCliente();

    }
}
