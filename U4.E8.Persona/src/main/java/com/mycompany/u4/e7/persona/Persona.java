package com.mycompany.u4.e7.persona;

public class Persona implements Comparable {
    private String nombre, dni;
    private int edad;

    public Persona(String nombre, String dni, int edad) {
        this.nombre = nombre;
        this.dni = dni;
        this.edad = edad;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getDni() {
        return dni;
    }

    public void setDni(String dni) {
        this.dni = dni;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    @Override
    public String toString() {
        return nombre +" " + dni + " " + edad + " ";
    }
    
//      Ej 8.   
//    @Override
//    public int compareTo(Object o) {
//        Persona p = (Persona) o;
//        return nombre.compareTo(p.nombre);
//     }

//      Ej 9.       
//     @Override
//    public int compareTo(Object o) {
//        Persona p = (Persona) o;
//        int result = nombre.compareTo(p.nombre);
//         if (result == 0) {
//             return p.getEdad() - this.edad;
//         } else {
//         return result;
//         }
//     }
    
 //      Ej 9.        
    @Override
    public int compareTo(Object o) {
        Persona p = (Persona) o;
        int result = this.edad - p.getEdad();
        if (result == 0) {
            return nombre.compareTo(p.nombre);
        } else {
            return result;
        }
        
     }
}
