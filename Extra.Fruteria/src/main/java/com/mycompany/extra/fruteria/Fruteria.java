package com.mycompany.extra.fruteria;

public class Fruteria {

    public Fruta[] existencias;
    public int numFrutasDisponible;
    public double ticketCliente;
    public double totalEnCaja;

    public void abreFruteria() {
        existencias = new Fruta[100];
        numFrutasDisponible = 0;
        ticketCliente = 0;
        totalEnCaja = 0;
    }

    public void agregaFrutaDisponible(Fruta f) {
        existencias[numFrutasDisponible] = f;
        numFrutasDisponible++;
    }

    public void nuevoCliente() {
        ticketCliente = 0;
    }

    public boolean clienteSolicitaFruta(String nombreFruta, double numKilos) {
        for (int i = 0; i < numFrutasDisponible; i++) {
            if (existencias[i].getNombre().equalsIgnoreCase(nombreFruta)) {
                double precioPosicion = existencias[i].getPrecioPorKg() * numKilos;
                ticketCliente += precioPosicion;
                totalEnCaja += precioPosicion;
                return true;
            } 
        }
        return false;
    }

    public double getTicketCliente() {
        return ticketCliente;
    }

    public double getTotalEnCaja() {
        return totalEnCaja;
    }

    public void mostrarFrutaDisponible() {
        for (int i = 0; i < numFrutasDisponible; i++) {
            System.out.println("Fruta: " + existencias[i].getNombre() + ". Precio: " + existencias[i].getPrecioPorKg() + " euros por kilo.");
        }
    }
}
