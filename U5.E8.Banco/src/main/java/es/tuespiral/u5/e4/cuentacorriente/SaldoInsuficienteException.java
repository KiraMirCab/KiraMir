/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package es.tuespiral.u5.e4.cuentacorriente;

/**
 *
 * @author Kike
 */
public class SaldoInsuficienteException extends Exception {

    /**
     * Creates a new instance of <code>SaldoInsuficienteException</code> without
     * detail message.
     */
    public SaldoInsuficienteException() {
    }

    /**
     * Constructs an instance of <code>SaldoInsuficienteException</code> with
     * the specified detail message.
     *
     * @param msg the detail message.
     */
    public SaldoInsuficienteException(String msg) {
        super(msg);
    }
}
