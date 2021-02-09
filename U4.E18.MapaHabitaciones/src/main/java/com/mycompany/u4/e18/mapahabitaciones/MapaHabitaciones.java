package com.mycompany.u4.e18.mapahabitaciones;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Scanner;
import java.util.Set;

public class MapaHabitaciones {

    public static void main(String[] args) {
        Map estadoHabitaciones = new HashMap();
        Set habitaciones = estadoHabitaciones.keySet();

        estadoHabitaciones.put(101, false);
        estadoHabitaciones.put(102, true);
        estadoHabitaciones.put(103, true);
        estadoHabitaciones.put(104, false);
        estadoHabitaciones.put(105, true);
        estadoHabitaciones.put(201, true);
        estadoHabitaciones.put(202, false);
        estadoHabitaciones.put(203, false);
        estadoHabitaciones.put(204, true);
        estadoHabitaciones.put(205, false);

        Scanner sc = new Scanner(System.in);
        int i;
        do {
            System.out.println("0 – Salir\n 1 – Ver estado de ocupación\n 2 – Ocupar una habitación\n 3 – Liberar una habitación");
            i = sc.nextInt();

            switch (i) {
                case 0:
                    System.out.println("Adios");
                    break;

                case 1:

                    Iterator iter = habitaciones.iterator();
                    while (iter.hasNext()) {
                        int numHab = (int) iter.next();
                        boolean ocupada = (boolean) estadoHabitaciones.get(numHab);
                        String estado = "libre";
                        if (ocupada) {
                            estado = "ocupado";
                        }
                        System.out.println("Habitación " + numHab + ": " + estado);
                    }
                    break;

                case 2:
                    System.out.println("Qué habitación se desea ocupar?");
                    int hab = sc.nextInt();

                    if (estadoHabitaciones.containsKey(hab)) {
                        boolean estado = (boolean) estadoHabitaciones.get(hab);
                        if (estado) {
                            System.out.println("La habitación ya está ocupada");
                        } else {
                            estadoHabitaciones.replace(hab, true);
                        }
                    } else {
                        System.out.println("No existe la habitacion mencionada");
                    }
                    break;

                case 3:
                    System.out.println("Qué habitación se desea liberar?");
                    hab = sc.nextInt();
                    if (estadoHabitaciones.containsKey(hab)) {
                        boolean estado = (boolean) estadoHabitaciones.get(hab);
                        if (!estado) {
                            System.out.println("La habitación ya está libre");
                        } else {
                            estadoHabitaciones.replace(hab, false);
                        }

                    } else {
                        System.out.println("No existe la habitacion mencionada");
                    }
                    break;

                default:
                    System.out.println("Opción incorrecta");
                    break;
            }

        } while (i != 0);
        

    }
}
