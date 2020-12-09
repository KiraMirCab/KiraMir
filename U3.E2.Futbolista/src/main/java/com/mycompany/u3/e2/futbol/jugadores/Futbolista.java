package com.mycompany.u3.e2.futbol.jugadores;

public class Futbolista {

    private String nombre;
    private String apellidos;
    private int numGoles;
    private double salario;
    private boolean lesionado;

    public Futbolista(String nombre, String apellidos) {
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellidos() {
        return apellidos;
    }

    public void setApellidos(String apellidos) {
        this.apellidos = apellidos;
    }

    public int getNumGoles() {
        return numGoles;
    }

    public void setNumGoles(int numGoles) {
        this.numGoles = numGoles;
    }

    public double getSalario() {
        return salario;
    }

    public void setSalario(double salario) {
        this.salario = salario;
    }

    public boolean isLesionado() {
        return lesionado;
    }

    public void setLesionado(boolean lesionado) {
        this.lesionado = lesionado;
    }

    public void marcaGol() {
        numGoles++;
    }

    public void marcaGol(int numGolesMetidos) {
        numGoles += numGolesMetidos;
    }

    public void golAnulado() {
        if (numGoles == 0) {
            System.out.println("Error: no se puede anular el gol");
        } else {
            numGoles--;
        }
    }

    public void golAnulado(int numGolesAnulados) {
        if (numGoles - numGolesAnulados < 0) {
            System.out.println("Error: no se puede anular los goles");
        } else {
            numGoles -= numGolesAnulados;
        }
    }
}
