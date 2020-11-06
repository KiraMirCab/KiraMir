package com.mycompany.procesoseleccion;

public class PocesoSeleccionOtraSolucion {

    public static void main(String[] args) {
        Persona p = new Persona();

        p.setNombre("Marisa");
        p.setAniosEnFront(3);
        p.setAniosEnBack(4);
        p.setSabeAngular(false);
        p.setSabeReact(true);
        p.setSabeSpring(true);
        p.setSabeLaravel(true);
        p.setCochePropio(false);
        p.setDisponibleViajes(true);

               
        if (p.aniosEnFront >= 2 && p.sabeAngular || p.sabeReact) {
            System.out.println(p.getNombre() + " supera la primera fase");

            if (p.aniosEnBack >= 2 && p.aniosEnBack <= 5 && p.sabeSpring && p.sabeLaravel) {
                System.out.println(p.getNombre() + " supera la segunda fase");

                if (p.cochePropio || p.disponibleViajes) {
                    System.out.println(p.getNombre() + " supera la tercera fase");
                } else {
                    System.out.println(p.getNombre() + " NO supera la tercera fase");
                }
            } else {
                System.out.println(p.getNombre() + " NO supera la segunda fase");
            }
        } else {
            System.out.println(p.getNombre() + " NO supera la primera fase");
        }
        //Intuyo que esta solución sería menos eficiente, por eso la he puesto como segunda
    }
}
