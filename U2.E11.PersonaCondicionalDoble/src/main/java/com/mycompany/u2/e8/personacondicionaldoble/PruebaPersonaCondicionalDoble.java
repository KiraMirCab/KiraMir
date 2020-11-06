package com.mycompany.u2.e8.personacondicionaldoble;

public class PruebaPersonaCondicionalDoble {

    public static void main(String[] args) {
        PersonaCondicionalDoble p = new PersonaCondicionalDoble();
        p.setEdad(20);
        p.setAltura(165);
        p.setEstaCasado(false);
        p.setTieneTrabajo(true);

        if (p.getEdad() < 18) {
            System.out.println("Eres menor de edad");
        } else {
            System.out.println("Eres mayor de edad");
        }

        if (p.getAltura() >= 185) {
            System.out.println("Eres alt@");
        } else {
            System.out.println("No eres alt@");
        }

        if (p.isEstaCasado()) {
            if (p.isTieneTrabajo()) {
                System.out.println("Casad@ y tiene trabajo");
            } else {
                System.out.println("Casad@ y no tiene trabajo");
            }
        } else {
            System.out.println("No está casad@");
        }
    }
}
