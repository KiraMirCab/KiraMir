package com.mycompany.interfazgrafica;

public class Ventana implements Redimensionable{
    private int posX, posY;
    private int pixelsAltura, pixelsAnchura;
    private String contenido;
    private boolean visible;

    public int getPosX() {
        return posX;
    }

    public void setPosX(int posX) {
        this.posX = posX;
    }

    public int getPosY() {
        return posY;
    }

    public void setPosY(int posY) {
        this.posY = posY;
    }

    public String getContenido() {
        return contenido;
    }

    public void setContenido(String contenido) {
        this.contenido = contenido;
    }

    public Ventana(int posX, int posY, int pixelsAltura, int pixelsAnchura) {
        this.posX = posX;
        this.posY = posY;
        this.pixelsAltura = pixelsAltura;
        this.pixelsAnchura = pixelsAnchura;
    }
    
    public void ocultar(){
        visible = false;
    }
    
     public void mostrar(){
        visible = true;
    }
            
    @Override
    public void setAltura(int pixelsAltura) {
        this.pixelsAltura = pixelsAltura;
    }

    @Override
    public void setAnchura(int pixelsAnchura) {
        this.pixelsAnchura = pixelsAnchura;
    }

    @Override
    public void setDimension(int pixelsAltura, int pixelsAnchura) {
        this.pixelsAltura = pixelsAltura;
        this.pixelsAnchura = pixelsAnchura;
    }

    @Override
    public String toString() {
        return "Ventana: " + "posicion X = " + posX + ", posicion Y = " + posY + ", Altura en pixeles = " + pixelsAltura + ", Anchura en pixeles = " + pixelsAnchura + ", El contenido es: ´" + contenido + "´. Esta visible? " + visible;
    }
    
    
}
