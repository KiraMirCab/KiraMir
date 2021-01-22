package com.mycompany.u3.e14.interfazfichero2;

public class Fichero implements InterfazFichero {

    private String nombre = "", codificacion = "UTF-8", contenido;
    private boolean abierto;
    int TamanioEnBytes;

    @Override
    public String getNombre() {
        return nombre;
    }

    @Override
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    @Override
    public void setCodificacion(String codificacion) {
        this.codificacion = codificacion;
    }

    @Override
    public String getCodificacion() {
        return codificacion;
    }

    @Override
    public void abrir() {
        if (!"".equals(nombre)) {
            abierto = true;
        } else {
            System.out.println("Primero hay que poner el nombre al fichero");
        }
    }

    @Override
    public void cerrar() {
        abierto = false;
    }

    @Override
    public void borraContenido() {
        if (abierto) {
            contenido = "";
        } else {
            System.out.println("Abre el fichero primero");
        }
        TamanioEnBytes = 0;
    }

    @Override
    public void agregaContenido(String contenidoNuevo) {
        if (abierto) {
            contenido += contenidoNuevo;
            
            if (codificacion.equalsIgnoreCase("UTF-16")) {
                TamanioEnBytes = contenido.length() * 2;
            } else {
                TamanioEnBytes = contenido.length();
            }
        } else {
            System.out.println("Abre el fichero primero, hombre");
        }

    }

    @Override
    public String getContenido() {
        if (abierto) {
            return contenido;
        } else {
            System.out.println("Abre el fichero primero, hombre");
            return "";
        }
    }

    @Override
    public int getTamanioEnBytes() {
        return TamanioEnBytes;
    }

}
