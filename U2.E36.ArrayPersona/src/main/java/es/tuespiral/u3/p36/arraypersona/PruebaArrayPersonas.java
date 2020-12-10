package es.tuespiral.u3.p36.arraypersona;

public class PruebaArrayPersonas {
    public static void main(String[] args) {
        Persona[] familia = new Persona[4];
        
        Persona padre = new Persona();
        padre.setEdad(43);
        padre.setRol("Padre");
        familia[0] = padre;
        
        Persona madre = new Persona();
        madre.setEdad(40);
        madre.setRol("Madre");
        familia[1] = madre;
        
        familia[2] = new Persona();
        familia[2].setEdad(24);
        familia[2].setRol("Hijo");
        
        familia[3] = new Persona();
        familia[3].setEdad(14);
        familia[3].setRol("Hija");

        System.out.println("La posicion 0 la ocupa el/la "+
                familia[0].getRol()+" con "+familia[0].getEdad()+" años");
        System.out.println("La posicion 1 la ocupa el/la "+
                familia[1].getRol()+" con "+familia[1].getEdad()+" años");
        System.out.println("La posicion 2 la ocupa el/la "+
                familia[2].getRol()+" con "+familia[2].getEdad()+" años");
        System.out.println("La posicion 3 la ocupa el/la "+
                familia[3].getRol()+" con "+familia[3].getEdad()+" años");
        System.out.println("----------------");
        
        for(int i=0; i<=3; i++)
            System.out.println("La posicion "+i+" la ocupa el/la "+
                familia[i].getRol()+" con "+familia[i].getEdad()+" años");
        
        // El niño se va de casa        
        familia[2] = Persona.VACIO; 
        
        for(int i=0; i<=3; i++) {
            if (familia[i].getRol() != null)
                System.out.println("La posicion "+i+" la ocupa el/la "+
                    familia[i].getRol()+" con "+familia[i].getEdad()+" años");
        }
        
        familia[2] = new Persona();
        familia[2].setEdad(80);
        familia[2].setRol("Abuelo");
        
    }
}
