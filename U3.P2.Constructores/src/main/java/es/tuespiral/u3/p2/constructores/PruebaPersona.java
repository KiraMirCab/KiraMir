package es.tuespiral.u3.p2.constructores;

public class PruebaPersona {
    public static void main(String[] args) {
        Persona p = new Persona("Pedro", "López Haro", 25, 180, false);
        
        // Prueba a intentar crear un objeto Persona usando el constructor
        // de siempre: new Persona()
        
        Persona p1 = new Persona("","",0,0,false);
        Persona p2 = new Persona();
        
    }
}
