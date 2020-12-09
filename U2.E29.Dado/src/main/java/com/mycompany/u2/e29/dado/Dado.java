package com.mycompany.u2.e29.dado;

public class Dado {
    public int tirada(){
        int tirada = (int) (Math.random()*6 + 1);
        return tirada;
    }
}
