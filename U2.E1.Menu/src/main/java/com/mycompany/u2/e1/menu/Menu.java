

package com.mycompany.u2.e1.menu;

/**
 * Esta crea menus deliciosos y baratitos, pero abundantes
 * @author Kira
 */
public class Menu {
    /**
     * Representa el primer plato
     */
    public String primerPlato;
    /**
     * Representa el segundo plato
     */
    public String segundoPlato;
    /**
     * Representa el número de calorías del menu
     */
    public int calorias;
    /**
     * Representa el precio del menu
     */
    public double precio;
    /**
     * Metodo para saber el primer plato
     * @return 
     */
    public String getPrimerPlato() {
        return primerPlato;
    }
    /**
     * Método para asignar el segundo plato
     * @param primerPlato 
     */
    public void setPrimerPlato(String primerPlato) {
        this.primerPlato = primerPlato;
    }
    /**
     * Metodo para saber el segundo plato
     * @return devuelve el string del segundo plato
     */
    public String getSegundoPlato() {
        return segundoPlato;
    }
    /**
     * Metodo para asignar el segundo plato
     * @param segundoPlato 
     */
    public void setSegundoPlato(String segundoPlato) {
        this.segundoPlato = segundoPlato;
    }
    /**
     * Metodo para saber calorías del menu
     * @return 
     */
    public int getCalorias() {
        return calorias;
    }
    /**
     * Metodo para asignar calorias
     * @param calorias 
     */
    public void setCalorias(int calorias) {
        this.calorias = calorias;
    }
    /**
     * Metodo para saber el precio del menu
     * @return el precio del menu
     */
    public double getPrecio() {
        return precio;
    }
    /**
     * Metodo para asignar el precio del menu
     * @param precio del menu
     */
    public void setPrecio(double precio) {
        this.precio = precio;
    }
    
    public void imprimeMenu (){
        System.out.printf("%-22s%22s%n", "PRIMER PLATO", "SEGUNDO PLATO");
        System.out.printf("%-22s%22s%n", primerPlato, segundoPlato);
        System.out.println("--------------------------------------------");
        System.out.printf("%-22s%22s%n", "CALORIAS", "PRECIO");
        System.out.printf("%-22d%21.2f€%n", calorias, precio);
    }
    
    
}
