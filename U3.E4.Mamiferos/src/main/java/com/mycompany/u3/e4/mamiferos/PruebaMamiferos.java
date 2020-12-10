package com.mycompany.u3.e4.mamiferos;

public class PruebaMamiferos {
    public static void main(String[] args) {
        Mamifero m = new Mamifero();
        Felino f = new Felino();
        Canido c = new Canido();
        Gato g = new Gato();
        Tigre t = new Tigre();
        Perro p = new Perro();
        m.haceRuido();
        f.haceRuido();
        c.haceRuido();
        g.haceRuido();
        t.haceRuido();
        p.haceRuido();
    }
}
