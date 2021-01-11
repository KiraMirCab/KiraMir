package com.mycompany.elecionesreto;

import java.util.Scanner;

public class PruebaEncuesta {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Encuesta e = new Encuesta();
        int i;
        do {
            System.out.println("MENU DE OPCIONES________________________________");
            System.out.println("0 - SALIR");
            System.out.println("1 - Crear una encuesta");
            System.out.println("2 - Datos completos de la encuesta");
            System.out.println("3 - Distribución de votantes");
            System.out.println("4 - Distribución del voto por rango de edad");
            System.out.println("5 - Nota media del presidente");
            System.out.println("6 - Aprobación de la gestión del presidente");
            System.out.println("Escoge una opción:");
            i = sc.nextInt();
            switch (i) {
                case 0:
                    break;
                case 1:
                    System.out.println("A cuántas personas quieres encuestar?");
                    int respuesta = sc.nextInt();
                    e.inicializarEncuesta(respuesta);
                    e.rellenarEncuesta();
                    System.out.println("Encuesta realizada. Ya puedes consultar los resultados");
                    break;
                
                case 2:
                    if (e.isInicializada()) {
                        e.mostrarEncuesta();
                    } else {
                        System.out.println("Aún no has creado una encuasta. No hay datos.");
                    }
                    break;
               
                case 3:
                    if (e.isInicializada()) {
                        System.out.println("El porcentaje de votantes democratas encuestados es del " + e.porcentajeDemocrata(18, 100) + "%");
                        System.out.println("El porcentaje de votantes republicanos encuestados es del " + (100 - e.porcentajeDemocrata(18, 100)) + "%");
                    } else {
                        System.out.println("Aún no has creado una encuasta. No hay datos.");
                    }
                    break;
                
                case 4:
                    if (e.isInicializada()) {
                        System.out.println("En el rango joven (18-35) el " + e.porcentajeDemocrata(18, 35) + "% es demócrata y el " 
                                + (100 - e.porcentajeDemocrata(18, 35)) + "% es republicano");
                        System.out.println("En el rango medio (36-64) el " + e.porcentajeDemocrata(36, 64) + "% es demócrata y el " 
                                + (100 - e.porcentajeDemocrata(36, 64)) + "% es republicano");
                        System.out.println("En el rango mayor (65-100) el " + e.porcentajeDemocrata(65, 100) + "% es demócrata y el " 
                                + (100 - e.porcentajeDemocrata(65, 100)) + "% es republicano");
                    } else {
                        System.out.println("Aún no has creado una encuasta. No hay datos.");
                    }
                    break;
                
                case 5:
                     if (e.isInicializada()) {
                         System.out.println("La nota media del presidente según los votantes demócratas es " + e.notaMedia("Democrata"));
                         System.out.println("La nota media del presidente según los votantes repubicanos es " + e.notaMedia("Republicano"));         
                    } else {
                        System.out.println("Aún no has creado una encuasta. No hay datos.");
                    }
                    break;
               
                case 6:
                    if (e.isInicializada()) {
                         System.out.println("El " + e.aprobado("Democrata") + "% de los demócratas encuestados aprueban la gestión del actual presidente");
                         System.out.println("El " + e.aprobado("Republicano") + "% de los republicanos encuestados aprueban la gestión del actual presidente");   
                    } else {
                        System.out.println("Aún no has creado una encuasta. No hay datos.");
                    }                    
                    break;
                
                default:
                    System.out.println("Error en datos introducidos, marca un número entero de 0 a 6");
                    break;
            }

        } while (i != 0);

    }
}
