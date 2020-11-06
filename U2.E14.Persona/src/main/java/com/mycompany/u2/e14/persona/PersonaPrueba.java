
package com.mycompany.u2.e14.persona;


public class PersonaPrueba {
    public static void main(String[] args) {
        Persona p = new Persona();
        p.setNombre("Pedro");
        p.setEdad(12);
        System.out.println("El nombre es "+ p.getNombre());
        System.out.println("La edad es "+ p.getEdad());
        
        if (p.getEdad() <=3) 
            System.out.println("Es un bebé");
        else {
        if (p.getEdad() <=12) {
            System.out.println("Es un niño");
        } else{
            if (p.getEdad() <=20) {
                System.out.println("Es un adolescente");
            } else {
                System.out.println("Es un adulto");
            }
        }
       
    }
    }
}
               
    

   

