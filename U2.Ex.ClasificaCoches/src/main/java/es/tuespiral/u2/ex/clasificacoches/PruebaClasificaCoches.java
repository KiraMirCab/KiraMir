package es.tuespiral.u2.ex.clasificacoches;

import java.util.Scanner;

public class PruebaClasificaCoches {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int opcion;
        Coche c = new Coche();
        
        do {
            System.out.println("0 - Salir");
            System.out.println("1 - Alta de nuevo coche");
            System.out.println("2 - Clasifica el coche dado de alta");
            System.out.println("Escoge una opcion:");
            opcion = sc.nextInt();
            sc.nextLine(); // Para limpiar el buffer
            
            switch (opcion) {
                case 0: 
                    System.out.println("Adios");
                    break;
                case 1:
                    c = new Coche();
                    System.out.println("Dime la potencia (ejemplo: 100)");
                    c.setPotencia(sc.nextInt());
                    System.out.println("Dime el número de años de antigüedad");
                    c.setAniosAnt(sc.nextInt());
                    System.out.println("Dime si es eléctrico (true/false)");
                    c.setElectrico(sc.nextBoolean());
                    System.out.println("Dime si tiene airbag (true/false)");
                    c.setAirbag(sc.nextBoolean());
                    System.out.println("Dime si tiene frenos ABS (true/false)");
                    c.setAbs(sc.nextBoolean());
                    break;
                case 2: 
                    ClasificadorCoches clasificador = new ClasificadorCoches();
                    int resultado = clasificador.clasificaCoche(c);
                    
                    switch(resultado) {
                        case 1: System.out.println("El coche es de categoría superior");
                            break;
                        case 2: System.out.println("El coche es de categoría intermedia");
                            break;
                        case 3:
                            System.out.println("El coche es de categoría económica");
                            break;
                    }
                    
                    break;
                default:
                    System.out.println("Opción incorrecta");
            }
        } while (opcion != 0);
    }
}
