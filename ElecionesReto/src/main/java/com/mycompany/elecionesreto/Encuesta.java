package com.mycompany.elecionesreto;

public class Encuesta {

    private Votante[] arr;
    private boolean inicializada;

    public void inicializarEncuesta(int num) {
        arr = new Votante[num];
        inicializada = true;
    }

    public void rellenarEncuesta() {
        for (int i = 0; i < arr.length; i++) {
            Votante v = new Votante();
            arr[i] = v;
        }
    }

    public void mostrarEncuesta() {
        for (Votante elem : arr) {
            System.out.println(elem);
        }
    }

    public double porcentajeDemocrata(int min, int max) {
        double dem = 0;
        double total = 0;
        for (Votante elem : arr) {
            if (elem.getEdad() >= min && elem.getEdad() <= max) {
                if (elem.getPresidente().equals("Democrata")) {
                    dem++;
                }
                total++;
            }
        }
        return dem * 100 / total;
    }

    
    public double notaMedia(String presidente) {
        double num = 0;
        double total = 0;
        for (Votante elem: arr) {
            if (elem.getPresidente().equals(presidente)) {
                num += elem.getValoracion();
                total++;
            }            
        }
        return num/total;
    }
    
    public double aprobado(String presidente) {
        double num = 0;
        double total = 0;
        for (Votante elem: arr) {
            if (elem.getPresidente().equals(presidente)) {
                if (elem.getValoracion() >= 5) {
                   num++;
                }
                   total++;
            }            
        }
        return num * 100 / total;
    }
    
    public boolean isInicializada() {
        return inicializada;
    }

}
