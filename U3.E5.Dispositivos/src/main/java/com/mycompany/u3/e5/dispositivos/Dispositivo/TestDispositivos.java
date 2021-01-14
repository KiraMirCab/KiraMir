package com.mycompany.u3.e5.dispositivos.Dispositivo;

public class TestDispositivos {
    public static void main(String[] args) {
        
        Dispositivo[] array = new Dispositivo[5];
        
        array[0] = new Procesador("Intel", "icore 7");
        array[1] = new Procesador("Intel", "icore 5");
        array[2] = new MemoriaRAM("Kingston", "HyperX Fury");
        array[3] = new MemoriaRAM("Kingston", "HyperX");
        array[4] = new TarjetaVideo("MSI", "GeForce");
        
        for (Dispositivo elem: array){
            System.out.println("Probamos el dispositivo: " + elem.toString());
            testDispositivo(elem);
        }
    }

    private static void testDispositivo(Dispositivo elem) {
        final int NUM_VECES_TEST = 100;
        for (int i = 0; i <= NUM_VECES_TEST; i++) {
                elem.encender();
                elem.apagar();
            }
    }
    
    
    
    
    
        
       
        
    
}
