package com.mycompany.u2.e31.candadonumerico;

public class Candado {

    public int numSecreto;

    public void setNumSecreto(int numSecreto) {
        this.numSecreto = numSecreto;
    }

    public boolean intentaAbrir(int num) {
        if (num == numSecreto) {
            return true;
        } else {
            return false;
        }
    }
}
