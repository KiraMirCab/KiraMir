package com.mycompany.u5.e4.cuentacorriente;

public class CuentaCorriente {

    private double saldo;
    private long numCuenta;
    private String pin;

    public CuentaCorriente(double saldo, long numCuenta, String pin) {
        if (saldo < 0 || numCuenta < 0 || !pin.matches("^[0-9]+") || pin.length() != 4) {
            throw new IllegalArgumentException("Datos incorrectos");
        }
        if (pin == null) {
            throw new NullPointerException("El pin no puede ser nulo");
        }
        this.saldo = saldo;
        this.numCuenta = numCuenta;
        this.pin = pin;
    }

//    double consultaSaldo() que devolverá el saldo actual
    public double consultaSaldo() {
        return this.saldo;
    }
//• boolean intentaAccesoConPin(String pin) se devolverá true si el PIN que se recibe
//como parámetro coincide con el que se puso en el constructor al crear el objeto.

    public boolean intentaAccesoConPin(String pin) {
        return pin.equals(this.pin);
    }
//• long getNumeroCuenta() que devuelve el número de cuenta.

    public long getNumeroCuenta() {
        return this.numCuenta;
    }

//• void ingresa (double importe) sumará el importe que se recibe como parámetro al
//saldo de la cuenta. Lanzará una IllegalArgumentException si el importe es cero o
//menor que cero.
    public void ingresa(double importe) {
        if (importe <= 0) {
            throw new IllegalArgumentException("El importe no puede ser negativo o 0");
        }
        saldo += importe;
    }
//• void abona (double importe) restará el importe que se recibe como parámetro del
//saldo de la cuenta. Lanzará una IllegalArgumentException si el importe es cero o
//menor que cero

    public void abona(double importe) {
        if (importe <= 0) {
            throw new IllegalArgumentException("El importe no puede ser negativo o 0");
        }
        saldo -= importe;
    }
}
