package es.tuespiral.u5.e4.cuentacorriente;

public class CuentaOPinIncorrectoException extends Exception {

    /**
     * Creates a new instance of <code>CuentaOPinIncorrectoException</code>
     * without detail message.
     */
    public CuentaOPinIncorrectoException() {
    }

    /**
     * Constructs an instance of <code>CuentaOPinIncorrectoException</code> with
     * the specified detail message.
     *
     * @param msg the detail message.
     */
    public CuentaOPinIncorrectoException(String msg) {
        super(msg);
    }
}
