package com.mycompany.u2.e37.num_tiradas;

public class NUM_TIRADAS {

    public static void main(String[] args) {
        final int NUM_TIRADAS = 50;
        int[] array = new int[NUM_TIRADAS];
        int unos = 0, doses = 0, treses = 0, cuatros = 0, cincos = 0, seises = 0;

        for (int i = 0; i < array.length; i++) {
            array[i] = (int) (Math.random() * 6 + 1);
            switch (array[i]) {
                case 1:
                    unos++;
                    break;
                case 2:
                    doses++;
                    break;
                case 3:
                    treses++;
                    break;
                case 4:
                    cuatros++;
                    break;
                case 5:
                    cincos++;
                    break;
                case 6:
                    seises++;
                    break;

            }
        }

        int[] resultados = {unos, doses, treses, cuatros, cincos, seises};
        for (int i = resultados.length - 1; i >= 0; i--) {
            System.out.println("El número " + (i + 1) + " ha aparecido " + resultados[i] + " veces");
        }

    }
}
