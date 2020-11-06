package es.marca.futbol.jugadores;

public class Futbolista {

    public String nombre, apellidos;
    public int numGoles;
    public double salario;
    public boolean lesionado;

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

    public void marcaGol(int numGolesMarcados) {
        numGoles += numGolesMarcados;
    }

    public void golAnulado() {
        numGoles--;
    }

    public void seLesiona() {
        lesionado = true;
    }

    public void seRecupera() {
        lesionado = false;
    }

}
