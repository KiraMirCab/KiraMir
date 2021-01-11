package com.mycompany.elecionesreto;

public class Votante {

    private String presidente;
    private int edad, valoracion;

    public Votante() {
        int i = (int) (Math.random() * 2 + 1);
        if (i == 1) {
            this.presidente = "Democrata";
        } else {
            this.presidente = "Republicano";
        }
        this.edad = (int) (Math.random() * 83 + 18);
        this.valoracion = (int) (Math.random() * 10 + 1);
    }

    public String getPresidente() {
        return presidente;
    }

    public int getEdad() {
        return edad;
    }

    public int getValoracion() {
        return valoracion;
    }

    @Override
    public String toString() {
        return "Votante: " + presidente + ". Edad: " + edad + ". Valoración del presidente: " + valoracion;
    }

}
