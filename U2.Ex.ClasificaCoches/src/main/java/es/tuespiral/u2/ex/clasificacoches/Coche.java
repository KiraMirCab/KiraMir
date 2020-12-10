package es.tuespiral.u2.ex.clasificacoches;

public class Coche {
    public int potencia;
    public int aniosAnt;
    public boolean electrico, abs, airbag;

    public int getPotencia() {
        return potencia;
    }

    public void setPotencia(int potencia) {
        this.potencia = potencia;
    }

    public int getAniosAnt() {
        return aniosAnt;
    }

    public void setAniosAnt(int aniosAnt) {
        this.aniosAnt = aniosAnt;
    }

    public boolean isElectrico() {
        return electrico;
    }

    public void setElectrico(boolean electrico) {
        this.electrico = electrico;
    }

    public boolean isAbs() {
        return abs;
    }

    public void setAbs(boolean abs) {
        this.abs = abs;
    }

    public boolean isAirbag() {
        return airbag;
    }

    public void setAirbag(boolean airbag) {
        this.airbag = airbag;
    }
    
    
}
