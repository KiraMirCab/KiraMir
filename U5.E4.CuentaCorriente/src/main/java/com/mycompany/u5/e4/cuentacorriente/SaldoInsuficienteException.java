package com.mycompany.u5.e4.cuentacorriente;

class SaldoInsuficienteException extends Exception {

    public SaldoInsuficienteException(String mensaje) {
        super(mensaje);
    }
}
