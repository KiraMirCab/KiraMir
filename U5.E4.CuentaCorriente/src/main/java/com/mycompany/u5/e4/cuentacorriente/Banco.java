package com.mycompany.u5.e4.cuentacorriente;

import java.util.HashMap;
import java.util.Map;

public class Banco {

    private Map cuentasCorrientes, cuentasConectadas;

    public Banco() {
        cuentasCorrientes = new HashMap();
        cuentasConectadas = new HashMap();
        CuentaCorriente c1 = new CuentaCorriente(3000.00, 1236547896581236L, "3652");
        CuentaCorriente c2 = new CuentaCorriente(5000.00, 3654896712546325L, "1523");
        CuentaCorriente c3 = new CuentaCorriente(1000.00, 6547235698541256L, "9595");
        CuentaCorriente c4 = new CuentaCorriente(6000.00, 9874651236547896L, "1326");
        cuentasCorrientes.put(c1.getNumeroCuenta(), c1);
        cuentasCorrientes.put(c2.getNumeroCuenta(), c2);
        cuentasCorrientes.put(c3.getNumeroCuenta(), c3);
        cuentasCorrientes.put(c4.getNumeroCuenta(), c4);
    }

    public int abreConexion(long numeroCuenta, String pin) throws CuentaOPinIncorrectoException {
        int token = -1;
       if (cuentasCorrientes.containsKey(numeroCuenta)){
            CuentaCorriente cuentaEnCuestion = (CuentaCorriente) cuentasCorrientes.get(numeroCuenta);
            if (cuentaEnCuestion.intentaAccesoConPin(pin)) {
                token = (int) Math.floor(Math.random() * 999999);
                cuentasConectadas.put(token, cuentaEnCuestion);
            } else {
                throw new CuentaOPinIncorrectoException("Pin de la cuenta incorrecto");
            }
        } else {
            throw new CuentaOPinIncorrectoException("Numero de cuenta incorrecto");
        }
        return token;
    }

    public void realizaPago(int tokenCuenta, double importe) throws TokenIncorrectoException, SaldoInsuficienteException {
        if (cuentasConectadas.containsKey(tokenCuenta)) {
            CuentaCorriente cuentaEnCuestion = (CuentaCorriente) cuentasConectadas.get(tokenCuenta);
            if (cuentaEnCuestion.consultaSaldo()>= importe) {
                cuentaEnCuestion.abona(importe);
            } else {
                throw new SaldoInsuficienteException("Saldo insuficiente");
            }
        } else {
            throw new TokenIncorrectoException("Token incorrecto");
        }
    }
    
    public void cierraConexion (int tokenCuenta) throws TokenIncorrectoException {
        if (cuentasConectadas.containsKey(tokenCuenta))  {
            cuentasConectadas.remove(tokenCuenta);
        } else {
            throw new TokenIncorrectoException("Token incorrecto");
        }
    }
}
