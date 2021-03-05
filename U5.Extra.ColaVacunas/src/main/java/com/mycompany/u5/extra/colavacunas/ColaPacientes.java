package com.mycompany.u5.extra.colavacunas;

import java.util.Iterator;
import java.util.LinkedList;

import java.util.Queue;

public class ColaPacientes {

    private Queue<Paciente> cola;

    public ColaPacientes() {
        cola = new LinkedList();
    }

    public void agregaPaciente(Paciente p) {
        cola.add(p);
    }

    public void vacunaSiguientePaciente() throws ColaVaciaException {
        if (!cola.isEmpty()) {
            Paciente p = cola.peek();
            try {
                p.vacunar();
            } catch (PacienteVacunadoException ex) {
                System.out.println("¡Hay que estar aburrido para querer vacunarse 2\n"
                        + "veces!");
            } finally {
                cola.remove(p);
            }
        } else {
            throw new ColaVaciaException("No hay nadie más en la cola");
        }
    }

    public void imprimeCola() {
        Iterator<Paciente> iter = cola.iterator();
        while (iter.hasNext()) {
            System.out.println(iter.next());
        }
    }
}
