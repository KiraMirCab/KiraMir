package es.marca.futbol;

import es.marca.futbol.jugadores.Futbolista;

public class PruebaFutbolista {

    public static void main(String[] args) {
        Futbolista f1 = new Futbolista();
        Futbolista f2 = new Futbolista();

        f1.setNombre("Ivan");
        f1.setApellidos("Somov Segundo");
        f1.setSalario(6700000.89);
        f1.setNumGoles(5);
        f1.marcaGol(3);
        f1.golAnulado();
        f1.marcaGol(1);
        f1.golAnulado();
        f1.seLesiona();
        f1.seRecupera();

        f2.setNombre("Zajar");
        f2.setApellidos("Ivanovich Mamedov");
        f2.setSalario(65964.8);
        f2.setNumGoles(1);
        f2.marcaGol(2);
        f2.golAnulado();
        f2.marcaGol(5);
        f2.golAnulado();
        f2.seLesiona();
        f2.seRecupera();
        f2.marcaGol(1);
        f2.seLesiona();
        
        System.out.println(f1.getNombre() + " " + f1.getApellidos() + " tiene el salario de "
                + f1.getSalario() + "€ y ha marcado " + f1.getNumGoles() + " goles. Lesionado: " + f1.isLesionado());

        System.out.println(f2.getNombre() + " " + f2.getApellidos() + " tiene el salario de "
                + f2.getSalario() + "€ y ha marcado " + f2.getNumGoles() + " goles. Lesionado: " + f2.isLesionado());
    }
}
