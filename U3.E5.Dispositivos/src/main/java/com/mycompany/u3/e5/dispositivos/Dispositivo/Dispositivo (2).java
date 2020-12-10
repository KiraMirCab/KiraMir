package com.mycompany.u3.e5.dispositivos.Dispositivo;

public class Dispositivo {

    private String marca, modelo;
    private boolean encendido;

    public void encender() {
        if (encendido) {
            
        } else {
            encendido = true;
        }
    }

    public void apagar() {
        if (!encendido) {
            System.out.println("Ya estaba apagado");
        } else {
        encendido = false;
        }
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public boolean isEncendido() {
        return encendido;
    }

    public void setEncendido(boolean encendido) {
        this.encendido = encendido;
    }

}
