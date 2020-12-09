
package com.mycompany.bombilla5;

public class Bombilla {
    public String marca;
    public int numVeces;
    public boolean encendida;
    
    public void encender(){
        numVeces++;
        encendida = true;
    }
    public void apagar(){
        encendida = false;
    }
    
    public int obtieneNumVecesEncendida() {
        return numVeces;
        
    }
}
