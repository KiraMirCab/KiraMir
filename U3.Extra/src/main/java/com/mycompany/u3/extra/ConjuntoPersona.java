package com.mycompany.u3.extra;

public class ConjuntoPersona {

    private Persona[] array;
    private int capacidad, numElemActual;

    public ConjuntoPersona(int capacidad) {
        this.capacidad = capacidad;
        array = new Persona[capacidad];
    }

    public boolean contiene(Persona p) {
        for (int i = 0; i < numElemActual; i++) {
            if (array[i].equals(p)) {
                return true;
            }
        }
        return false;
    }

    public void agrega(Persona p) {
        if (!contiene(p)) {
            array[numElemActual] = p;
            numElemActual++;
        } else {
            System.out.println("La persona ya está en el array.");
        }
    }

    @Override
    public String toString() {
        if (numElemActual == 0) {
            return "ConjuntoPersona = {}";
        } else {
            String resultado = "ConjuntoPersona = {";
            for (int i = 0; i < numElemActual-1; i++) {
                resultado += "{"+array[i]+"}, ";
            }
            
            return resultado+"{"+array[numElemActual-1]+"}}";
        }

    }
    

    public int getCapacidad() {
        return capacidad;
    }

    public int getNumElemActual() {
        return numElemActual;
    }

}
