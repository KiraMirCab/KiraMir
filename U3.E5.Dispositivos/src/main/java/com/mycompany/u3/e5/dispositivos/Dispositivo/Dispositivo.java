package com.mycompany.u3.e5.dispositivos.Dispositivo;

import java.util.Objects;

public abstract class Dispositivo {

    private String marca, modelo;
    private boolean encendido;

    public Dispositivo(String marca, String modelo) {
        this.marca = marca;
        this.modelo = modelo;
    }

    
    public void encender() {
        if (encendido) {
            System.out.println("Ya está encendido.");
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

    @Override
    public String toString() {
        return "Dispositivo{" + "marca=" + marca + ", modelo=" + modelo + ", encendido=" + encendido + '}';
    }

    @Override
    public int hashCode() {
        int hash = 7;
        hash = 83 * hash + Objects.hashCode(this.marca);
        hash = 83 * hash + Objects.hashCode(this.modelo);
        hash = 83 * hash + (this.encendido ? 1 : 0);
        return hash;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        final Dispositivo other = (Dispositivo) obj;
        if (this.encendido != other.encendido) {
            return false;
        }
        if (!Objects.equals(this.marca, other.marca)) {
            return false;
        }
        if (!Objects.equals(this.modelo, other.modelo)) {
            return false;
        }
        return true;
    }

    public abstract void resetContadores();
}
