package es.tuespiral.u3.e38.traduccion;

public class PruebaTraduccion {

    public static void main(String[] args) {
        Traduccion[] diccionario = new Traduccion[5];

        diccionario[0] = new Traduccion();
        diccionario[0].setEnglish("To break down");
        diccionario[0].setSpanish("Averiar");

        Traduccion t = new Traduccion();
        t.setEnglish("To fix");
        t.setSpanish("Arreglar");
        diccionario[1] = t;

        t = new Traduccion();
        t.setEnglish("To reboot");
        t.setSpanish("Reiniciar");
        diccionario[2] = t;

        diccionario[3] = new Traduccion();
        diccionario[3].setEnglish("To work");
        diccionario[3].setSpanish("Funcionar");

        diccionario[4] = new Traduccion();
        diccionario[4].setEnglish("To type");
        diccionario[4].setSpanish("Teclear");
        
        for(Traduccion elem: diccionario) {
            System.out.println(elem.getEnglish()+" en español se traduce por "+elem.getSpanish());
        }
    
    }
}
