package com.mycompany.u3.e12.interfaz;

public class Documento implements InterfazDocumento {
    private String titulo, contenido;
    private int NumPaginasImpresion;
    
    @Override
    public String getTitulo() {
        return titulo;
    }

    @Override
    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    @Override
    public String getContenido() {
      return contenido;  
    }

    @Override
    public void setContenido(String contenido) {
       this.contenido = contenido;
    }

    @Override
    public int getNumPaginasImpresion() {
      return NumPaginasImpresion;
    }

    @Override
    public void setNumPaginasImpresion(int numPaginas) {
      this.NumPaginasImpresion = numPaginas;
    }
    
}
