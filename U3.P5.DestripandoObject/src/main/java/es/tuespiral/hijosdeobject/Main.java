package es.tuespiral.hijosdeobject;

public class Main {
    public static void main(String[] args) {
        Object referencia1 = new Object();
        Object referencia2;
       
        
        System.out.println("ANALIZAMOS EL MÉTODO equals");
        // Ambas referencias apuntan al mismo objeto en memoria
        referencia2 = referencia1;
        if (referencia1.equals(referencia2)) {
            System.out.println("equals devuelve true porque ambas referencias apunta al mismo objeto");
            //Sería equivalente a la condición: referencia1 == referencia2
        }
        else {
            System.out.println("equals devuelve false porque las referencias apuntan a distintas zonas de memoria (objetos distintos)");
        }   
         
        // Ahora creamos un nuevo objeto y su dirección de memoria la guardamos
        // en la referencia2
        referencia2 = new Object();
        if (referencia1.equals(referencia2)) {
            System.out.println("equals devuelve true porque ambas referencias apunta al mismo objeto");
            //Sería equivalente a la condición: referencia1 == referencia2
        }
        else {
            System.out.println("equals devuelve false porque las referencias apuntan a distintas zonas de memoria (objetos distintos)");
        }
        
        System.out.println("");
        System.out.println("ANALIZAMOS EL MÉTODO toString");
        System.out.println("toString de referencia1 = "+referencia1.toString());
        System.out.println("toString de referencia2 = "+referencia2);
        
        Persona p = new Persona("José Haro Quesí", 34);
        System.out.println(p);        
    }
}
