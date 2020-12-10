package com.mycompany.extra.casting;

public class CandidatosCasting {

    public Persona[] candidatos = new Persona[100];
    public int numCandidatos;

    public void incluyeCandidato(Persona p) {
        if (numCandidatos == candidatos.length) {
            System.out.println("Ya no se admiten más candidatos");
        } else {
            if (p == Persona.NOT_FOUND) {
                System.out.println("No se puede guardar posición vacía");
            } else {
                candidatos[numCandidatos] = p;
            }
        }
    }

    public int getNumCandidatos() {
        return numCandidatos;
    }

    public void imprimeCandidatosRangoEdad(int edadMin, int edadMax) {
        for (int i = 0; i < numCandidatos; i++) {
            if (candidatos[i].getEdad() >= edadMin && candidatos[i].getEdad() <= edadMax) {
                System.out.println(candidatos[i].getNombre());
            }
        }
    }

    public void imprimeCandidatosHabilidades(boolean canta, boolean baila) {
        for (int i = 0; i < numCandidatos; i++) {
            if (candidatos[i].sabeCantar == canta && candidatos[i].sabeBailar == baila) {
                System.out.println(candidatos[i].getNombre());
            }
        }
    }

    public Persona buscaPorEdad(int edad) {
        
    }

    public Persona buscaPorNombre(String nombre) {

    }
}
