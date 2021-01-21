package com.mycompany.u3.e14.interfazfichero;

public class PruebaMensajeMail {

    public static void main(String[] args) {
        InterfazFichero f = new Fichero();
        f.setNombre("Lista de compra");
        f.abrir();
        f.agregaContenido("1. Patatata, 2. Tomate, 3. Zanahoria, 4. Salchichas...");
        System.out.println("El tamaño del fichero es: " + f.getTamanioEnBytes() + " bytes");
                
        MensajeMail mensaje = new MensajeMail();
        mensaje.setDestinatario("kira@blubli.com");
        mensaje.setRemitente("g");
        mensaje.setAsunto("Lista de compra");
        mensaje.setFicheroAdjunto(f);
        mensaje.envia();
 
    }
}
