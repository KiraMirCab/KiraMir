package com.mycompany.u2.e36.personasarray;

public class PruebaPersona {

    public static void main(String[] args) {
        Persona[] familia = new Persona[4];
        familia[0] = new Persona();
        familia[0].setRol("padre");
        familia[0].setEdad(43);

        familia[1] = new Persona();
        familia[1].setRol("madre");
        familia[1].setEdad(40);

        familia[2] = new Persona();
        familia[2].setRol("hijo");
        familia[2].setEdad(24);

        familia[3] = new Persona();
        familia[3].setRol("hija");
        familia[3].setEdad(14);

        for (int i = 0; i < 4; i++) {
            System.out.println("La posición " + i + " la ocupa el/la " + familia[i].getRol() + " con " + familia[i].getEdad());
        }

        familia[2] = new Persona();
        for (int i = 0; i < 4; i++) {
            if (familia[i].getRol() != null)
                System.out.println("La posición " + i + " la ocupa el/la " + familia[i].getRol() + " con " + familia[i].getEdad());
        }
        
        familia[2] = new Persona();
        familia[2].setRol("abuelo");
        familia[2].setEdad(80);
        for (int i = 0; i < 4; i++) {
            System.out.println("La posición " + i + " la ocupa el/la " + familia[i].getRol() + " con " + familia[i].getEdad());
        }
    }
}
