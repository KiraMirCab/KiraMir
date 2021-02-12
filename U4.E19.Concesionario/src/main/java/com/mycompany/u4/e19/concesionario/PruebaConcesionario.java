package com.mycompany.u4.e19.concesionario;

public class PruebaConcesionario {

    public static void main(String[] args) {
        Vehiculo v1 = new Vehiculo("Toyota", "Auris", "2763JDK", 2016, 22360);
        Vehiculo v2 = new Vehiculo("Toyota", "Corolla", "3598KDH", 2017, 25500);
        Vehiculo v3 = new Vehiculo("Peugeot", "305", "2468DAW", 2002, 4240);
        Vehiculo v4 = new Vehiculo("Wolkswagen", "Golf", "2763FHG", 2015, 15000);
        Vehiculo v5 = new Vehiculo("Toyota", "Auris", "2763JDK", 2015, 20000);

        Concesionario c = new Concesionario("Pepito's Cars", "Calle Mordisco, 65");
        c.aniadirVehiculo(v1);
        c.aniadirVehiculo(v2);
        c.aniadirVehiculo(v3);
        c.aniadirVehiculo(v4);
        c.aniadirVehiculo(v5);
        System.out.println(c.mostrarVehiculos());
        c.borrarVehiculo(v3);
        System.out.println(c.mostrarVehiculos());
        v2.setPrecio(25);
        c.actualizarVehiculo(v5);
        System.out.println(c.mostrarVehiculos());
        System.out.println(c.calculaPrecioMedio());
        System.out.println(c.calculaPrecioMax());
    }
}
