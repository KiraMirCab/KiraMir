package es.tuespiral.u5.p2.ficherocheckedexception;

import java.io.PrintWriter;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Iterator;
import java.util.List;

public class Fichero {

    private String nombreFichero = "";
    private File fichero;
    private PrintWriter pw;
    private boolean abierto = false;

    public Fichero(String nombre) {
        if (nombre != null) {
            nombreFichero = nombre;
        }
    }

    public void abrir() throws IOException {
        fichero = new File(nombreFichero);
        pw = new PrintWriter(fichero);
        abierto = true;
    }

    public void cerrar() throws IOException {
        if (abierto) {
            pw.close();
            abierto = false;
        } else {
            throw new IllegalStateException("El fichero no está abierto");
        }
    }

    public void escribeTexto(String linea) throws IOException {
        if (abierto) {
            if (linea != null) {
                pw.println(linea);
            }
        } else {
            throw new IllegalStateException("El fichero no esta abierto");
        }
    }

    public void escribeTexto(List<String> texto) throws IOException {
        if (abierto) {
            Iterator<String> iter = texto.iterator();
            String linea;
            while (iter.hasNext()) {
                linea = iter.next();
                pw.println(linea);
            }
        } else {
            throw new IllegalStateException("El fichero no esta abierto");
        }
    }
    
    public void abreEscribeCierra(List<String> texto) {
        try {
            abrir();
            escribeTexto(texto);
        } catch (IOException ex) {
            System.out.println("Se produjo un error al intentar abrir o escribir en el fichero");
        } finally {
            try{
                cerrar();
            } catch (IOException ex) {
                System.out.println("Se produjo un error al intentar cerrar el fichero");
            }
        }
    }


}
