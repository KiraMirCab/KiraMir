package es.tuespiral.u2.ex.clasificacoches;

public class ClasificadorCoches {
    public int clasificaCoche (Coche c) {
        if (c.isElectrico() || (c.getPotencia() > 150 && c.getAniosAnt() < 3))
            return 1; // Superior
        else {
            if (c.getAniosAnt() >= 3 && c.getAniosAnt() <= 5 && 
                c.getPotencia() > 100 && (c.isAbs() || c.isAirbag()))
                return 2; // Intermedio
            else 
                return 3; // económico
        }
    }
}
