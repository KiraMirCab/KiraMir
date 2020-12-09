package com.mycompany.cajacompleja;

public class PruebaCajaCompleja {
    public static void main(String[] args) {
        CajaCompleja caja;
        caja = new CajaCompleja();

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
        caja.anularArticulo(2.48);
        caja.imprimirTicketCliente();
        
        caja.imprimeCierreCaja();

    }
}
