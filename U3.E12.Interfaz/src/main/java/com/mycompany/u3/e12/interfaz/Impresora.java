package com.mycompany.u3.e12.interfaz;

public class Impresora implements InterfazImpresora {

    private String marca, modelo, estado;
    private boolean encendido;
    private int numFoliosBandeja;

    @Override
    public String getMarca() {
        return marca;
    }

    @Override
    public String getModelo() {
        return modelo;
    }

    @Override
    public void encender() {
        encendido = true;
        estado = "OK";
    }

    @Override
    public void apagar() {
        encendido = false;
        estado = "Fuera de servicio";
    }

    @Override
    public void cargarBandeja(int numFolios) {
        numFoliosBandeja += numFolios;
    }

    @Override
    public void imprimir(InterfazDocumento documento) {
        //if si est'a encendida
        if (numFoliosBandeja < documento.getNumPaginasImpresion()) {
            System.out.println("Error: no hay suficiente papel para imprimir el documento " + documento.getTitulo());
            estado = "Falta papel";
        } else {
            System.out.println("Se está imprimiendo el documento " + documento.getTitulo() + " que ocupa " + documento.getNumPaginasImpresion() + " páginas");
            numFoliosBandeja -= documento.getNumPaginasImpresion();
            estado = "OK";
        }
    }

    @Override
    public String getEstado() {
        if (encendido) {
            return estado;
        } else {
            return "Fuera de servicio";
        }

    }

    public Impresora(String marca, String modelo) {
        this.marca = marca;
        this.modelo = modelo;
    }

    
}
