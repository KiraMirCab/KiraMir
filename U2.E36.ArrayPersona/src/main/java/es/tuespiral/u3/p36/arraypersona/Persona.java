package es.tuespiral.u3.p36.arraypersona;

public class Persona {
    public static final Persona VACIO = new Persona ();
    public String rol;
    public int edad;
    
    public String getRol() {
        return rol;
    }

    public void setRol(String rol) {
        this.rol = rol;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }
    
    
}
