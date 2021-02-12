package com.mycompany.u4.e19.concesionario;

import java.util.*;

public class Concesionario {
    private String nombre, direccion;
    private Set <Vehiculo> parqueVehiculos;

    public Concesionario(String nombre, String direccion) {
        this.nombre = nombre;
        this.direccion = direccion;
        parqueVehiculos = new HashSet();
    }
    
    public void aniadirVehiculo (Vehiculo v) {
        parqueVehiculos.add(v);
    }
    
    public void actualizarVehiculo (Vehiculo v) {
        if (parqueVehiculos.contains(v)) {
            parqueVehiculos.add(v);
        } else {
            System.out.println("Es un vehiculo nuevo, usa el metodo aniadir vehiculo");
        }
    }
    
    public void borrarVehiculo (Vehiculo v) {
        if (parqueVehiculos.contains(v)) {
            parqueVehiculos.remove(v);
        } else {
            System.out.println("El vehiculo no esta en la lista");
        }
    }
    
    public String mostrarVehiculos() {
        Iterator <Vehiculo> iter = parqueVehiculos.iterator();
        String result = "";
        while (iter.hasNext()) {
            result+=(iter.next().toString());
        }
        return result;
    }
    
    public double calculaPrecioTotal() {
        Iterator <Vehiculo> iter = parqueVehiculos.iterator();
        double result = 0;
        while (iter.hasNext()) {
            result += iter.next().getPrecio();
        }
        return result;
    }
    
    public double calculaPrecioMedio() {
        Iterator <Vehiculo> iter = parqueVehiculos.iterator();
        double result = 0;
        while (iter.hasNext()) {
            result += iter.next().getPrecio();
        }
        return result / parqueVehiculos.size();
    }
    
     public double calculaPrecioMax() {
        Iterator <Vehiculo> iter = parqueVehiculos.iterator();
        double max = 0.0;
        while (iter.hasNext()) {
            double este = iter.next().getPrecio();
            if ( este > max) {
                max = este;
            }
        }
        return max;
    }
     
     public double calculaPrecioMin() {
        Iterator <Vehiculo> iter = parqueVehiculos.iterator();
        double min = Double.MAX_VALUE;
        while (iter.hasNext()) {
            double este = iter.next().getPrecio();
            if ( este < min) {
                min = este;
            }
        }
        return min;
    }
}
