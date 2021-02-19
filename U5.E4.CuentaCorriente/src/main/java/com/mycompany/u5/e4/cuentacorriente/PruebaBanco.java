package com.mycompany.u5.e4.cuentacorriente;


public class PruebaBanco {
    public static void main(String[] args) {
        Banco banco = new Banco();
        try {
//            banco.abreConexion(512, "4657");
//            banco.abreConexion(1236547896581236L, "4569");
            banco.abreConexion(1236547896581236L, "3652");
        } catch (CuentaOPinIncorrectoException ex) {
            System.out.println(ex);
        }
    }
}
