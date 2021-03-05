package com.mycompany.u5.extra.colavacunas;

public class Paciente {
    private String nombre;
    private boolean vacunado;

    public Paciente(String nombre, boolean vacunado) {
        this.nombre = nombre;
        this.vacunado = vacunado;
    }

    public boolean isVacunado() {
        return vacunado;
    }
    
    public void vacunar() throws PacienteVacunadoException {
        if (!vacunado) {
            vacunado = true;
        } else {
            throw new PacienteVacunadoException("Ay! Ay! Ay! Deja la vacuna para la gente que realmente la necesita!!!");
        }
    }

    @Override
    public String toString() {
        return "Nombre: " + nombre + ", vacunado: " + vacunado;
    }
    
    
}
