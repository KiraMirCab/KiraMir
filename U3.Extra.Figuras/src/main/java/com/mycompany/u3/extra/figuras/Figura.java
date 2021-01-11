package com.mycompany.u3.extra.figuras;

public class Figura {
    private boolean mostrado;
    private String colorBorde, colorRelleno;
    
    public double calculaPerimetro(){
        return -1;
    }
    
    public double calculaSuperficie(){
        return -1;
    }

    public boolean isMostrado() {
        return mostrado;
    }

    public void setMostrado(boolean mostrado) {
        this.mostrado = mostrado;
    }

    public String getColorBorde() {
        return colorBorde;
    }

    public void setColorBorde(String colorBorde) {
        this.colorBorde = colorBorde;
    }

    public String getColorRelleno() {
        return colorRelleno;
    }

    public void setColorRelleno(String colorRelleno) {
        this.colorRelleno = colorRelleno;
    }
    
}
