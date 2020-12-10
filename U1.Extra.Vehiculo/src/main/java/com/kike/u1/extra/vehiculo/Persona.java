package com.kike.u1.extra.vehiculo;

public class Persona {

    private String nombre;
    private String dni;
    private Vehiculo[] coches = new Vehiculo[3];
    private int numCochesActual = 0;

    public Persona() {
    }

    public Persona(String nombre, String dni) {
        this.nombre = nombre;
        this.dni = dni;
    }

    public void comprarCoche(Vehiculo coche) {
        if (numCochesActual < coches.length) {
            coches[numCochesActual] = coche;
            numCochesActual++;
        } else {
            System.out.println("Ya no puedes tener más coches");
        }
    }

    public void arrancarCoche(Vehiculo coche) {
        coche.arrancar();
    }

    public void apagarCoche(Vehiculo coche) {
        coche.apagar();
    }

    public void recorrerDistancia(Vehiculo coche, double numKm) {
        coche.recorrerDistancia(numKm);
    }

    public void reponerCombustible(Vehiculo coche, double numlitros) {
        coche.reponerCombustible(numlitros);
    }

    public String getNombre() {
        return nombre;
    }

    public String getDni() {
        return dni;
    }

    public Vehiculo[] getCoches() {
        return coches;
    }

    public int getNumCochesActual() {
        return numCochesActual;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setDni(String dni) {
        this.dni = dni;
    }

}
