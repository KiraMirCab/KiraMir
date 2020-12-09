
import figuras.Circulo;
import figuras.Triangulo;
import lineas.*;

public class PruebaImportaciones {
    public static void main(String[] args) {
        Circulo c = new Circulo();
        Triangulo t = new Triangulo();
        Recta r = new Recta();
        Curva cur = new Curva();
        
        c.quienSoy();
        t.quienSoy();
        r.quienSoy();
        cur.quienSoy();
    }
}
