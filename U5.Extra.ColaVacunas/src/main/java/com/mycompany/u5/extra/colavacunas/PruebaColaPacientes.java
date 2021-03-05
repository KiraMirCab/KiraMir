package com.mycompany.u5.extra.colavacunas;

public class PruebaColaPacientes {

    public static void main(String[] args) {
        ColaPacientes cp = new ColaPacientes();
        System.out.println("---------------");
        cp.imprimeCola();
        Paciente p1 = new Paciente("Jesus", false);
        Paciente p2 = new Paciente("Matilda", false);
        Paciente p3 = new Paciente("Juan", true);
        Paciente p4 = new Paciente("Eusebio", false);
        cp.agregaPaciente(p1);
        System.out.println("---------------");
        cp.imprimeCola();
        cp.agregaPaciente(p2);
        System.out.println("---------------");
        cp.imprimeCola();
        cp.agregaPaciente(p3);
        System.out.println("---------------");
        cp.imprimeCola();
        cp.agregaPaciente(p4);
        System.out.println("---------------");
        cp.imprimeCola();

        try {
            while (true) {
                cp.vacunaSiguientePaciente();
                System.out.println("---------------");
                cp.imprimeCola();
            }
        } catch (ColaVaciaException ex) {
            System.out.println("Todos los pacientes están vacunados");

        }

    }
}
