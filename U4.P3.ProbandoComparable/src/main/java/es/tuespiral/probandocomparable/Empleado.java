package es.tuespiral.probandocomparable;

public class Empleado implements Comparable {

    private String nombre, apellidos, cargo;
    private double salario;

    public Empleado(String nombre, String apellidos, String cargo, double salario) {
        this.nombre = nombre;
        this.apellidos = apellidos;
        this.cargo = cargo;
        this.salario = salario;
    }

    @Override
    public int compareTo(Object obj) {
        Empleado emp = (Empleado) obj;
        int resultado = (int) (this.salario - emp.getSalario());
        return resultado;
    }
    

    // Consideramos que un elemento A < B 
    // si A.getSalario() < B.getSalario()
//        if (this.salario < emp.getSalario())
//            return -1;
//        else
//            if (this.salario > emp.getSalario())
//                return 1;
//            else 
//                return 0;
// }

public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellidos() {
        return apellidos;
    }

    public void setApellidos(String apellidos) {
        this.apellidos = apellidos;
    }

    public String getCargo() {
        return cargo;
    }

    public void setCargo(String cargo) {
        this.cargo = cargo;
    }

    public double getSalario() {
        return salario;
    }

    public void setSalario(double salario) {
        this.salario = salario;
    }

    @Override
        public String toString() {
        return "Empleado{" + "nombre=" + nombre + ", apellidos=" + apellidos + ", cargo=" + cargo + ", salario=" + salario + '}';
    }
    
    
    
    
}
