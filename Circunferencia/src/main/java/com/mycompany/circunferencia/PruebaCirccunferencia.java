
package com.mycompany.circunferencia;

public class PruebaCirccunferencia {
    public static void main(String[] args) {
        Circunferencia c1 = new Circunferencia();
        
        c1.setRadio(10);
        System.out.println("El perimetro es "+c1.calculaPerimetro()+" cm");
        System.out.println("La superficie es "+c1.calculaSuperficie()+" cm2");
        
    }
}
