package com.mycompany.relojdespertador;

public class RelojDespertador {
    public int hora;
    public int minutos;
    public int horaAlarm;
    public int minutosAlarm;
    public boolean activado;

    public void setHora(int nuevaHora, int nuevoMinutos) {
        hora = nuevaHora;
        minutos = nuevoMinutos;
    }

    public void setHoraAlarma(int nuevaHoraAlarm, int nuevoMinAlarm) {
        horaAlarm = nuevaHoraAlarm;
        minutosAlarm = nuevoMinAlarm;
    }

    public void activarAlarma() {
        activado = true;
    }

    public void desactivarAlarma() {
        activado = false;
    }

    public void sonarAlarma() {
        System.out.println("PI PI PI PI");
    }

    public void imprimirHoraActual() {
        System.out.println("Hora: " + hora);
    }

    public void imprimirHoraAlarma() {
        System.out.println("Hora de alarma: " + horaAlarm);
    }

    public void imprimirEstadoAlarma() {
        System.out.println("Activada: " + activado);
    }

}
