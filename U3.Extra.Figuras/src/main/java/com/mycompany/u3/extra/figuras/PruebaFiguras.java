package com.mycompany.u3.extra.figuras;

public class PruebaFiguras {
    public static void main(String[] args) {
        Circulo c = new Circulo(55.8);
        Rectangulo r = new Rectangulo(7.5, 78);
        Triangulo t = new Triangulo(89, 56, 85.5);
        
        System.out.println("Perimetro y Superficie del circulo es:");
        System.out.println(c.calculaPerimetro());
        System.out.println(c.calculaSuperficie());
        System.out.println("---------");
        
        System.out.println("Perimetro y Superficie del rectangulo es:");
        System.out.println(r.calculaPerimetro());
        System.out.println(r.calculaSuperficie());
        System.out.println("---------");
        
        System.out.println("Perimetro y Superficie del triangulo es:");
        System.out.println(t.calculaPerimetro());
        System.out.println(t.calculaSuperficie());
        System.out.println("---------");
        
    }
}
