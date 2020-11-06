package com.mycompany.depositocircular;

public class DepositoCircular {

    public double radio, altura, litrosRiegoHora, numLitrosActual;

    public double getRadio() {
        return radio;
    }

    public void setRadio(double radio) {
        this.radio = radio;
    }

    public double getAltura() {
        return altura;
    }

    public void setAltura(double altura) {
        this.altura = altura;
    }

    public double getLitrosRiegoHora() {
        return litrosRiegoHora;
    }

    public void setLitrosRiegoHora(double litrosRiegoHora) {
        this.litrosRiegoHora = litrosRiegoHora;
    }

    public double getNumLitrosActual() {
        return numLitrosActual;
    }

    public double calculaSuperficieBase() {
        return radio * radio * Math.PI;
    }

    public double calculaPerimetroBase() {
        return 2 * radio * Math.PI;
    }
    
    public double calculaCapacidad() {
        return radio * radio * Math.PI * altura;
    }
    
    public void cargaDeposito(double numLitros) {
        numLitrosActual+=numLitros;
    }
    
    public void riega(double numMinutos){
        numLitrosActual = numLitrosActual - numMinutos * (litrosRiegoHora / 60);
    }
}
