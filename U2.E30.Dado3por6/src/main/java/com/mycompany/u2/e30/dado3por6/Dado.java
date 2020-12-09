package com.mycompany.u2.e30.dado3por6;

public class Dado {
    public int tirada(){
        int tirada = (int) (Math.random()*6 + 1);
        return tirada;
    }
}
