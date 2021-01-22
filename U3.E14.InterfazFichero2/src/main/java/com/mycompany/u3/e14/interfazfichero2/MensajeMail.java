package com.mycompany.u3.e14.interfazfichero2;

public class MensajeMail implements InterfazMensajeMail {

    private String destinatario;
    private String remitente;
    private String contenido;
    private String asunto = contenido = remitente = destinatario = "";
    private InterfazFichero ficheroAdjunto;
    public static final InterfazFichero VOID = new Fichero();

    @Override
    public void setAsunto(String asunto) {
        if (asunto == null) {
            System.out.println("No se puede meter datos nulos");
        } else {
            this.asunto = asunto;
        }
    }

    @Override
    public String getAsunto() {
        return asunto;
    }

    @Override
    public void setContenido(String contenido) {
        if (asunto == null) {
            System.out.println("No se puede meter datos nulos");
        } else {
            this.contenido = contenido;
        }
    }

    @Override
    public String getContenido() {
        return contenido;
    }

    @Override
    public void setRemitente(String direccionEmail) {
        if (remitente != null && direccionEmail.contains("@") && direccionEmail.length() >= 5) {
            remitente = direccionEmail;
        } else {
            System.out.println("Error: conmprueba la dirección del remitente");
        }
    }

    @Override
    public String getRemitente() {
        return remitente;
    }

    @Override
    public void setDestinatario(String direccionEmail) {
        if (remitente != null && direccionEmail.contains("@") && direccionEmail.length() >= 5) {
            destinatario = direccionEmail;
        } else {
            System.out.println("Error: conmprueba la dirección del destinatario");
        }
    }

    @Override
    public String getDestinatario() {
        return destinatario;
    }

    @Override
    public void setFicheroAdjunto(InterfazFichero fichero) {
        ficheroAdjunto = fichero;
    }

    @Override
    public void eliminaFicheroAdjunto() {
        ficheroAdjunto = VOID;
    }

    @Override
    public InterfazFichero getFicheroAdjunto() {
        if (ficheroAdjunto == VOID) {
            System.out.println("No tienes ningún fichero adjunto");
            return VOID;
        } else {
            return ficheroAdjunto;
        }
    }

    @Override
    public void envia() {
        if (remitente.equals("") || destinatario.equals("")) {
            System.out.println("Error: No esta puesta la direccion del remitente o del destinatario");
        } else {
            if (asunto.equals("")) {
                System.out.println("OJO: estás enviando un mensaje sin asunto");
            }
            if (contenido.equals("")) {
                System.out.println("OJO: estás enviando un mensaje sin contenido");
            }

            if (ficheroAdjunto == VOID) {
                System.out.println("Mensaje enviado de " + remitente + " a " + destinatario + " con asunto " + asunto);
            } else {
                System.out.println("Mensaje enviado de " + remitente + " a " + destinatario + " con asunto '" + asunto + "' y con un fichero adjunto de " + ficheroAdjunto.getTamanioEnBytes() + " bytes");
            }
        }
    }

    
    

}
