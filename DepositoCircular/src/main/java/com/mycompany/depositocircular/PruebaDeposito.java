
package com.mycompany.depositocircular;

public class PruebaDeposito {
    public static void main(String[] args) {
        DepositoCircular d = new DepositoCircular();
        
        d.setRadio(45);
        d.setAltura(5);
        d.setLitrosRiegoHora(20);
        System.out.println("El radio del deposito es "+d.getRadio());
        System.out.println("La altura del deposito es "+d.getAltura());
        System.out.println("La superficie de la base es "+d.calculaSuperficieBase());
        System.out.println("El perimetro de la base es "+d.calculaPerimetroBase());
        System.out.println("La capacidad del depósito es "+d.calculaCapacidad());
        System.out.println("Litros en el depósito actualmente: "+d.getNumLitrosActual());
        
        d.cargaDeposito(40);
        d.riega(50);
        System.out.println("--------------------------------------");
        System.out.println("El radio del deposito es "+d.getRadio());
        System.out.println("La altura del deposito es "+d.getAltura());
        System.out.println("La superficie de la base es "+d.calculaSuperficieBase());
        System.out.println("El perimetro de la base es "+d.calculaPerimetroBase());
        System.out.println("La capacidad del depósito es "+d.calculaCapacidad());
        System.out.println("Litros en el depósito actualmente: "+d.getNumLitrosActual());
        
        d.riega(30);
        d.cargaDeposito(15);
        d.riega(60);
        d.riega(25);
        System.out.println("--------------------------------------");
        System.out.println("El radio del deposito es "+d.getRadio());
        System.out.println("La altura del deposito es "+d.getAltura());
        System.out.println("La superficie de la base es "+d.calculaSuperficieBase());
        System.out.println("El perimetro de la base es "+d.calculaPerimetroBase());
        System.out.println("La capacidad del depósito es "+d.calculaCapacidad());
        System.out.println("Litros en el depósito actualmente: "+d.getNumLitrosActual());
        
        }
}
