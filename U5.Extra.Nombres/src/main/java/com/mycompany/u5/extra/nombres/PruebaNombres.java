package com.mycompany.u5.extra.nombres;

public class PruebaNombres {
    public static void main(String[] args) {
        NombresUnicos nm = new NombresUnicos();
        try {
            nm.agregaNombre("Pedro");
            nm.agregaNombre("Ana");
            nm.agregaNombre("Juan");
            nm.iprimeNombres();
            nm.ordenaNombres();
            nm.iprimeNombres();
            nm.agregaNombre("ANA");
        } catch (NombreDuplicadoException ex){};
        
        System.out.println("La lista contiene Juan? " + nm.contiene("Juan"));
        System.out.println("La lista contiene ANA? " + nm.contiene("ANA"));
    }
}
