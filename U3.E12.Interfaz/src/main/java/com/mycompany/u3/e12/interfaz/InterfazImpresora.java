package com.mycompany.u3.e12.interfaz;

public interface InterfazImpresora {

    String getMarca();

    String getModelo();

    void encender();

    void apagar();

    void cargarBandeja(int numFolios);

    void imprimir(InterfazDocumento documento);

    String getEstado();

}
