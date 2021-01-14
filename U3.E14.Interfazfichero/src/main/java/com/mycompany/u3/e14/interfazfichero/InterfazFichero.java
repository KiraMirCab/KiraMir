package com.mycompany.u3.e14.interfazfichero;

public interface InterfazFichero {

    String getNombre();

    void setNombre(String nombre);

    void setCodificacion(String codificacion);

    String getCodificacion();

    void abrir();

    void cerrar();

    void borraContenido();

    void agregaContenido(String contenido);

    String getContenido();

    int getTamanioEnBytes();

}
